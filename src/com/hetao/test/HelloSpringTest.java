package com.hetao.test;

import com.hetao.entity.HelloWorld;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @description:
 * @author: hetao
 * @create: 2020-01-13 17:15
 **/
public class HelloSpringTest {

    public static void main(String[] args) {
        System.out.println("spring开始");
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        HelloWorld hello = (HelloWorld) context.getBean("helloBean");
        hello.sqyHello();
        System.out.println("spring结束");
    }
}
