package test;

import org.apache.ibatis.session.SqlSession;

import java.util.HashMap;
import java.util.List;

import dao.IAnimalDao;
import entity.Animal;
import util.MyBatisUtil;

/** Created by Paracide on 2016/11/17. */
public class Select4 {

  public static void main(String[] args) {
    SqlSession session = MyBatisUtil.getSession();
    try {
      IAnimalDao dao = session.getMapper(IAnimalDao.class);

      HashMap<String, Integer> map = new HashMap();
      map.put("pageNo", 1);
      map.put("pageSize", 3);
      List<Animal> list = dao.getAllByPage(map);
      for (Animal animal : list) {
        System.out.println(animal);
      }

      Animal animal = dao.getCount();
      System.out.println(animal.getId());
    } finally {
      session.close();
    }
  }
}
