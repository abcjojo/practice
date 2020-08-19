package leetcode.sort;

/**
 * @program: exercise
 * @description: Ï£¶ûÅÅĞò
 * @author: Jojo.Lee
 * @create: 2019-08-16 11:06
 **/
public class ShellSort {
     public void sort(int [] array){
         int leng = array.length;
         int gap = leng/2;
         while (gap>0){
             for(int j=gap; j<leng; j++){
                 int i=j;
                 while(i>=gap && array[i]<array[i-gap]){
                     int temp = array[i];
                     array[i] = array[i-gap];
                     array[i-gap] = temp;
                     i -= gap;
                 }
             }
             gap = gap/2;
         }
     }
}
