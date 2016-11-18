package test;

import org.apache.ibatis.session.SqlSession;

import java.util.HashMap;

import dao.IAnimalDao;
import entity.Animal;
import util.MyBatisUtil;

/** Created by Paracide on 2016/11/17. */
public class Select3 {
  public static void main(String[] args) {
    SqlSession session = MyBatisUtil.getSession();
    IAnimalDao dao = session.getMapper(IAnimalDao.class);

    HashMap<String, Integer> map = new HashMap();
    map.put("mykey", 1);
    Animal animal = dao.getOneByMap(map);
    System.out.println(animal);
    session.close();
  }
}
