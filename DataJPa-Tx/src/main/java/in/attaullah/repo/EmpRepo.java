package in.attaullah.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.attaullah.entites.Emp;

public interface EmpRepo extends JpaRepository<Emp, Integer> {

}
