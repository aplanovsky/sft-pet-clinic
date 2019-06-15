package my.springframework.sftpetclinic.services;

import my.springframework.sftpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService {

  Owner findByName(String lastName);
  Owner fingById(Long id);
  Owner save(Owner owner);
  Set<Owner> findAll();

}
