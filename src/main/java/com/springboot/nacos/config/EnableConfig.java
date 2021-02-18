package com.springboot.nacos.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EnableConfig<T> {


    @Bean
    public Marker enableConfig(){
        return new Marker();
    }

    class Marker{

    }

}
