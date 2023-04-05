package com.example.bdd.config;


import com.example.bdd.adapter.BookJpaAdapter;
import com.example.bdd.ports.api.BookServicePort;
import com.example.bdd.ports.spi.BookPersistencePort;
import com.example.bdd.service.BookServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BookConfig {

    @Bean
    public BookPersistencePort bookPersistence(){
        return new BookJpaAdapter();
    }

    @Bean
    public BookServicePort bookService(){
        return new BookServiceImpl(bookPersistence());
    }
}
