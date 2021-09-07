package com.vendas;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class minhaConfiguration {

    @Bean(name="applicationName")
    public String applicationName(){
        return "Sistem de Vendas";
    }
}
