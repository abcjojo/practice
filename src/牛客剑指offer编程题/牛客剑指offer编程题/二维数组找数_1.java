package ţ�ͽ�ָoffer�����.ţ�ͽ�ָoffer�����;

/**
 * @program: exercise
 * @description:
 * @author: Jojo.Lee
 * @create: 2019-08-21 09:43
 **/
public class ��ά��������_1 {
    public boolean Find(int target, int [][] array) {
        int row = array.length-1;
        int col = 0;
        while(row>=0 && col<array[0].length){
            if (target==array[row][col]) return true;
            else if (target<array[row][col]) row--;
            else col++;
        }
        return false;
    }
}
