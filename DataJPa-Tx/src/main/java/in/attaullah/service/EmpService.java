package in.attaullah.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.attaullah.entites.Address;
import in.attaullah.entites.Emp;
import in.attaullah.repo.AddrRepo;
import in.attaullah.repo.EmpRepo;
import jakarta.transaction.Transactional;

@Service
public class EmpService {
	
	@Autowired
	private EmpRepo empRepo;
	
	@Autowired
	private AddrRepo addrRepo;
	
	@Transactional(rollbackOn=Exception.class)
	public void saveData() {
		
		Emp emp = new Emp("Steve", 5500.00);
		
		empRepo.save(emp);
		
		//emp = empRepo.saveAndFlush(emp);
		
		//int i = 10/0;
		
		Address addr = new Address("GNT", "AP", "India", emp.getEmpId());
		
		addrRepo.save(addr);
	}
}
