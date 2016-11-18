package dao;

import entity.Master;
import entity.Pet;

/** Created by Paracide on 2016/11/18. */
public interface IMasterDao {

  public Master getAll(Master master);

  public Pet getMaster(Pet pet);
}
