package my.springframework.sftpetclinic.repositories;

import my.springframework.sftpetclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
