package my.springframework.sftpetclinic.services;

import my.springframework.sftpetclinic.model.Pet;

import java.util.Set;

public interface PetService {
  Pet fingById(Long id);
  Pet save(Pet pet);
  Set<Pet> findAll();

}
