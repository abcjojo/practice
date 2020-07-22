package leetcode.sort;

import org.junit.Test;

/**
 * @program: exercise
 * @description:  ÷–¥πÈ≤¢2
 * @author: Jojo.Lee
 * @create: 2019-07-30 17:05
 **/
public class MergeSort2 {

    public void merge(int [] a,int left,int mid,int right){
        int [] tem = new int[a.length];
        int p1 = left, p2 = mid+1, k = left;

        while(p1<=mid && p2<=right){
            if(a[p1]<a[p2]){
                tem[k++] = a[p1++];
            }else{
                tem[k++] = a[p2++];
            }
        }
        while(p1<=mid){
            tem[k++] = a[p1++];
        }
        while(p2<=right){
            tem[k++] = a[p2++];
        }

        for(int i=left;i<right;i++){
            a[i] = tem[i];
        }

    }

    public void group(int [] a,int start,int end){
        if(start<end){
            int mid = (start+end)/2;
            group(a,start,mid);
            group(a,mid+1,end);
            merge(a,start,mid,end);
        }
    }

    @Test
    public void mergesrort(){
        int leng = 7;
        int [] arr = new int[leng];
        for(int i=0;i<leng;i++){
            arr[i] = (int)(Math.random()*100);
        }
        group(arr,0,leng-1);
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
}
