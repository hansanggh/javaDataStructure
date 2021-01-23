package javaDataStructure.Stack;


class ArrayStack {
    private int top;
    private int size;
    private int increment;
    private Object[] itemStack;
    private Object itemEmpty;

    public ArrayStack() {
        top = -1;
        size = 50;
        increment = 10;
        itemStack = new Object[size];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(Object x) {
        if (top == size - 1) {
            size += increment;
            Object[] tempArray = new Object[size];
            for (int i = 0; i <= top; i++)
                tempArray[i] = itemStack[i];
            itemStack = tempArray;
        }
        itemStack[++top] = x;
    }

    public Object pop() {
        if (isEmpty()) {
            System.out.println("Stack Empty");
            return itemEmpty;
        }
        return itemStack[top--];
    }

    public Object peek() {
        if (isEmpty()) {
            System.out.println("Stack Empty");
            return itemEmpty;
        } else return itemStack[top];
    }

    public void print() {
        for (int i = 0; i < top; i++)
            System.out.println(itemStack[i] + ", ");
        System.out.println(itemStack[top]);
        System.out.println();
    }
}

public class UseArrayStack {
    public static void main(String args[]){
        ArrayStack stack1 = new ArrayStack();
        stack1.push("han");
        stack1.push(1279);
        stack1.push("lee");
        stack1.push("park");
        stack1.push(5734);
        System.out.println("*** push 연산 후 Stack ***");
        stack1.print();
        System.out.println("*** Top 원소 :");
        System.out.println(stack1.peek()+"\n");
        stack1.pop();
        System.out.println("*** pop 연산 후 Stack ***");
        stack1.print();
        stack1.pop();
        System.out.println("*** pop 연산 후 Stack ***");
        stack1.print();
        System.out.println("*** Top 원소 :");
        System.out.println(stack1.peek()+"\n");
        stack1.peek();
        System.out.println("*** pop 연산 후 Stack ***");
        stack1.print();
    }
}

