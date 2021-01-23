package javaDataStructure.Queue;

class Node2 {
    Object data;
    Node2 link;
}

class Queue2 {
    Node2 front, rear;

    void insert(Object x){
        Node2 temp;
        if(rear == null){
            rear = new Node2();
            rear.data = x;
            front = rear;
        }
        else{
            temp = new Node2();
            temp.data = x;
            rear.link = temp;
            rear = temp;
            rear.link = null;
        }
    }

    void print(){
        Node2 temp;
        temp = front;
        while(temp != null){
            System.out.println(temp.data + " -> ");
            temp = temp.link;
        }
        System.out.println("null");
    }
}

public class linkedQueue2 {
        private static void main(String args[]){
            Queue2 que = new Queue2();
            que.front = que.rear = null;
            que.insert("kim");
            que.insert(35);
            que.insert("park");
            que.insert(82);
            System.out.println("*** 큐 출력");
            que.print();
            que.insert("lee");
            System.out.println("*** 삽입 후 큐 출력");
            que.print();
            que.insert(125);
            System.out.println("*** 삽입 후 큐 출력");
            que.print();
        }
}
