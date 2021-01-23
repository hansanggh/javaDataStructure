package javaDataStructure.Queue;

public class ArrayQueue {
    private int front;
    private int rear;
    private int count;
    private int size;
    private int increment;
    private Object[] itemQueue;
    private Object itemEmpty = "empty";

    public ArrayQueue(){
        front = 0;
        rear = 0;
        count = 0;
        size = 50;
        increment = 10;
        itemQueue = new Object[size];
    }

    public boolean isEmpty(){
        return (count == 0);
    }
    public void insert(Object x){
        if(count == size){
            int oldsize = size;
            size += increment;
            Object[] tempArray = new Object[size];
            for (int i = 0; i < count; i++, front = (front + 1) % oldsize)
                tempArray[i] = itemQueue[front];
            itemQueue = tempArray;
            front = 0;
            rear = count;
        }
        itemQueue[rear] = x;
        rear = (rear + 1)%size;
        count++;
    }

    public Object delete(){
        if(isEmpty()){
            System.out.println("Queue Empty");
            return itemEmpty;
        }
        Object tempItem = itemQueue[front];
        front = (front + 1) % size;
        count--;
        return tempItem;
    }

    public Object peek(){
        if(isEmpty()){
            System.out.println("Queue Empty");
            return itemEmpty;
        }
        else
            return itemQueue[front];
    }

    public void print(){
        for(int i = front; i < rear; i++)
            System.out.println(itemQueue[i]);
        System.out.println();
    }

    public static void main(String args[]){
        ArrayQueue Que = new ArrayQueue();
        Que.insert("han");
        Que.insert(1234);
        Que.insert("lee");
        System.out.println("*** Insert 연산 후 큐 ***");
        Que.print();
        Que.delete();
        System.out.println("*** Delete 연산 후 큐 ***");
        Que.print();
        Que.delete();
        System.out.println("*** Delete 연산 후 큐 ***");
        Que.print();
        Que.insert("Cho");
        System.out.println("*** Insert 연산 후 큐 ***");
        Que.print();
        Que.insert("park");
        System.out.println("*** Insert 연산 후 큐 ***");
        Que.print();
        Que.delete();
        System.out.println("*** Delete 연산 후 큐 ***");
        System.out.println("*** Delete 연산 후 큐 ***");
        Que.print();
    }
}
