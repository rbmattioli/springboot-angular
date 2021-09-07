package com.vendas;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CadastroclienteApplication {

    @Value("${application.name}")
    private String apllicationName;

    public static void main(String[] args) {

        SpringApplication.run(CadastroclienteApplication.class,args);
    }

}
