package javaDataStructure.Queue;

class Node4{
    Object data;
    Node4 link;
}

class Queue4{
    Node4 front, rear;
    private Object itemEmpty = "empty";

    void insert(Object x){
        Node4 temp;
        if(rear == null){
            rear = new Node4();
            rear.data = x;
            front = rear;
        }else{
            temp = new Node4();
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

    Object peek(){
        if( front == null){
            System.out.println("큐가 공백입니다.");
            return itemEmpty;
        }
        else return front.data;
    }

    void print(){
        Node4 temp;
        temp = front;
        while(temp != null){
            System.out.println(temp.data + " -> ");
            temp = temp.link;
        }
        System.out.println("null");
    }
}

public class linkedQueue4 {
    public static void main(String args[]){
        Queue4 que = new Queue4();
        que.front = que.rear = null;
        que.insert("kim");
        que.insert(35);
        que.insert("park");
        que.insert(82);
        System.out.println("*** 큐 출력");
        que.print();
        que.delete();
        System.out.println("*** 삭제 후 큐 출력");
        que.print();
        que.delete();
        System.out.println("*** 삭제 후 큐 출력");
        que.print();
        que.insert("yoon");
        System.out.println("*** 삽입 후 큐 출력");
        que.print();
        que.insert(157);
        System.out.println("*** 삽입 후 큐 출력");
        que.print();
        System.out.println("*** 삭제될 원소 : " + que.peek());
        que.delete();
        System.out.println("*** 삭제 후 큐 출력");
        que.print();
    }
}
