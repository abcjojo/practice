package designPattern.factoryPattern.simpleFactoryPattern;

/**
 * @program: exercise
 * @description: B工厂，继承IFactory接口
 * @author: Jojo.Lee
 * @create: 2019-08-19 19:15
 **/
public class FactoryB implements IFactory{
    @Override
    public void saleProdeuct() {
        System.out.println("B工厂生产b产品");
    }
}
