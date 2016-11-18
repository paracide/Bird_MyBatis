package entity;

import java.util.List;

/** Created by Paracide on 2016/11/18. */
public class Master {
  private Integer id;
  private String name;
  private List<Pet> pets;

  @Override
  public String toString() {
    return "Master{" + "id=" + id + ", name='" + name + '\'' + ", pets=" + pets + '}';
  }

  public Master() {}

  public Master(Integer id, String name, List<Pet> pets) {

    this.id = id;
    this.name = name;
    this.pets = pets;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<Pet> getPets() {
    return pets;
  }

  public void setPets(List<Pet> pets) {
    this.pets = pets;
  }
}
