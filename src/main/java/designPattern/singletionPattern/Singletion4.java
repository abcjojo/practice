package designPattern.singletionPattern;

/**
 * @program: exercise
 * @description: Ë«ÖØ¼ì²éËø¶¨°æ
 * @author: Jojo.Lee
 * @create: 2019-08-19 14:07
 **/
public class Singletion4 {
    private static volatile Singletion4 sgt;
    private Singletion4(){}
    public static synchronized Singletion4 getInstance(){
        if (sgt == null){
            sgt = new Singletion4();
        }
        return sgt;
    }
}
