package leetcode.sort;

import org.junit.Test;

/**
 * @program: exercise
 * @description:  ÷–¥πÈ≤¢≈≈–Ú
 * @author: Jojo.Lee
 * @create: 2019-07-30 15:30
 **/
public class MergeSort1 {

    public void merge(int [] a,int left,int mid,int right){
        int [] temp = new int[a.length];
        int p1 = left, p2 = mid+1,k = left;

        while(p1<=mid && p2<=right){
            if(a[p1]<=a[p2]){
                temp[k++] = a[p1++];
            }else{
                temp[k++] = a[p2++];
            }
        }

        while(p1<=mid) temp[k++] = a[p1++];
        while(p2<=right) temp[k++] = a[p2++];

        for(int i=left;i<=right;i++){
            a[i] = temp[i];
            System.out.print(a[i]+" ");
        }
        System.out.println("---------");

    }

    public void group(int [] arr,int start,int end){
        if(start<end){
            int mid = (start+end)/2;
            group(arr,start,mid);
            group(arr,mid+1,end);
            merge(arr,start,mid,end);
        }
    }

    @Test
    public void mergesort(){

        int leng = 8;
        int [] array = new int[leng];
        for(int i=0;i<leng;i++){
            array[i] = (int)(Math.random()*100);
        }
        for(int i : array){
            System.out.print(i+" ");
        }
        System.out.println("≈≈–Ú∫Û£∫");
        group(array,0,array.length-1);
        for(int i : array){
            System.out.print(i+" ");
        }
    }
}
