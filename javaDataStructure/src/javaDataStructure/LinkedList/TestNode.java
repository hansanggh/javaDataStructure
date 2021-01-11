package javaDataStructure.LinkedList;

import java.util.Arrays;

class Node {
	
	Object data;
	Node link;
	
	void print(Node p) {
		while (p != null) {
			System.out.println(p.data+" -> ");
			p = p.link;
		}
		System.out.println("null");
	}
}

public class TestNode{
	public static void main(String args[]) {
		Node L = new Node();
		L.data = "kim";
		L.link = null;
		Node temp = new Node();
		temp.data = "lee";
		L.link = temp;
		Node temp1 = new Node();
		temp1.data = "park";
		temp.link = temp1;
		Node temp2 = new Node();
		temp2.data = "yoon";
		temp1.link = temp2;
		temp2.link = null;
		System.out.println("*** 리스트 L 출력");
		L.print(L);
	}
}
