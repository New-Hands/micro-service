package cn.lstfight.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MicroServiceApplication {

    public static void main(String[] args) {
        //扫描入口是MicroServiceApplication.class会扫描到@SpringBootApplication注解
        SpringApplication.run(MicroServiceApplication.class, args);
    }

}
