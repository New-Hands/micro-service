package cn.lstfight.dubboprovider.provider;

import cn.lstfight.dubboapi.HelloService;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 尽可能多的确定下属性
 */
@Service(interfaceClass = HelloService.class,version = "1.0.1",retries = 2,loadbalance = "random")
@Component
public class HelloService2Impl implements HelloService {

    @Value("${spring.dubbo.protocol.port}")
    private String port;

    @Override
    public String sayHello(String name) {
        System.out.println(port);
        return "你好："+name;
    }
}
