package designPattern.decoratorPattern;

/**
 * @program: exercise
 * @description:
 * @author: Jojo.Lee
 * @create: 2019-08-19 19:53
 **/
public class ArtGirl extends Girl {
    private Girl girl;
    public ArtGirl(Girl girl){
        this.girl = girl;
    }

    @Override
    public String getDesc() {
        return girl.getDesc()+" like art";
    }
}
