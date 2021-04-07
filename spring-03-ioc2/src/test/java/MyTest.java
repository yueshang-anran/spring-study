import com.kuang.pojo.User;
import com.kuang.pojo.UserT;
import org.jcp.xml.dsig.internal.dom.ApacheOctetStreamData;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 书
 * @date 2021/3/29 - 19:12
 */
public class MyTest {
    @Test
    public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        User user = (User) context.getBean("user");
        user.show();
    }

    @Test
    public void test2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserT userT = (UserT) context.getBean("t3");
//        userT.show();
    }
}
