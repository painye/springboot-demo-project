package com.yp.springboot.config;
/**
 * @author pan
 * @date 2022/3/17 19:51
 */

import com.yp.springboot.vo.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * @ClassName : com.yp.springboot.config.SpringConfug
 * @Description : 类描述
 * @author pan
 * @date 2022/3/17 19:51
 */
@Configuration
@ImportResource(value = "classpath:beans.xml")
public class SpringConfig {

    /**
     * 定义方法：
     * 方法的返回值是 对象
     * @Bean 表示把对象注入到容器之中
     * 位置：方法的是上面
     * @Bean 没有使用属性时，默认对象名称是方法名
     */

    @Bean
    public Student createStudent(){
        Student student = new Student();
        student.setAge(22);
        student.setName("张大炮");
        return  student;
    }

    @Bean(name="student")
    public Student makeStudent(){
        Student student = new Student();
        student.setAge(23);
        student.setName("张二炮");
        return  student;
    }
}
