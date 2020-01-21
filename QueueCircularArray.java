package physicalDS;

//Queue implementation using Circular Array
public class  QueueCircularArray {
    private int beginningOfQueue=0;
    private int endOfQueue=-1;
    private int size;
    private int[] array;

    public static void main(String[] args) {
        QueueCircularArray queue= new QueueCircularArray(5);
        System.out.println("queue.isFull() = "+queue.isFull());
        System.out.println("queue.isEmpty() = "+queue.isEmpty());//doubt
        for (int i=1;i<6;i++){
            queue.enQueue(i*100);
        }
        queue.peek();
        System.out.println("queue.isFull() = "+queue.isFull());
        System.out.println("queue.isEmpty() = "+queue.isEmpty());
        for (int i=0;i<2;i++){
            queue.deQueue();
        }
        System.out.println("queue.isFull() = "+queue.isFull());
        System.out.println("queue.isEmpty() = "+queue.isEmpty());
        for (int i=1;i<=2;i++){
            queue.enQueue(i*33);
        }
        queue.peek();
        System.out.println("queue.beginningOfQueue = "+queue.beginningOfQueue);

        System.out.println("queue.endOfQueue = "+queue.endOfQueue);
        System.out.println("queue.isFull() = "+queue.isFull());
        System.out.println("queue.isEmpty() = "+queue.isEmpty());
    }

    public QueueCircularArray(int size){
        this.array=new int[size];
    }

    public boolean isEmpty(){
        return (endOfQueue==-1);
    }

    public boolean isFull(){
        if(isEmpty())
            return false;
        return ((endOfQueue==array.length-1 && beginningOfQueue==0)||(endOfQueue+1==beginningOfQueue));
    }

    public void peek(){
        if(!isEmpty()){

            System.out.println("item peeked at "+beginningOfQueue+" is "+array[beginningOfQueue]);
        }
    }

    public void enQueue(int value){
        if(isFull()){
            System.out.println("full, cant enqueue");
        }else {
            if(endOfQueue==array.length-1){
                endOfQueue=-1;
            }
            array[++endOfQueue]=value;
            System.out.println("enQueued at the position "+endOfQueue+" with the value ="+value);

        }
    }

    public void deQueue(){
        if(isEmpty()){
            System.out.println("empty queue, cant dequeue");
        }else{
            System.out.println("item dequeued at "+beginningOfQueue+" is "+array[beginningOfQueue]);
            if(beginningOfQueue==endOfQueue) {
                beginningOfQueue = endOfQueue = -1;
            }
            beginningOfQueue++;
        }
    }

}
