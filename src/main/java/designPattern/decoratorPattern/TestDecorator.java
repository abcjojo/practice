package designPattern.decoratorPattern;

/**
 * @program: exercise
 * @description:
 * @author: Jojo.Lee
 * @create: 2019-08-19 19:58
 **/
public class TestDecorator {
    public static void main(String[] args) {
        AmericaGirl g1 = new AmericaGirl();
        System.out.println(g1.getDesc());

        ChineseGirl g2 = new ChineseGirl();
        System.out.println(g2.getDesc());

        CondingGirl g3 = new CondingGirl(g2);
        System.out.println(g3.getDesc());

        ArtGirl g4 = new ArtGirl(g3);
        System.out.println(g4.getDesc());
    }
}
