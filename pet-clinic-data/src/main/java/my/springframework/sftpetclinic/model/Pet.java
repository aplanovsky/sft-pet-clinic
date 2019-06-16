package my.springframework.sftpetclinic.model;

import java.time.LocalDate;

public class Pet extends BaseEntity{

  private PetData petData;
  private Owner owner;
  private LocalDate birthDate;

  public PetData getPetData() {
    return petData;
  }

  public void setPetData(PetData petData) {
    this.petData = petData;
  }

  public Owner getOwner() {
    return owner;
  }

  public void setOwner(Owner owner) {
    this.owner = owner;
  }

  public LocalDate getBirthDate() {
    return birthDate;
  }

  public void setBirthDate(LocalDate birthDate) {
    this.birthDate = birthDate;
  }
}
