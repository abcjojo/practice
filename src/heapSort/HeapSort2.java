package heapSort;

/**
 * @program: exercise
 * @description:
 * @author: Jojo.Lee
 * @create: 2019-08-24 14:10
 **/
public class HeapSort2 {
    private void swap(int[] tree, int p, int q){
        int temp = tree[p];
        tree[p] = tree[q];
        tree[q] = temp;
    }

    //n�ǽ������� i��ÿ��heapify�Ľڵ��λ��(�±��0��ʼ)
    private void heapify(int[] tree, int n, int i){
        if (i >= n) return ;
        int max = i;
        int child1 = i * 2 + 1;
        int child2 = i * 2 + 2;
        //�ҵ��ӽڵ��д��ڸ��ڵ��λ��
        if (child1 < n && tree[child1] > tree[max]){
            max = child1;
        }
        if (child2 < n && tree[child2] > tree[max]){
            max = child2;
        }
        //������ڵ㲻�����ֵ���������ֵ�����ڵ��λ�ã��������佻�����ӽڵ�heapify
        if (max != i){
            swap(tree, max, i);
            heapify(tree, n, max);
        }
    }

    //������ �󶥶�
    //�����һ���ڵ�ĸ��ڵ㿪ʼ�ѻ������ѶѶ��ڵ�heapify��ɺ󣬴󶥶ѹ������
    private void buildHeap(int[] tree, int n){
        int lastNode = n - 1;
        int lastParent = (lastNode - 1) / 2;
        for(int i = lastParent; i >= 0; i--){
            heapify(tree, n, i);
        }
    }

    //������ �����󶥶ѣ�ÿ�ΰѶѶ�Ԫ�غ����һ��Ԫ�ؽ�����Ȼ�����¹����󶥶�(��ʱ���������һ��Ԫ��)
    private void heapSort(int[] tree, int n){
        buildHeap(tree, n);
        for(int i = n - 1; i >= 0; i--){
            swap(tree, i,0);
            buildHeap(tree, i);
        }
    }

    public static void main(String[] args) {
        int[] tree = {47,18,34,55,51,62};
        HeapSort2 sort = new HeapSort2();
        int n = tree.length;
        sort.heapSort(tree,n);
        //sort.buideHeap(tree,n);
        for (int i : tree){
            System.out.println(i);
        }
    }
}









