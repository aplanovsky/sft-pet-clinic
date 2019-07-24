package my.springframework.sftpetclinic.repositories;

import my.springframework.sftpetclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner, Long> {

  Owner findByLastName(String lastName);
}
