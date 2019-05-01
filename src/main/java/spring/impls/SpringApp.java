package spring.impls;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        System.out.println("----------------Singleton bean----------------");
        Lyricist lyr1 = context.getBean("LyricistBean1", Lyricist.class);
        System.out.println(lyr1.visit());
        System.out.println(lyr1.hashCode());

        Lyricist lyr2 = context.getBean("LyricistBean1", Lyricist.class);
        System.out.println(lyr2.visit());
        System.out.println(lyr2.hashCode());

        System.out.println("--------------Prototype bean-------------------");

        Lyricist lyr3 = context.getBean("LyricistBean2", Lyricist.class);
        System.out.println(lyr3.visit());
        System.out.println(lyr3.hashCode());

        Lyricist lyr4 = context.getBean("LyricistBean2", Lyricist.class);
        System.out.println(lyr4.visit());
        System.out.println(lyr4.hashCode());

        ((ConfigurableApplicationContext) context).close();
    }
}
