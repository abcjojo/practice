package ±  ‘Ã‚.øÏ ÷;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @program: exercise
 * @description:
 * @author: Jojo.Lee
 * @create: 2019-09-16 21:12
 **/
public class T2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int in = sc.nextInt();
        if (in<=1 ) return ;

        int i = 0;
        int tem = in;
        while(tem>=1){
            tem /= 10;
            i++;
        }
        int t=i;
        int[] a = new int [i];
        for(int j = 0; j < i; j++){
            a[j] = (in/((int)Math.pow(10,--t)))%10;
            System.out.println(a[j]);
        }

        List<String> list = new ArrayList<>();

        


    }
}
