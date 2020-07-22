package leetcode.ArraySort;

import org.junit.Test;

//912. ÅÅĞòÊı×é
public class ArraySort {
    @Test
    public void test(){
        int m[]={1,2,5,8,6},n=0;
        sortArray(m);
        for(int i=0;i<m.length;i++){
            System.out.print(m[i]+"  ");
        }
    }
    private void swap(int [] a, int i){
        a[i]   = a[i]+a[i+1];
        a[i+1] = a[i]-a[i+1];
        a[i]   = a[i]-a[i+1];
    }
    public int[] sortArray(int[] nums) {
        int end = nums.length-1;
        while(end>0){
            boolean exchange = false;
            for(int i = 0;i<end;i++){
                if(nums[i]>nums[i+1]){
                    System.out.println(nums[i]+" "+nums[i+1]);
                    swap(nums,i);
                    System.out.println(nums[i]+" "+nums[i+1]);
                    exchange = true;
                }
            }
            if(exchange == false){
                return nums;
            }
            end --;
        }
        return nums;
    }
}
