package entity;

import java.io.Serializable;

/** Created by Paracide on 2016/11/17. */
public class Animal implements Serializable {
  private Integer id;

  private String name;

  @Override
  public String toString() {
    return "Animal{" + "id=" + id + ", name='" + name + '\'' + '}';
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

  public Animal() {}

  public Animal(String name) {
    this.name = name;
  }
}
