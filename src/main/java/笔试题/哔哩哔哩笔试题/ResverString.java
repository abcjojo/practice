package ±ÊÊÔÌâ.ßÙÁ¨ßÙÁ¨±ÊÊÔÌâ;

import java.util.Scanner;

/**
 * @program: exercise
 * @description: ·´×ªÓ¢ÎÄ×Ö·û´®
 * ÊäÈë £º I am a student.
 * Êä³ö £º student. a am I
 *
 * @author: Jojo.Lee
 * @create: 2019-08-20 19:39
 **/
public class ResverString {
        public static String reverseWords(String s) {
            if(s.equals("")||s.equals(" "))return "";
            StringBuffer str = new StringBuffer(s);
            int a = 0;
            while(str.charAt(a) == ' ' && str.length() > 0 ) {
                str.deleteCharAt(a);
                if(str.length() == 0) return "";
            }
            int b = str.length()-1;

            while(str.charAt(b) == ' ' &&  b > 0  ) {
                str.deleteCharAt(b);
                b=str.length()-1;
            }

            for( int i=0,j=str.length()-1;i < j ; i++,j--) {
                char c = str.charAt(i);
                str.setCharAt(i,str.charAt(j) );
                str.setCharAt(j,c);
            }
            for(int i=0;i<str.length()-2;) {
                if(str.charAt(i) == ' '&& str.charAt(i+1)==' ') {
                    str.deleteCharAt(i);
                    continue;
                }
                i++;
            }
            int l = 0;
            for(int i=0;i<str.length();i++) {
                if(str.charAt(i) != ' ') {
                    l++;
                }else {
                    if(l>1) {
                        for(int j= i-l,k=i-1; j<k;j++,k--) {

                            char c = str.charAt(j);
                            str.setCharAt(j,str.charAt(k) );
                            str.setCharAt(k,c);
                        }
                    }
                    l = 0;
                }
            }
            for(int i=str.length()-l,j=str.length()-1;i<j;i++,j--) {
                char c = str.charAt(i);
                str.setCharAt(i,str.charAt(j) );
                str.setCharAt(j,c);
            }

            System.out.print(str.toString());
            return str.toString();
        }

        public static void main(String[] args) {
            Scanner scan  = new Scanner(System.in);
            String line = scan.nextLine();
            reverseWords(line);
        }
        //   I am a student.

}
