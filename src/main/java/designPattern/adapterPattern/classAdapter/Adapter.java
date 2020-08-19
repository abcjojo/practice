package designPattern.adapterPattern.classAdapter;

/**
 * @program: exercise
 * @description: 适配器模式   类适配器模式
 * @author: Jojo.Lee
 * @create: 2019-08-19 14:46
 **/
public class Adapter extends Iphone implements Strip {
    @Override
    public void chongdian() {
        super.yongdian();
    }
}
