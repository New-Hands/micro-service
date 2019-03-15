package cn.lstfight.dubboprovider.provider;

import cn.lstfight.dubboapi.HelloService;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

/**
 * @author 李尚庭
 * @date 2019-3-15
 */
@Service(interfaceClass = HelloService.class,version = "1.0.0")
@Component
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String name) {
        return "my name is "+name;
    }
}
