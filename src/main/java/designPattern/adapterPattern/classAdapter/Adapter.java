package designPattern.adapterPattern.classAdapter;

/**
 * @program: exercise
 * @description: ������ģʽ   ��������ģʽ
 * @author: Jojo.Lee
 * @create: 2019-08-19 14:46
 **/
public class Adapter extends Iphone implements Strip {
    @Override
    public void chongdian() {
        super.yongdian();
    }
}
