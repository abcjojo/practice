package designPattern.factoryPattern.simpleFactoryPattern;

/**
 * @program: exercise
 * @description: 测试类，即客户类
 * @author: Jojo.Lee
 * @create: 2019-08-19 19:23
 **/
public class TestFactory {
    public static void main(String[] args) {
        new Product().getInstance(1).saleProdeuct();
        new Product().getInstance(2).saleProdeuct();
    }
}
