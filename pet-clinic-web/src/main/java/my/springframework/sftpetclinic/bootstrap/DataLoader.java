package my.springframework.sftpetclinic.bootstrap;

import my.springframework.sftpetclinic.model.Owner;
import my.springframework.sftpetclinic.model.Pet;
import my.springframework.sftpetclinic.model.PetType;
import my.springframework.sftpetclinic.model.Vet;
import my.springframework.sftpetclinic.services.OwnerService;
import my.springframework.sftpetclinic.services.PetTypeService;
import my.springframework.sftpetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {

  private final OwnerService ownerService;
  private final VetService vetService;
  private final PetTypeService petTypeService;


  public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
    this.ownerService = ownerService;
    this.vetService = vetService;
    this.petTypeService = petTypeService;
  }



  @Override
  public void run(String... args) throws Exception {


    PetType dog = new PetType();
    dog.setName("Dog");
    PetType sevedDogPetType = petTypeService.save(dog);


    PetType cat = new PetType();
    cat.setName("Cat");
    PetType sevedCatPetType = petTypeService.save(cat);

    Owner owner1 = new Owner();
    owner1.setFirstName("Michael");
    owner1.setLastName("Weston");
    owner1.setAddress("SomeHome SomeStreet");
    owner1.setCity("SomeCity");
    owner1.setTelephone("SomePhone");

    Pet makesPet = new Pet();
    makesPet.setPetType(sevedDogPetType);
    makesPet.setOwner(owner1);
    makesPet.setBirthDate(LocalDate.now());
    makesPet.setName("Rosco");
    owner1.getPets().add(makesPet);
    ownerService.save(owner1);

    Owner owner2 = new Owner();
    owner2.setFirstName("Fiona");
    owner2.setLastName("Glenanne");
    owner2.setAddress("SomeHome SomeStreet");
    owner2.setCity("SomeCity");
    owner2.setTelephone("SomePhone");

    Pet fionasCat = new Pet();
    fionasCat.setName("Just Cat");
    fionasCat.setOwner(owner2);
    fionasCat.setBirthDate(LocalDate.now());
    fionasCat.setPetType(sevedCatPetType);
    owner2.getPets().add(fionasCat);

    ownerService.save(owner2);

    System.out.println("Loaded Owners ...");

    Vet vet1 = new Vet();
    vet1.setFirstName("Sam");
    vet1.setLastName("Axe");

    vetService.save(vet1);


    Vet vet2 = new Vet();
    vet2.setFirstName("Jessie");
    vet2.setLastName("Porter");

    vetService.save(vet2);

    System.out.println("Loaded Vets ...");
  }
}
