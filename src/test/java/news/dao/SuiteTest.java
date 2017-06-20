package news.dao;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * 测试套件，可以同时运行所有测试类，不需要一个个运行
 * Created by Administrator on 2017/6/20.
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({NewsDaoTest.class,UserDaoTest.class})
public class SuiteTest {
}
