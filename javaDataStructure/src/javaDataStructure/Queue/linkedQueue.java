package javaDataStructure.Queue;

class Node{
    Object data;
    Node link;
}

class Queue{
    Node front, rear;

    void create(Object x){
        Node temp;
        if(rear == null){
            rear = new Node();
            rear.data = x;
            front = rear;
        }else{
            temp = new Node();
            temp.data = x;
            rear.link = temp;
            rear = temp;
            rear.link = null;
        }
    }

    void print(){
        Node temp;
        temp = front;
        while(temp != null){
            System.out.println(temp.data + " -> ");
            temp = temp.link;
        }
        System.out.println("null");
    }
}
public class linkedQueue {
    public static void main(String args[]){
        Queue que = new Queue();
        Node temp;
        que.front = que.rear = null;
        que.create("kim");
        que.create("lee");
        que.create("park");
        que.create("yoon");
        System.out.println("*** 큐 출력");
        que.print();
    }
}
