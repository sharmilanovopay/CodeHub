package physicalDS;
//Queue using Linear Array
public class Queue {
    private int beginningOfArray;
    private int endOfArray;
    private int size;
    int[] array;

    public static void main(String[] args) {
        Queue queue=new Queue(5);
        System.out.println("queue.isEmpty() = "+queue.isEmpty());
        System.out.println("queue.isFull() = "+queue.isFull());
        queue.enQueue(100);
        queue.enQueue(200);
        queue.enQueue(300);
        queue.enQueue(400);
        queue.enQueue(500);
        queue.enQueue(600);
        System.out.println("queue.isEmpty() = "+queue.isEmpty());
        System.out.println("queue.isFull() = "+queue.isFull());
        queue.peek();
        queue.deQueue();
        queue.peek();
        System.out.println("queue.isFull() = "+queue.isFull());


    }

    public Queue(int size){
        array= new int[size];
    }

    public int getBeginningOfArray() {
        return beginningOfArray;
    }

    public void setBeginningOfArray(int beginningOfArray) {
        this.beginningOfArray = beginningOfArray;
    }

    public int getEndOfArray() {
        return endOfArray;
    }

    public void setEndOfArray(int endOfArray) {
        this.endOfArray = endOfArray;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isEmpty(){
        return (beginningOfArray==-1);
    }

    public boolean isFull(){
        return (endOfArray==array.length);
    }

    public void peek(){
        if(isEmpty()){
            System.out.println("queue already empty, can't peek it");
            return;
        }else {
            System.out.println(array[beginningOfArray] + " is peeked from the position " + beginningOfArray);
        }
    }
    public void enQueue(int value){
        if(isFull()){
            System.out.println("queue is full already, can not add");
            return;
        }else {
            array[endOfArray]=value;
            System.out.println(value +" is added at the position "+ endOfArray);
            endOfArray++;
        }
    }

    public void deQueue(){
        if(isEmpty()){
            System.out.println("queue already empty, can't dequeue it");
            return;
        }else {
            System.out.println(array[beginningOfArray]+" is dequeued from the position "+ beginningOfArray);
            beginningOfArray++;
            if(beginningOfArray>endOfArray){
                System.out.println("dequeued all the elements present in the queue");
                beginningOfArray=-1;
                endOfArray=-1;
            }
        }
    }
}
