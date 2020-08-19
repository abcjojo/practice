package TheDoubleChromospherePlan;

import org.junit.Test;

import java.util.*;

/**
 * @program: exercise
 * @description:
 * @author: Jojo.Lee
 * @create: 2020-05-12 10:28
 **/

public class RandomDoubleBall {

   @Test
    public void test(){
       randomBall();
       randomBall();

   }
   private void randomBall(){
       int blue;
       Set<Integer> red = new HashSet<>();
       while (red.size() < 6){
           red.add((int)(Math.random()*33+1));
       }
       blue = (int)(Math.random()*16+1);

       List<Integer> list = new ArrayList<Integer>();
       for(Integer value : red) list.add(value);
       Collections.sort(list);

       System.out.print("∫Ï«Ú£∫"+ list +"     ");
       System.out.println("¿∫«Ú£∫"+blue);
       System.out.println();
   }

}
