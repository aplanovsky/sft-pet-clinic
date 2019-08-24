package my.springframework.sftpetclinic.repositories;

import my.springframework.sftpetclinic.model.Vet;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by jt on 8/5/18.
 */
public interface VetRepository extends CrudRepository<Vet, Long> {
}
