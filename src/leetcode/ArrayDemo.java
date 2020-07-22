import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        arr1 = Arrays.copyOf(arr1, 4);
        int[] arr3 = Arrays.copyOf(arr1, 10);
        for(int i = 0; i < arr1.length; i++)
            System.out.print(arr1[i] + " ");
        System.out.println();
        for(int i = 0; i < arr3.length; i++)
            System.out.print(arr3[i] + " ");
    }
}