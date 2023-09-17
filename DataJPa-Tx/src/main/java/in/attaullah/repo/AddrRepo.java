package in.attaullah.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.attaullah.entites.Address;

public interface AddrRepo extends JpaRepository<Address, Integer> {

}
