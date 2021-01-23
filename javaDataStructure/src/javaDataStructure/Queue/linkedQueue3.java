package javaDataStructure.Queue;

class Node3{
    Object data;
    Node3 link;
}

class Queue3 {
    Node3 front, rear;

    void insert(Object x){
        Node3 temp;

        if(rear == null){
            rear = new Node3();
            rear.data = x;
            front = rear;
        }else{
            temp = new Node3();
            temp.data = x;
            rear.link = temp;
            rear = temp;
            rear.link = null;
        }
    }
    void delete(){
        if(front == null)
            System.out.println("공백 리스트입니다.");
        else{
            front = front.link;
            if(front == null)
                rear = null;
        }
    }

    void print(){
        Node3 temp;
        temp = front;
        while(temp != null){
            System.out.println(temp.data + " -> ");
            temp = temp.link;
        }
        System.out.println("null");
    }
}

public class linkedQueue3 {
    public static void main(String args[]){
        Queue3 que = new Queue3();
        que.front = que.rear = null;
        que.insert("kim");
        que.insert(35);
        que.insert("park");
        que.insert(82);
        System.out.println("*** 큐 출력");
        que.print();
        que.delete();
        System.out.println("*** 삭제후 큐 출력");
        que.print();
        que.delete();
        System.out.println("*** 삭제후 큐 출력");
        que.print();

    }
}
