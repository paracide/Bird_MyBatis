package test;

import org.apache.ibatis.session.SqlSession;

import java.util.List;

import dao.IAnimalDao;
import entity.Animal;
import util.MyBatisUtil;

/** Created by Paracide on 2016/11/17. */
public class Select1 {
  public static void main(String[] args) {
    SqlSession session = MyBatisUtil.getSession();
    IAnimalDao dao = session.getMapper(IAnimalDao.class);
    List<Animal> list = dao.getAll();
    for (Animal animal : list) {
      System.out.println(animal);
    }
    session.close();
  }
}
