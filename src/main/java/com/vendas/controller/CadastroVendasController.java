package com.vendas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CadastroVendasController {

    @Autowired
    @Qualifier("applicationName")
    private String applicationName;


    @GetMapping("/hello")
    public String helloWord(){
        return applicationName;
    }

}
