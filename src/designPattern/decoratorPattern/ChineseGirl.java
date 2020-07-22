package designPattern.decoratorPattern;

/**
 * @program: exercise
 * @description:
 * @author: Jojo.Lee
 * @create: 2019-08-19 19:45
 **/
public class ChineseGirl extends Girl {
    @Override
    public String getDesc() {
        return "+Chinese";
    }
}
