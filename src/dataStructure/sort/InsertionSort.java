package dataStructure.sort;

/**
 * @program: exercise
 * @description: ≤Â»Î≈≈–Ú
 * @author: Jojo.Lee
 * @create: 2019-08-11 22:45
 **/
public class InsertionSort {
    public void sort(int [] array){
        for(int i=0; i<array.length-1; i++){
            int j=i+1;
            int temp = array[j];
            if (temp>array[i]) continue;
            while (j>0 && temp<=array[j-1]){
                array[j] = array[j-1];
                j--;
            }
            array[j] = temp;
        }
    }
}
