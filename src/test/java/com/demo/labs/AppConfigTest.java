package com.demo.labs;

import com.demo.labs.config.PrototypeBean;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class AppConfigTest {

    @Autowired
    ApplicationContext applicationContext;

    @Test
    void testSingletonBean() {
        Object singleton1 = applicationContext.getBean("aSingletonBean");
        System.out.println(singleton1);

        Object singleton2 = applicationContext.getBean("aSingletonBean");
        System.out.println(singleton2);

        assertSame(singleton1, singleton2, "Singleton beans should be the same instance");
        assertEquals(singleton1.hashCode(), singleton2.hashCode());
    }
/*
    @Test
    void testPrototypeBean() {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        Object prototypeBean1 = ctx.getBean("aPrototypeBean");
        System.out.println(prototypeBean1);

        Object prototypeBean2 = ctx.getBean("aPrototypeBean");
        System.out.println(prototypeBean2);

        assertNotEquals(prototypeBean1.hashCode(), prototypeBean2.hashCode());
    }*/

    @Test
    void testPrototypeBean() {
        PrototypeBean prototypeBean1 = (PrototypeBean) applicationContext.getBean("prototypeBean");
        System.out.println(prototypeBean1);
        System.out.println("prototypeBean1, id = : "+prototypeBean1.getCounter().getId());

        System.out.println("-----------------------------------");

        PrototypeBean prototypeBean2 = (PrototypeBean) applicationContext.getBean("prototypeBean");
        System.out.println(prototypeBean2);
        System.out.println("prototypeBean2, id = : "+prototypeBean2.getCounter().getId());

        assertNotEquals(prototypeBean1.hashCode(), prototypeBean2.hashCode());
        assertNotEquals(prototypeBean1, prototypeBean2);
    }

}