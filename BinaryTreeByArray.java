package BinaryTree;

public class BinaryTreeByArray {

    int[] array;
    int lastUsedIndex;

    public static void main(String[] args) {
        BinaryTreeByArray BT = new BinaryTreeByArray(6);
        BT.insert(100);
        BT.insert(200);
        BT.insert(300);
        BT.insert(400);
        BT.insert(500);
        BT.insert(600);
        System.out.println("full? ="+ BT.isFull());
        BT.insert(300);
        BT.search(200);
        BT.search(450);
        BT.levelOrderTraversal();
        System.out.println("preOrder Traversal -->");
        BT.preOrderTraversal(1);
        System.out.println("\n");
        System.out.println("inOrder Traversal -->");
        BT.inOrderTraversal(1);
        System.out.println("\n");
        System.out.println("PostOrder Traversal -->");
        BT.PostOrderTraversal(1);
        System.out.println("\n");
        BT.deleteNode(300);
        BT.deleteBT();
        System.out.println("full? ="+ BT.isFull());

    }

    public BinaryTreeByArray(int size){
        array = new int[size+1];
        this.lastUsedIndex=0;
    }

    public void insert(int value){
        if(isFull()){
            System.out.println("BT full, cant insert");
        }else {
            array[++lastUsedIndex]=value;
            System.out.println("the value "+value+" is added in the position "+lastUsedIndex);
        }

    }

    public boolean isFull(){
        if(array!=null){
            return(array.length==lastUsedIndex+1);
        }
        else return false;
    }

    public void deleteBT(){
        array=null;
        System.out.println("deleted BT");
    }

    public void search(int value){
        if(array!=null){
            for(int i=1;i<=lastUsedIndex;i++){
                if(array[i]==value){
                    System.out.println("the value "+value+" is found at the position "+i);
                    return;
                }
            }
            System.out.println("the value not found in search");
        }
    }

    public void deleteNode(int value){
        for (int i=1;i<=lastUsedIndex;i++){
            if (array[i]==value){
                array[i]=array[lastUsedIndex--];
                System.out.println("the value "+value+" is found and deleted from the node "+i);
                return;
            }
        }
    }

    public void levelOrderTraversal(){
        System.out.println("level order traversal");
        for(int i=1;i<=lastUsedIndex;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }

    public void preOrderTraversal(int fromIndex){
        if (fromIndex>lastUsedIndex){
            return;
        }
        System.out.print(array[fromIndex]+" ");
        preOrderTraversal(2*fromIndex);
        preOrderTraversal(2*fromIndex+1);
    }


    public void inOrderTraversal(int fromIndex){
        if (fromIndex>lastUsedIndex){
            return;
        }
        inOrderTraversal(2*fromIndex);
        System.out.print(array[fromIndex]+" ");
        inOrderTraversal(2*fromIndex+1);
    }


    public void PostOrderTraversal(int fromIndex){
        if (fromIndex>lastUsedIndex){
            return;
        }
        PostOrderTraversal(2*fromIndex);
        PostOrderTraversal(2*fromIndex+1);
        System.out.print(array[fromIndex]+" ");
    }
}
