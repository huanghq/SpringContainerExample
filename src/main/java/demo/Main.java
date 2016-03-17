package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main{
     public static void main(String[] args) {
          ApplicationContext context= new ClassPathXmlApplicationContext("manifest.xml");
          Mobile mobile = (Mobile) context.getBean("mobile1");
          System.out.println("************************");
          mobile.poweron();
    }
}
