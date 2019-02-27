package cn.lstfight.dubboapi;

/**
 * @author 李尚庭
 * @date 2019-2-27
 */
public interface HelloService {

    /**
     * <p>打招呼</p>
     *
     * @param name 名字
     * @return 问候语
     */
    String sayHello(String name);
}
