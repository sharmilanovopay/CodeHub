package physicalDS;

public class StackByArray {

    private int[] array;
    private int topOfStack;

    public static void main(String[] args) {
        StackByArray stack = new StackByArray(5);
        System.out.println(" is the stack empty = "+stack.isEmptyStack());
        stack.peek();
        for (int i=0;i<5;i++){
            stack.push(i*10);
        }
        stack.peek();
        System.out.println(" is the stack full ="+stack.isFullStack());
        for(int i=0;i<2;i++){
            stack.pop();
        }
        stack.peek();
        System.out.println();
        stack.deleteStack();
        System.out.println(" is the stack empty = "+stack.isEmptyStack());
        stack.peek();
    }

    public StackByArray(int size){
        this.array = new int[size];
        this.topOfStack=-1;
        System.out.println("stack by array created successfully");
    }
    public boolean isEmptyStack(){
        return topOfStack==-1;
    }

    public boolean isFullStack(){
        return (topOfStack==array.length-1);
    }

    public void push(int value){
        if(isFullStack()){
            System.out.println("OverFlow error");
        }else {
            topOfStack++;
            array[topOfStack] = value;
            System.out.println("value "+ value + " inserted into the stack");
        }
    }

    public void pop(){
        if(isEmptyStack()){
            System.out.println("underflow error");
        }else{
            System.out.println("The element poped out is "+ array[topOfStack]);
            topOfStack--;
        }
    }

    public void peek(){
        if(!(array ==null)) {
            if (isEmptyStack()) {
                System.out.println("underflow error");
            } else {
                System.out.println("The element at the top of stack is " + array[topOfStack - 1]);
            }
        }
        else{
            System.out.println("Array already deleted");
        }
    }

    public void deleteStack(){
        array = null;
        System.out.println("successfully deleted");
    }
}
