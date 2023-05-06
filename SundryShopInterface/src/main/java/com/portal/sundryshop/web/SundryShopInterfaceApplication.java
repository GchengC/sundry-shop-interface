package com.portal.sundryshop.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@RequestMapping(path = "/sundryshop")
public class SundryShopInterfaceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SundryShopInterfaceApplication.class, args);
    }

}
