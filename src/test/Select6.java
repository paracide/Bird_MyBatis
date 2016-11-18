package test;

import org.apache.ibatis.session.SqlSession;

import dao.IAnimalDao;
import entity.Animal;
import util.MyBatisUtil;

/** Created by Paracide on 2016/11/18. */
public class Select6 {
  public static void main(String[] args) {
    SqlSession session = MyBatisUtil.getSession();
    IAnimalDao dao = session.getMapper(IAnimalDao.class);

    Animal animal = new Animal("air");
    // animal.setId(1);
    animal = dao.getAnimal2(animal);
    System.out.println(animal);
  }
}
