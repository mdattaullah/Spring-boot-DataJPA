package com.data.jpa.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.data.jpa.model.School;
import com.data.jpa.repo.SchoolRepo;

@Service
public class SchoolService {
	
	@Autowired
	private SchoolRepo schoolRepo;
	
	
	public void getSchools() {
		List <School> gets=schoolRepo.findAll(Sort.by("rollNo").descending());
		gets.forEach(records -> {
		System.out.println(records);
		});
	}
	
	public void saveSchools() {
		School entity=new School(2, 56, "Md", "Khan");
		School entity1=new School(3, 57, "Khan", "Aminul");
		School entity2=new School(4, 58, "Attaullah", "Hussain");
		School entity3=new School(5, 59, "Shahid", "Khan");
		School entity4=new School(6, 60, "Imran", "Khan");
		
		schoolRepo.saveAll(Arrays.asList(entity,entity1,entity2,entity3, entity4));
	}
	
	

}
