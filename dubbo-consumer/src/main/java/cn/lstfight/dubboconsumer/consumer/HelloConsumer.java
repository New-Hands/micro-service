package cn.lstfight.dubboconsumer.consumer;

import cn.lstfight.dubboapi.HelloService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Component;

@Component("helloConsumer")
public class HelloConsumer {
    @Reference(version = "1.0.1")
    HelloService helloService;

    public String getHello(String name) {
        return helloService.sayHello(name);
    }
}
