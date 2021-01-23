package javaDataStructure.Stack;

class Node3{
    Object data;
    Node3 link;
}
class stack2{
    Node3 top;
    String itemEmpty = "StackEmpty";

    void push(String x){
        Node3 temp;
        if(top == null){
            top = new Node3();
            top.data = x;
            top.link = null;
        }
        else {
            temp = new Node3();
            temp.data = x;
            temp.link = top;
            top = temp;
        }
    }
    void pop(){
        if (top == null)
            System.out.println("공백 스택 --- pop을 수행할 수 없습니다.");
        else
            top = top.link;
    }
    Object peek(){
        if(top == null){
            System.out.println("공백 스택입니다.");
            return itemEmpty;
        }
        else {
            return top.data;
        }
    }
    void print(){
        Node3 temp;
        temp = top;
        while(temp != null){
            System.out.println(temp.data + " -> ");
            temp = temp.link;
        }
        System.out.println("null");
    }
}

public class linkedStack2 {

    public static void main(String args[]){
        stack2 stk = new stack2();
        stk.push("kim");
        stk.push("lee");
        stk.push("park");
        stk.push("yoon");
        System.out.println("*** 스택 출력");
        stk.print();
        System.out.println("*** 스택 top 원소 : " + stk.peek());
        stk.pop();
        System.out.println("*** pop 연산 후 스택 출력");
        stk.print();
        System.out.println("*** 스택 top 원소 : " + stk.peek());
        stk.pop();
        System.out.println("*** pop 연산 후 스택 출력");
        stk.print();
        stk.push("oh");
        System.out.println("*** push 연산 후 스택 출력");
        stk.print();
    }

}
