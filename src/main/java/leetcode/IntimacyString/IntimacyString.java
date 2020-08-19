package leetcode.IntimacyString;

import org.junit.Test;


//给定两个由小写字母构成的字符串 A 和 B ，只要我们可以通过交换 A
// 中的两个字母得到与 B 相等的结果，就返回 true ；否则返回 false 。
public class IntimacyString {
    public static void main(String[] args) {
        System.out.println(string("abcd","abcf"));
    }
//    @Test
//    public void  test(){
//        //buddyStrings("abcd","badc");
//    }

    public static boolean buddyStrings(String A,String B){
        if(A.equals(B)){
            for(int i=0;i<26;i++){
                char ch = (char)('a' + i);
                if(A.indexOf(ch)!=A.lastIndexOf(ch)){
                    return true;
                }
            }
            return false;
        }
        char [] a = A.toCharArray();
        char [] b = B.toCharArray();
        int cnt = 0;
        int i=0;
        int [] m=new int [2];
        while(i<A.length()){
            try {
                if (a[i] != b[i]) {
                    m[cnt] = i;
                    cnt++;
                }
                i++;
            }catch (ArrayIndexOutOfBoundsException e){
                return false;
            }
        }
        return cnt==2&&a[m[0]]==b[m[1]]&&b[m[0]]==a[m[1]];
    }


    public static Boolean string(String A,String B){
        if(A.equals(B)){
            // 找有没有重复的字符
            for (int i = 0; i < 26; i++) {
                char ch = (char) ('a' + i);
                if(A.indexOf(ch) != A.lastIndexOf(ch)){
                    return true;
                }
            }
            return false;
        }
        char[] charsA = A.toCharArray();
        char[] charsB = B.toCharArray();
        if (charsA.length != charsB.length) {
            return false;
        }
        int[] indexDifferent = new int[2];
        int k = 0;
        for (int i = 0; i < charsA.length; i++) {
            if (charsA[i] != charsB[i]) {
                try {
                    indexDifferent[k++] = i;
                } catch (IndexOutOfBoundsException e) {
                    return false;
                }
            }
        }
        return k == 2 && charsA[indexDifferent[0]] == charsB[indexDifferent[1]] && charsA[indexDifferent[1]] ==
                charsB[indexDifferent[0]];

    }
}
