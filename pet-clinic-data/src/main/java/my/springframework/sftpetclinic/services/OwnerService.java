package my.springframework.sftpetclinic.services;

import my.springframework.sftpetclinic.model.Owner;


public interface OwnerService extends CrudService<Owner, Long> {

  Owner findByLastName(String lastName);


}
