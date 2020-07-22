package designPattern.decoratorPattern;

/**
 * @program: exercise
 * @description:
 * @author: Jojo.Lee
 * @create: 2019-08-19 19:49
 **/
public class CondingGirl extends GirlDesc {
    private Girl girl;
    public CondingGirl(Girl girl){
        this.girl = girl;
    }

    @Override
    public String getDesc() {
        return girl.getDesc()+" like coding";
    }
}
