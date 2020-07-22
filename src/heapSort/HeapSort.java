package heapSort;

/**
 * @program: exercise
 * @description: ������
 * @author: Jojo.Lee
 * @create: 2019-08-24 11:34
 **/
public class HeapSort {
    //�ѻ���ÿ���ҵ����е����ֵ�������ڸ��ڵ㣬��������������ȫ�������Ľṹ
    //n��ʾ���нڵ�ĸ�����i��������еĵ�i��Ԫ�ؿ�ʼ�ѻ�
    public void heapify(int tree[], int n, int i){
        if (i >= n) return;
        //���������ӽڵ�
        int child1 = i * 2 + 1;
        int child2 = i * 2 + 2;
        int max = i;
        if (child1 < n && tree[child1] > tree[max]){
            max = child1;
        }
        if (child2 < n && tree[child2] > tree[max]){
            max = child2;
        }
        if (i != max){
            swap(tree, i, max);
            heapify(tree, n, max);
        }
    }

    //�����ѣ����Ǵ����һ���ӽڵ�ĸ��������ڵ㿪ʼ�ѻ�
    public void buideHeap(int[] tree, int n){
        //�����һ���ڵ�ĸ��ڵ㿪ʼ�ѻ�
        int lastNode = n - 1;
        int parent = (lastNode - 1) / 2;
        //�����󶥶�
        for (int i = parent; i >= 0; i--){
            heapify(tree, n, i);
        }
    }
    //������
    public void heapSort(int[] tree, int n){
        buideHeap(tree,n);
        //ÿ�ζѶ�Ԫ�غ����һ��Ԫ�ؽ���λ�ã������Ԫ���߳��ѣ�Ȼ�󹹽��¶�
        for (int i=n-1; i>=0; i--){
            swap(tree,0,i);
            buideHeap(tree,i);
        }
    }
    //�����������±�Ϊi��j����������λ��
    public void swap(int[] array, int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        int[] tree = {47,18,34,55,51,62};
        HeapSort sort = new HeapSort();
        int n = tree.length;
        sort.heapSort(tree,n);
        //sort.buideHeap(tree,n);
        for (int i : tree){
            System.out.println(i);
        }
    }
}
