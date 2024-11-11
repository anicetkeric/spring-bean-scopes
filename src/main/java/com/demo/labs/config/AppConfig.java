package com.demo.labs.config;

import com.demo.labs.model.Book;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.Random;

@Configuration
public class AppConfig {
    private final Random random = new Random();
    private final Integer id = random.nextInt(1000);

    @Bean
    @Scope(value= ConfigurableBeanFactory.SCOPE_SINGLETON)
    public Book aSingletonBean() {
        return new Book();
    }

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Book aPrototypeBean() {
        return new Book(id);
    }

}
