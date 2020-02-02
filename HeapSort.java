package Sorting;

public class HeapSort {

    int[] arr;
    int sizeOfTree;

    public HeapSort(int size){
        this.arr=new int[size+1];
        this.sizeOfTree=0;
        System.out.println("Created an empty Heap of size "+ (size+1));
    }

    public static void main(String[] args) {
        HeapSort sort = new HeapSort(10);
        for (int i=0;i<=10;i++) {
            if(i!=0){
                sort.insertInHeap((10 - i) * 100);
            }
        }
        sort.extractFromTop();
        sort.extractFromTop();

    }

    public int sizeOfArr(){
        return arr.length;
    }

    public int getSizeOfTree(){
        System.out.println("Size Of Tree = "+ sizeOfTree);
        return sizeOfTree;
    }

    public boolean isEmpty(){
        return (arr==null);
    }

    public int peek(){
        return arr[1];
    }

    public void delete(){
        arr=null;
        System.out.println("deleted the heap completely");
    }

    public void HeapifyTopToBottom(int index){
        int left = index*2;
        int right = (index*2)+1;
        int smallestchild=0;

        if (sizeOfTree<left){
            return;
        }
        else if (left==sizeOfTree){
            if(arr[index]>arr[left]){
                arr[left]=arr[left]+arr[index];
                arr[index]=arr[left]-arr[index];
                arr[left]=arr[left]-arr[index];
            }
            return;
        }else{
            if(arr[left]>arr[right]){
                smallestchild=right;
            }else{
                smallestchild=left;
            }
            if(arr[index]>arr[smallestchild]){
                arr[smallestchild]=arr[smallestchild]+arr[index];
                arr[index]=arr[smallestchild]-arr[index];
                arr[smallestchild]=arr[smallestchild]-arr[index];
            }
        }
        HeapifyTopToBottom(smallestchild);
    }

    public void HeapifyBottomToTop(int index){
        if (index<=1){
            return;
        }
        int parent=index/2;
        if(arr[parent]>arr[index]){
            arr[parent]=arr[parent]+arr[index];
            arr[index]=arr[parent]-arr[index];
            arr[parent]=arr[parent]-arr[index];
        }
        HeapifyBottomToTop(parent);
    }

    public int extractFromTop(){
        int topOFHeap = arr[1];
        System.out.println("the value "+arr[1]+" is extracted");
        arr[1]=arr[sizeOfTree];
        sizeOfTree-=1;
        HeapifyTopToBottom(1);
        levelOrder();
        return topOFHeap;
    }

    public int insertInHeap(int value){
        arr[++sizeOfTree]=value;
        System.out.println("the value "+value+" is inserted in the position "+sizeOfTree);
        HeapifyBottomToTop(sizeOfTree);
        levelOrder();
        return value;
    }

    public void levelOrder(){
        for (int i =1;i<=sizeOfTree;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
