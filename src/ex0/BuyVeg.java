package ex0;
//СH��СW������һ�����ϣ����˷ֿ���ˣ�������˵Ĺ��̿�������Ϊ��
// ȥ������һЩ��Ȼ��ȥ�Աߵ�һ���㳡�Ѳ�װ�ϳ������˶�Ҫ��n�ֲˣ�����Ҳ��Ҫװn�γ���
// ����ģ�����СH��˵��n�����ཻ��ʱ���[a1,b1],[a2,b2]...[an,bn]��װ����
// ����СW��˵��n�����ཻ��ʱ���[c1,d1],[c2,d2]...[cn,dn]��װ����
// ���У�һ��ʱ���[s, t]��ʾ���Ǵ�ʱ��s��ʱ��t���ʱ�䣬ʱ��Ϊt-s��
//���������Ǻ����ѣ����Ƕ��ڹ㳡��װ����ʱ������죬������֪�����ǿ����Ķ೤ʱ�䡣
//��������
//4
//1 3
//5 6
//9 13
//14 15

//2 4
//5 7
//10 11
//13 14
//�������
//3
//���������е�����������1 �� n �� 2000, ai < bi < ai+1��ci < di < ci+1,
// �������е�i(1 �� i �� n)�У�1 �� ai, bi, ci, di �� 1000000��
import java.util.Scanner;

public class BuyVeg {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        int [] t=new int [10000];
        for(int i=0;i<2*n;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            for (int j=a;j<b;j++){
                t[j]++;
            }
        }
        for(int i:t){
            if (i>1){
                count++;
            }
        }
        System.out.println(count);
    }
}
