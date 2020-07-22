package dataStructure.sort;

import org.junit.Test;

/**
 * @program: exercise
 * @description: test
 * @author: Jojo.Lee
 * @create: 2019-08-11 21:42
 **/
public class SortTest {

    int [] array = {4,6,7,8,1,9,20,29,58,1,4};

    public void printArray(int [] array){
        for(int i: array){
            System.out.print(i+" ");
        }
        System.out.println();
    }

    @Test
    public void test(){
        //SelectionSort sort = new SelectionSort();
        //BubbleSort sort = new BubbleSort();
        //InsertionSort sort = new InsertionSort();
        //MegerSort sort = new MegerSort();
        //QuickSort sort = new QuickSort();
        ShellSort sort = new ShellSort();

        sort.sort(array);
        printArray(array);
    }
}
