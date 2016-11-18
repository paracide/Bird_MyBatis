package pettest;

import org.apache.ibatis.session.SqlSession;

import dao.IMasterDao;
import entity.Master;
import util.MyBatisUtil;

/** Created by Paracide on 2016/11/18. */
public class Select1 {
  public static void main(String[] args) {
    SqlSession session = MyBatisUtil.getSession();

    IMasterDao dao = session.getMapper(IMasterDao.class);
    Master master = new Master();
    master.setId(1);
    master = dao.getAll(master);
    System.out.println(master);
  }
}
