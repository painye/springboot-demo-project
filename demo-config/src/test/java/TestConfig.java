/**
 * @author pan
 * @date 2022/3/17 19:46
 */

import com.yp.springboot.config.SpringConfig;
import com.yp.springboot.vo.Cat;
import com.yp.springboot.vo.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName : PACKAGE_NAME.TestConfig
 * @Description : 类描述
 * @author pan
 * @date 2022/3/17 19:46
 */
public class TestConfig {

    /**
     */
    @Test
    public void test01(){
        String config = "applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(config);
        Student student = (Student) applicationContext.getBean("myStudent");
        System.out.println(student);
    }

    @Test
    public void test02(){
        //没有xml文件，使用了config类来代替了xml文件
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        Student student = (Student) applicationContext.getBean("createStudent");
        System.out.println(student);
    }

    @Test
    public void test03(){
        //没有xml文件，使用了config类来代替了xml文件
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        Student student = (Student) applicationContext.getBean("student");
        System.out.println(student);
    }

    @Test
    public void test04(){
        //没有xml文件，使用了config类来代替了xml文件
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        Cat cat = (Cat) applicationContext.getBean("cat");
        System.out.println(cat);
    }
}
