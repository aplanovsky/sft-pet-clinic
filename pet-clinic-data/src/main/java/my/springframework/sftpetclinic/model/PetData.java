package my.springframework.sftpetclinic.model;

public class PetData extends BaseEntity {

  private String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
