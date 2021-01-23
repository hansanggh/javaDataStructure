package javaDataStructure.Stack;

import java.util.Stack;

public class TestStack {
    public static void main(String args[]){
        Stack<Integer> stk = new Stack<>();
        Integer objint;
        int x;
        int intarr[] = new int[20];
        System.out.println("*** 스택 원소 출력");
        for(int j = 0; j < 10; j++){
            objint=j*2;
            stk.push(objint);
            objint=(Integer)stk.peek();
            x=objint;
            System.out.println(x+" ");
            intarr[j]=x;
        }
        System.out.println("\n");
        int size = stk.size();
        System.out.println("스택 크기 : " + size + "\n");
        System.out.println("*** top 원소 : "+intarr[size-1]+"\n");
        System.out.println("*** pop 연산 후 스택 출력 ");
        objint = (Integer)stk.pop();
        size--;
        for(int j = 0; j < size; j++)
            System.out.println(intarr[j]+" ");
        System.out.println("\n");
        System.out.println("*** 34 push 연산 후 스택 출력 ");
        stk.push(34);
        intarr[size] = 34;
        size++;
        for(int j = 0; j < size; j++)
            System.out.println(intarr[j]+" ");
        System.out.println();
    }
}
