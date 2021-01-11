package javaDataStructure.LinkedList;

public class UseNode{
	public static void main(String[] args) {
		Node2 obj = new Node2();
		obj.build();
	}
}

class Node2 {
	Object data;
	Node2 link;
	void build () {
		Node2 L = null, temp, end;
		end = L;
		String[] Data = {"kim", "lee", "park", "yoon"};
		int no = Data.length;
		for(int i = 0; i < no; i++) {
			temp = new Node2();
			temp.data = Data[i];
			if(L==null) {
				L = temp;
				end = L;
			}
			else {
				end.link = temp;
				end = temp;
			}
			System.out.println("*** 리스트 L 출력");
			L.print(L);
		}
		
	}
	void print(Node2 p) {
		while(p != null) {
			System.out.println(p.data+" -> ");
			p = p.link;
		}
		System.out.println("null");
	}
}
