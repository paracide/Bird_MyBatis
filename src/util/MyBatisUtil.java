package util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.Reader;

/** Created by Paracide on 2016/11/17. */
public class MyBatisUtil {
  private static SqlSessionFactory sqlSessionFactory;
  private static Reader reader;

  static {
    try {
      reader = Resources.getResourceAsReader("Configuration.xml");
      sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public static SqlSession getSession() {
    return sqlSessionFactory.openSession();
  }
}
