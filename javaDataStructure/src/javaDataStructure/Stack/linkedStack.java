package javaDataStructure.Stack;

class Node2{
    Object data;
    Node2 link;
}

class stack{
    Node2 top;

    void push(String x){
        Node2 temp;
        if(top == null)
        {
            top = new Node2();
            top.data = x;
            top.link = null;
        }
        else{
            temp = new Node2();
            temp.data = x;
            temp.link = top;
            top = temp;
        }
    }

    void print(){
        Node2 temp;
        temp = top;
        while(temp != null){
            System.out.println(temp.data + " -> ");
            temp = temp.link;
        }
        System.out.println("null");
    }
}

public class linkedStack {
    public  void main(String args[]){
        stack stk = new stack();
        stk.push("him");
        stk.push("lee");
        stk.push("park");
        stk.push("yoon");
        System.out.println("*** 스택 출력");
        stk.print();
        stk.push("cho");
        System.out.println("*** push 연산 후 스택 출력");
        stk.print();
        stk.push("han");
        System.out.println("*** push 연산 후 스택 출력");
        stk.print();

    }
}
