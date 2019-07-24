package my.springframework.sftpetclinic.repositories;

import my.springframework.sftpetclinic.model.Vet;
import org.springframework.data.repository.CrudRepository;

public interface VetRepository extends CrudRepository<Vet, Long> {
}
