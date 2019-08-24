package my.springframework.sftpetclinic.repositories;

import my.springframework.sftpetclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by jt on 8/5/18.
 */
public interface OwnerRepository extends CrudRepository<Owner, Long> {

    Owner findByLastName(String lastName);

    List<Owner> findAllByLastNameLike(String lastName);
}
