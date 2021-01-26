package javaDataStructure.Stack;


class Node{
    Object data;
    Node link;
}

class Stack{
    Node top;
    void create(String x){
        Node temp;
        if(top == null){
            top = new Node();
            top.data = x;
            top.link = null;
        }
        else{
            temp = new Node();
            temp.data = x;
            temp.link = top;
            top = temp;
        }
    }
    void print(){
        Node temp;
        temp = top;
        while(temp != null){
            System.out.println(temp.data + " -> ");
            temp = temp.link;
        }
        System.out.println("null");
    }
}
public class CreatelinkedStack {
    void build(Stack stk){
        stk.create("kim");
        stk.create("lee");
        stk.create("park");
        stk.create("yoon");
    }

    public static void main(String args[]){
        CreatelinkedStack obj = new CreatelinkedStack();
        Stack stk = new Stack();
        obj.build(stk);
        System.out.println("*** 스택 출력");
        stk.print();
    }
}
