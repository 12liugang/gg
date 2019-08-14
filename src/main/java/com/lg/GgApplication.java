package com.lg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

@SpringBootApplication
public class GgApplication {

    public static void main(String[] args) {
        SpringApplication.run(GgApplication.class, args);
    }

}
