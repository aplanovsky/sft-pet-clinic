package my.springframework.sftpetclinic.repositories;

import my.springframework.sftpetclinic.model.Speciality;
import org.springframework.data.repository.CrudRepository;

public interface SpecialtyRepository extends CrudRepository<Speciality, Long > {
}
