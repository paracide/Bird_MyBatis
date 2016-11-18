package test;

import org.apache.ibatis.session.SqlSession;

import dao.IAnimalDao;
import entity.Animal;
import util.MyBatisUtil;

/** Created by Paracide on 2016/11/17. */
public class Select2 {
  public static void main(String[] args) {
    SqlSession session = MyBatisUtil.getSession();
    IAnimalDao dao = session.getMapper(IAnimalDao.class);

    Animal animal = new Animal();
    animal.setId(1);
    animal = dao.getOneById(animal);
    System.out.println(animal);

    session.close();
  }
}
