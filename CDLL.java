package com.company;

import com.company.DoubleNode;
public class CDLL {

    private DoubleNode head;
    private DoubleNode tail;
    private int size;

    public static void main(String[] args) {
        CDLL list=new CDLL();
        list.createCDLL(10);
        list.insertCDLL(20,1);
        list.insertCDLL(30,2);
        list.insertCDLL(40,3);
        list.traverseCDLL();
        list.reversetraverseCDLL();
        list.searchCDLL(30);
        list.traverseCDLL();
        list.deleteANodeCDLL(2);
        list.traverseCDLL();
        list.printHeadUsingTail();
        list.deleteCDLL();
        list.traverseCDLL();
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public DoubleNode getHead() {
        return head;
    }

    public void setHead(DoubleNode head) {
        this.head = head;
    }

    public DoubleNode getTail() {
        return tail;
    }

    public void setTail(DoubleNode tail) {
        this.tail = tail;
    }

    public DoubleNode createCDLL(int Value){
        head = new DoubleNode();
        DoubleNode node = new DoubleNode();
        tail = node;
        head= node;
        node.setPrev(head);
        node.setNext(tail);
        node.setValue(Value);
        size=1;
        return head;
    }

    public boolean isExistsCDLL(){
        return (head!=null);
    }

    public void insertCDLL(int Value,int location){
        DoubleNode node = new DoubleNode();
        node.setValue(Value);
        if (!isExistsCDLL()){
            System.out.println("LL doesnt exist");
            return;
        }else if (location ==0){
            head.setPrev(node);
            node.setPrev(tail);
            node.setNext(head);
            tail.setNext(node);
            head=node;
        }else if(location>=getSize()){
            tail.setNext(node);
            node.setPrev(tail);
            node.setNext(head);
            tail=node;
            head.setPrev(node);
        }else {
            DoubleNode tempNode = head;
            for (int i =0;i<getSize();i++){
                tempNode=tempNode.getNext();
            }
        }
        size++;
    }

    public void traverseCDLL(){
        if (!isExistsCDLL()){
            System.out.println("LL doesnt exist");
            return;
        }else{
        DoubleNode tempNode = head;
        for (int i =0;i<size;i++) {

            System.out.print(tempNode.getValue());
            if (i<size-1){
                System.out.print(" --> ");
            }
            tempNode=tempNode.getNext();
        }
            System.out.println();
        }
    }

    public void reversetraverseCDLL(){
        if (!isExistsCDLL()){
            System.out.println("LL doesnt exist");
            return;
        }else{
            DoubleNode tempNode = tail;
            for (int i =0;i<size;i++) {

                System.out.print(tempNode.getValue());
                if (i<size-1){
                    System.out.print(" --> ");
                }
                tempNode=tempNode.getPrev();
            }
            System.out.println();
        }
    }

    public void printHeadUsingTail(){
        if(isExistsCDLL()){
            System.out.print("Head = ");
            System.out.println(head.getValue());
            System.out.print("Tail = ");
            System.out.println(tail.getValue());
            System.out.print("Head using tail = ");
            System.out.println(tail.getNext().getValue());
        }
    }

    public void deleteCDLL(){
        if(isExistsCDLL()){
            head.setPrev(null);
            tail.setNext(null);
            head=null;
            tail=null;
            System.out.println("deleted the CDLL");
        }
    }

    public void searchCDLL(int Value){
        if (!isExistsCDLL()){
            System.out.println("LL doesnt exist");
            return ;
        }else{
            DoubleNode tempNode = head;
            for (int i=0;i<size;i++){
                if (tempNode.getValue()==Value){
                    System.out.println("the value found ar location "+i);
                    return ;
                }
                tempNode=tempNode.getNext();
            }

        }
    }

    public void deleteANodeCDLL(int location){
        if (!isExistsCDLL()){
            System.out.println("LL doesnt exist");
            return ;
        }else if (location==0){
            head=head.getNext();
            head.setPrev(tail);
            tail.setNext(head);
        }else if(location>=getSize()){
            tail=tail.getPrev();
            tail.setNext(head);
            head.setPrev(tail);
        }else{
            DoubleNode tempNode = head;
            for (int i =0;i<getSize();i++){
                tempNode=tempNode.getNext();
            }
            tempNode.setNext(tempNode.getNext().getNext());
            tempNode.getNext().setPrev(tempNode);
            setSize(getSize()-1);
        }
    }
}

