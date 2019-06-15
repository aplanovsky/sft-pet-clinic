package my.springframework.sftpetclinic.services;

import my.springframework.sftpetclinic.model.Vet;

import java.util.Set;

public interface VetService {
  Vet fingById(Long id);
  Vet save(Vet vet);
  Set<Vet> findAll();
}
