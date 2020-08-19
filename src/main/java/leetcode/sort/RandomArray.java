package leetcode.sort;

/**
 * @program: exercise
 * @description: 构造器传入数组长度，生成指定长度随机数组
 * @author: Jojo.Lee
 * @create: 2019-08-08 09:23
 **/
public class RandomArray {

    int leng;

    public RandomArray(int leng){
        this.leng = leng;
    }

    public int [] generateArray(){
        int [] array = new int[leng];
        for (int i=0; i<leng; i++){
            array [i] = (int)(Math.random()*100);
        }
        System.out.println();
        return array;
    }

    public void arrayToString(int [] array){
        for (int i : array){
            System.out.print(i + " ");
        }
        System.out.println();
    }

}
