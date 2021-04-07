import com.kuang.dao.UserDaoImpl;
import com.kuang.dao.UserDaoMysqlImpl;
import com.kuang.dao.UserDaoOracleImpl;
import com.kuang.service.UserService;
import com.kuang.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 书
 * @date 2021/3/23 - 11:04
 */
public class MyTest {
    public static void main(String[] args) {
        // 之前代码
        //用户实际调用的是业务层，dao层他们不需要调用

        UserService userService = new UserServiceImpl();
        ((UserServiceImpl)userService).setUserDao(new UserDaoOracleImpl());
        userService.getUser();

        // Spring改进后的代码
        // 获取ApplicationContext：拿到Spring的容器
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");

        //容器在手，天下我有，需要什么，就直接get什么
//        UserServiceImpl userServiceImpl = (UserServiceImpl)applicationContext.getBean("UserServiceImpl");

//        userServiceImpl.getUser();
    }
}
