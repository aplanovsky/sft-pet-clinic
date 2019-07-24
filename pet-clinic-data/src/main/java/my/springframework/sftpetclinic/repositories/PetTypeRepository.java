package my.springframework.sftpetclinic.repositories;

import my.springframework.sftpetclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
