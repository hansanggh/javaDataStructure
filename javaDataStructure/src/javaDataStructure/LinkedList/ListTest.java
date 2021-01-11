package javaDataStructure.LinkedList;

public class ListTest {

	public static void main(String[] args) {
		Node4 p = new Node4();
		p.build(p, args);
		System.out.println("*** 리스트 출력 ***");
		p.display(p);
	}
}

class Node4 {
	Object data;
	Node4 link;
	void build(Node4 p, String[] args) {
		Node4 temp = null;
		temp = p;
		int no = Integer.parseInt(args[0]);
		for(int i = 1; i <= no; i++) {
			temp.data = args[i];
			Node4 temp1 = new Node4();
			temp.link = temp1;
			temp = temp1;
		}
	}
	void display(Node4 p) {
		if(p != null) {
			System.out.println(p.data + " ");
			display(p.link);
		}
	}
}
