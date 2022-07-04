package com.pelinhangisi.productservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

//jdk8 versiyonda mongodb configuration için gerekli kısım
@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class ProductServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProductServiceApplication.class, args);
    }

}
