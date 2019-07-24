package my.springframework.sftpetclinic.repositories;

import my.springframework.sftpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
