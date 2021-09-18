package com.jojoldu.webservice.web;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@AllArgsConstructor
public class WebRestController {


    @GetMapping("/hello")
    public String hello() {
        return "HelloWorld";
    }
}
