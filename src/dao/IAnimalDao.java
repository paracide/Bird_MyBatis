package dao;

import java.util.List;
import java.util.Map;

import entity.Animal;

/** Created by Paracide on 2016/11/17. */
public interface IAnimalDao {
  int save(Animal animal);

  int delete(Animal animal);

  List<Animal> getAll();

  Animal getOneById(Animal animal);

  Animal getOneByMap(Map params);

  List<Animal> getAllByPage(Map params);

  Animal getCount();

  List<Animal> getAnimal(Animal animal);

  Animal getAnimal2(Animal animal);
}
