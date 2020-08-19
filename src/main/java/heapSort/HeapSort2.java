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

    //n是结点个数， i是每次heapify的节点的位置(下标从0开始)
    private void heapify(int[] tree, int n, int i){
        if (i >= n) return ;
        int max = i;
        int child1 = i * 2 + 1;
        int child2 = i * 2 + 2;
        //找到子节点中大于父节点的位置
        if (child1 < n && tree[child1] > tree[max]){
            max = child1;
        }
        if (child2 < n && tree[child2] > tree[max]){
            max = child2;
        }
        //如果父节点不是最大值，交换最大值到父节点的位置，继续对其交换的子节点heapify
        if (max != i){
            swap(tree, max, i);
            heapify(tree, n, max);
        }
    }

    //构建堆 大顶堆
    //从最后一个节点的父节点开始堆化，当把堆顶节点heapify完成后，大顶堆构建完成
    private void buildHeap(int[] tree, int n){
        int lastNode = n - 1;
        int lastParent = (lastNode - 1) / 2;
        for(int i = lastParent; i >= 0; i--){
            heapify(tree, n, i);
        }
    }

    //堆排序 构建大顶堆，每次把堆顶元素和最后一个元素交换，然后重新构建大顶堆(此时不包含最后一个元素)
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









