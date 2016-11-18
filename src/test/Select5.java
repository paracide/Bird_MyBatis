package test;

import org.apache.ibatis.session.SqlSession;

import java.util.List;

import dao.IAnimalDao;
import entity.Animal;
import util.MyBatisUtil;

/** Created by Paracide on 2016/11/18. */
public class Select5 {
  public static void main(String[] args) {
    SqlSession session = MyBatisUtil.getSession();
    IAnimalDao dao = session.getMapper(IAnimalDao.class);

    Animal animal = new Animal();
    animal.setId(3);
    List<Animal> list = dao.getAnimal(animal);
    for (Animal an : list) {
      System.out.println(an);
    }
  }
}
