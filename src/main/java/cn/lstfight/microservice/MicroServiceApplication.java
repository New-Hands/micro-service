package cn.lstfight.microservice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author 李尚庭
 * @date 2019-2-27
 */
@SpringBootApplication
public class MicroServiceApplication implements CommandLineRunner {

    public static void main(String[] args) {
        //扫描入口是MicroServiceApplication.class会扫描到@SpringBootApplication注解
        SpringApplication.run(MicroServiceApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

    }
}
