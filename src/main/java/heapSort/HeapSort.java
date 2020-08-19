package heapSort;

/**
 * @program: exercise
 * @description: 堆排序
 * @author: Jojo.Lee
 * @create: 2019-08-24 11:34
 **/
public class HeapSort {
    //堆化，每次找到堆中的最大值，保存在根节点，并保持树满足完全二叉树的结构
    //n表示树中节点的个数，i代表从树中的第i个元素开始堆化
    public void heapify(int tree[], int n, int i){
        if (i >= n) return;
        //定义左右子节点
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

    //构建堆，既是从最后一个子节点的根（父）节点开始堆化
    public void buideHeap(int[] tree, int n){
        //从最后一个节点的父节点开始堆化
        int lastNode = n - 1;
        int parent = (lastNode - 1) / 2;
        //构建大顶堆
        for (int i = parent; i >= 0; i--){
            heapify(tree, n, i);
        }
    }
    //堆排序
    public void heapSort(int[] tree, int n){
        buideHeap(tree,n);
        //每次堆顶元素和最后一个元素交换位置，将最后元素踢出堆，然后构建新堆
        for (int i=n-1; i>=0; i--){
            swap(tree,0,i);
            buideHeap(tree,i);
        }
    }
    //交换数组中下标为i和j的两个数的位置
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
