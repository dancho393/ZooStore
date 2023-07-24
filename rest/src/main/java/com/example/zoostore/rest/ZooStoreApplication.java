package com.example.zoostore.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan(basePackages = {"com.example.zoostore"})
@EntityScan(basePackages = {"com.example.zoostore.persistence.entities"})
@EnableJpaRepositories(basePackages = {"com.example.zoostore.persistence.repositories"})
@SpringBootApplication
@EnableFeignClients(basePackages = {"com.example.zoostore"})
public class ZooStoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZooStoreApplication.class, args);
    }

}
