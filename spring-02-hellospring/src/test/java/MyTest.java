import com.kuang.pojo.Hello;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 书
 * @date 2021/3/26 - 21:03
 */
public class MyTest {
    @Test
    public void test1(){
        ApplicationContext context = new  ClassPathXmlApplicationContext("beans.xml");
        Hello hello =(Hello) context.getBean("hello");
        System.out.println(hello);
    }
}
