package designPattern.adapterPattern.objectAdapter;

/**
 * @program: exercise
 * @description: 对象适配器模式
 * @author: Jojo.Lee
 * @create: 2019-08-19 15:02
 **/
public class Adapter extends Iphone {
    Strip strip = new Strip();

    @Override
    public void yongdian() {
        super.yongdian();
        strip.chongdian();
    }
}
