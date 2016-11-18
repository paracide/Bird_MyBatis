package entity;

/** Created by Paracide on 2016/11/18. */
public class Pet {
  private Integer petid;
  private String petname;
  private Master master;

  @Override
  public String toString() {
    return "Pet{" + "petid=" + petid + ", petname='" + petname + '\'' + '}';
  }

  public Pet() {}

  public Pet(Integer petid, String petname, Master master) {

    this.petid = petid;
    this.petname = petname;
    this.master = master;
  }

  public Integer getPetid() {
    return petid;
  }

  public void setPetid(Integer petid) {
    this.petid = petid;
  }

  public String getPetname() {
    return petname;
  }

  public void setPetname(String petname) {
    this.petname = petname;
  }

  public Master getMaster() {
    return master;
  }

  public void setMaster(Master master) {
    this.master = master;
  }
}
