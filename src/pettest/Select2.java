package pettest;

import org.apache.ibatis.session.SqlSession;

import dao.IMasterDao;
import entity.Pet;
import util.MyBatisUtil;

/** Created by Paracide on 2016/11/18. */
public class Select2 {
  public static void main(String[] args) {
    SqlSession session = MyBatisUtil.getSession();
    IMasterDao dao = session.getMapper(IMasterDao.class);
    Pet pet = new Pet();
    pet.setPetid(3);
    pet = dao.getMaster(pet);
    System.out.println(pet.getMaster().getId() + " " + pet.getMaster().getName());
  }
}
