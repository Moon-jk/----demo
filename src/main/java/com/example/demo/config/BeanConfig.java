package com.example.demo.config;

import java.util.Random;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

import com.example.demo.Game;
import com.example.demo.Movie;
import com.example.demo.Music;

@Configuration
@ImportResource("classpath:application.xml")
@ComponentScan(basePackages = "com.example.demo")
@ComponentScan(basePackageClasses = BeanConfig.class)


public class BeanConfig {
    @Bean
    public String bean1() {
        return new String("Bean1");
    }

    @Bean
    public Random bean2() {
        return new Random();
    }

    @Bean
    public Game game() {
        return new Game();
    }

    @Bean
    public Movie movie() {
        return new Movie();
    }

    public Music music() {
        return new Music();
        }
        

}
