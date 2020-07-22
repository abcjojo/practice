package designPattern.factoryPattern.simpleFactoryPattern;

/**
 * @program: exercise
 * @description: ��Ʒ�࣬����ʵ����������A��B
 * @author: Jojo.Lee
 * @create: 2019-08-19 19:19
 **/
public class Product {
    public IFactory getInstance(int n){
        switch (n){
            case 1 : return new FactoryA();
            case 2 : return new FactoryB();
            default : return null;
        }
    }
}
