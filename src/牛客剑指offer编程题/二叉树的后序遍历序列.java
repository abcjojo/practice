package ţ�ͽ�ָoffer�����;

/**
 * @program: exercise
 * @description:
 * @author: Jojo.Lee
 * @create: 2019-10-17 18:13
 **/
public class �������ĺ���������� {
    public boolean VerifySquenceOfBST(int [] sequence) {

        if (sequence.length==0) return false;
        return helper(sequence,0,sequence.length-1);

    }

    public boolean helper(int array[], int start, int end){

        if (start>end) return true;

        int i = start;
        for (; i<end; i++)
            if (array[i]>array[end])
                break;

        int index = i;
        while (i<end){
            if (array[i]<array[end]) return false;
            i++;
        }

        return helper(array, start,index-1)&&helper(array, index, end);
    }

}
