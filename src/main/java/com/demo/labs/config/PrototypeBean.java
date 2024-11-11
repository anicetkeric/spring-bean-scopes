package com.demo.labs.config;

import com.demo.labs.model.Book;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
@Scope(value= ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class PrototypeBean {
    private final Random random = new Random();
    private final Integer id = random.nextInt(1000);

    public Book getCounter() {
        return new Book(id);
    }
}
