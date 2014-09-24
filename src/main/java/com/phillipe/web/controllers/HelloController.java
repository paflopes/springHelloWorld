package com.phillipe.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping
public class HelloController {

    /*Captura a url '/hello'. */
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String helloWorldMethod(ModelMap model) {

    /*
    Adicionamos um atributo com nome 'message'.
    Poderemos acessar esse atributo na página depois.
    Note que no lugar de "Hello World!" também podemos colocar qualquer objeto!.
    */
        model.addAttribute("message", "Hello World!");
        return "hello";
    }
}
