package ţ�ͽ�ָoffer�����.ţ�ͽ�ָoffer�����;

/**
 * @program: exercise
 * @description:
 * @author: Jojo.Lee
 * @create: 2019-08-21 20:35
 **/
public class ��ֵ�������η� {
    public static void main(String[] args) {
        System.out.println(Power(3,5));;
    }
    public  static double Power(double base, int exponent) {
        double result=1,cur=base;
        int n;
        if(exponent>0) n=exponent;
        else if(exponent<0){
            if (base==0) throw new RuntimeException("timeoput");
            n=-exponent;
        }
        else return 1;

        while (n!=0){
            if ((n&1)==1){
                result*=cur;
            }
            cur*=cur;
            n>>=1;
        }
        return exponent>0?result:(1/result);
    }





    public  static double Power1(double base, int n) {
        double res = 1,curr = base;
        int exponent;
        if(n>0){
            exponent = n;
        }else if(n<0){
            if(base==0)
                throw new RuntimeException("��ĸ����Ϊ0");
            exponent = -n;
        }else{// n==0
            return 1;// 0��0�η�
        }
        while(exponent!=0){
            if((exponent&1)==1)
                res*=curr;
            curr*=curr;// ����
            exponent>>=1;// ����һλ
        }
        return n>=0?res:(1/res);
    }
}
