package BinaryTree;

public class MinHeapTree {
    int[] array;
    int sizeOfHeapTree;

    public MinHeapTree(int size){
        array=new int[size+1];
        this.sizeOfHeapTree=0;
        System.out.println("Empty Heap has been created !");
    }

    public static void main(String[] args) {
        MinHeapTree tree =new MinHeapTree(7);
        for (int i=1;i<8;i++){
            tree.insert(i*100);
        }
        tree.levelOrderTraversal();
        tree.extractHead();
    }

    public int getSizeOfHeapTree(){
        return sizeOfHeapTree;
    }

    public int sizeOfArray(){
        return array.length;
    }

    public boolean isHeapEmpty(){
        return sizeOfHeapTree<=0;
    }

    public void deleteHeap(){
        array=null;
        System.out.println("heap deleted");
    }

    public int create(int size){
        array= new int[size+1];
        return getSizeOfHeapTree();
    }

    public int peek(){
        if(array!=null) {
            return array[1];
        }
        return -1;
    }

    void levelOrderTraversal(){
        System.out.println("Level order traversal ->");
        for(int i=1;i<sizeOfHeapTree+1;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }

    public void heapifyBottomToTop(int index){
        int parent =index/2;
        if(index<=1){
            return;
        }
        if(array[index]<array[parent]){
            int tmp=array[index];
            array[index]=array[parent];
            array[parent]=tmp;
        }
        heapifyBottomToTop(parent);

    }

    public void insert(int value){
        array[sizeOfHeapTree+1]=value;
        sizeOfHeapTree++;
        heapifyBottomToTop(sizeOfHeapTree);
        levelOrderTraversal();
    }


    public void heapifyTopToBottom(int index){
        int left = index*2;
        int right = (index*2)+1;
        int smallestChild =0;
        if(sizeOfHeapTree<left){
            return;
        }else if (sizeOfHeapTree==left){
            if(array[index]>array[left]) {
                int temp = array[index];
                array[index] = array[left];
                array[left] = temp;
            }
            return;
        }else{
            if(array[left]<array[right]){
                smallestChild=left;
            }else {
                smallestChild=right;
            }
            if(array[index]>array[smallestChild]){
                int tmp=array[index];
                array[index]=array[smallestChild];
                array[smallestChild]=tmp;
            }
        }
        heapifyTopToBottom(smallestChild);
    }

    int extractHead(){
        if(sizeOfHeapTree==0){
            return -1;
        }else{
            int extracteedhead = array[1];
            array[1]=array[sizeOfHeapTree--];
            heapifyTopToBottom(1);
            levelOrderTraversal();
            return extracteedhead;
        }
    }

}
