package leetcode.InverseOfLetter;

//345�⡢���ַ�����Ϊ���룬��ת���ַ����е�Ԫ����ĸ��

public class ReverseOfLetter {

    public static void main(String[] args) {
        System.out.println(reverseLetter("save"));
    }
    public static String reverseLetter(String s){
        StringBuilder strB = new StringBuilder(s);
        int start=0;
        int end=s.length()-1;
        while (start<=end) {
            while(start<=end){
                char ch1 = strB.charAt(start);
                if(ch1=='a'||ch1=='o'||ch1=='e'||ch1=='i'||ch1=='u'||ch1=='A'||ch1=='O'||ch1=='E'||ch1=='I'||ch1=='U'){
                    break;
                }
                start++;
            }
            while(start<=end){
                char ch2 = strB.charAt(end);
                if(ch2=='a'||ch2=='o'||ch2=='e'||ch2=='i'||ch2=='u'||ch2=='A'||ch2=='O'||ch2=='E'||ch2=='I'||ch2=='U'){
                    break;
                }
                end--;
            }
            if(start<end) {
                char temp = strB.charAt(start);
                strB.setCharAt(start, strB.charAt(end));
                strB.setCharAt(end, temp);
            }
            String str = strB.toString();
            start++;
            end--;
        }
        return strB.toString();
    }


    public static String reverseVowels(String s) {
        StringBuilder s1 = new StringBuilder(s);
        int start = 0;
        int end = s1.length()-1;
        while(start <= end)
        {
            while(start <=end)   //Ѱ��startλ���ϵ�Ԫ���ַ�
            {
                char charflag = s1.charAt(start);
                if(charflag == 'a' || charflag == 'e' || charflag == 'i' || charflag == 'o' || charflag == 'u' ||charflag == 'A' || charflag == 'E' || charflag == 'I' || charflag == 'O' || charflag == 'U'  )
                    break;
                start+=1;
            }
            while(end >=start)  //Ѱ��endλ���ϵ�Ԫ���ַ�
            {
                char charflag2 = s1.charAt(end);
                if(charflag2 == 'a' || charflag2 == 'e' || charflag2 == 'i' || charflag2 == 'o' || charflag2 == 'u' ||charflag2 == 'A' || charflag2 == 'E' || charflag2 == 'I' || charflag2 == 'O' || charflag2 == 'U'  )
                    break;
                end--;
            }
            //����
            if(start < end)
            {
                char temp = s1.charAt(start);
                s1.setCharAt(start, s1.charAt(end));
                s1.setCharAt(end, temp);
            }

            start+=1;
            end-=1;
        }
        return s1.toString();
    }
}
