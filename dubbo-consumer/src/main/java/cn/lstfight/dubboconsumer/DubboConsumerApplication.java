package cn.lstfight.dubboconsumer;


import cn.lstfight.dubboconsumer.consumer.HelloConsumer;
import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
@EnableDubboConfiguration
public class DubboConsumerApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(DubboConsumerApplication.class, args);
        HelloConsumer bean = run.getBean("helloConsumer",HelloConsumer.class);
        for (int i = 0; i < 20; i++) {
            System.out.println(bean.getHello("sl"));
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
