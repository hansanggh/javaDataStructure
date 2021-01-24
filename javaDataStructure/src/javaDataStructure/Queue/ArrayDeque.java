package javaDataStructure.Queue;

import java.io.Serializable;

public class ArrayDeque {
    private int front;
    private int rear;
    private int count;
    private int size;
    private int increment;
    private Object[] itemDeque;
    private Object itemEmpty = "empty";

    public ArrayDeque(){
        front =0;
        rear = 0;
        count = 0;
        size = 5;
        increment = 10;
        itemDeque = new Object[size];
    }
    public boolean isEmpty(){
        return (count == 0);
    }

    public void increseArray(){
        size += increment;
        Object[] tempArray = new Object[size];
        for(int i = 0; i < rear; i++)
            tempArray[i] = itemDeque[i];
        itemDeque = tempArray;
    }

    public void insertLast(Object x){
        itemDeque[rear] = x;
        rear++;
        if(rear == size)
            increseArray();
        count++;
    }

    public void insertFirst(Object x){
        if(count!=0)
            for(int i = count; i > 0; i--)
                itemDeque[i] = itemDeque[i-1];
            itemDeque[0] = x;
            count++;
            rear = count;
            if(rear == size)
                increseArray();
    }
    public Object deleteFirst(){
        if(isEmpty()){
            System.out.println("덱이 공백입니다.");
            return itemEmpty;
        }

        Object tempItem = itemDeque[0];
        for(int i = 0; i < count; i++)
            itemDeque[i] = itemDeque[i+1];
        count--; rear--;
        return tempItem;
    }

    public Object deleteLast(){
        if(isEmpty()){
            System.out.println("Deque Empty");
            return itemEmpty;
        }
        Object tempItem = itemDeque[rear-1];
        rear--;
        count--;
        return tempItem;
    }

    public Object First(){
        if(isEmpty()){
            System.out.println("Deque Empty");
            return itemEmpty;
        }
        else return itemDeque[front];
    }

    public Object Last(){
        if(isEmpty()){
            System.out.println("Deque Empty");
            return itemEmpty;
        }
        else return itemDeque[rear-1];
    }

    public void print(){
        if(isEmpty())
            System.out.println("Deque Empty");
        else
            for(int i = 0; i < rear; i++)
                System.out.println(itemDeque[i]);
    }

    public static void main(String args[]){
        ArrayDeque DeQue = new ArrayDeque();
        DeQue.insertFirst("han");
        System.out.println("*** InsertFirst 연산 후 덱 ***");
        DeQue.print();
        DeQue.deleteLast();
        System.out.println("*** DeleteLast 연산 후 덱 ***");
        DeQue.print();
        DeQue.insertFirst(1234);
        DeQue.insertLast("yoon");
        DeQue.insertFirst("kim");
        System.out.println("*** 세번의 삽입 연산 후 덱 출력 ***");
        DeQue.print();
        DeQue.insertLast(3457);
        System.out.println("*** InsertLast 연산 후 덱 ***");
        DeQue.print();
        DeQue.deleteLast();
        System.out.println("*** DeleteLast 연산 후 덱 ***");
        DeQue.print();
        DeQue.deleteFirst();
        System.out.println("*** DeleteFirst 연산 후 덱 ***");
        DeQue.print();
        DeQue.insertFirst("Cho");
        System.out.println("*** InsertFirst 연산 후 덱 ***");
        DeQue.print();
        DeQue.insertLast("park");
        System.out.println("*** InsertLast 연산 후 덱 ***");
        DeQue.print();
        System.out.println("First : " + DeQue.First());
        System.out.println("Last : " + DeQue.Last());
        System.out.println("Last : " + DeQue.Last());
    }
}
