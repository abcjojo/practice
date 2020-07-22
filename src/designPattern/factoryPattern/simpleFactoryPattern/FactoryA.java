package designPattern.factoryPattern.simpleFactoryPattern;

/**
 * @program: exercise
 * @description: A工厂，继承工厂接口
 * @author: Jojo.Lee
 * @create: 2019-08-19 19:14
 **/
public class FactoryA implements IFactory{
    @Override
    public void saleProdeuct() {
        System.out.println("A工厂成产a产品");
    }
}
