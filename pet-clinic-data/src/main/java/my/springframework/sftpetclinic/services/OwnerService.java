package my.springframework.sftpetclinic.services;

import my.springframework.sftpetclinic.model.Owner;

import java.util.List;


public interface OwnerService extends CrudService<Owner, Long> {

  Owner findByLastName(String lastName);

  List<Owner> findAllByLastNameLike(String lastName);
}
