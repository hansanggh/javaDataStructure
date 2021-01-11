package javaDataStructure.LinkedList;

public class UseInsertNode {

	public static void main(String[] args) {
		Node5 obj = new Node5();
		Node5 L = null;
		L = obj.build();
		L = obj.insert(L, 28);
		L = obj.insert(L, 46);
		L = obj.insert(L, 7);
	}
}
class Node5 {
	Object data;
	Node5 link;
	
	Node5 build() {
		Node5 L = null, temp, end;
		end = L;
		int [] Data = {15, 35, 67, 98};
		int no = Data.length;
		for (int i = 0; i < no; i++) {
			temp = new Node5();
			temp.data = Data[i];
			if(L == null) {
				L = temp;
				end = L;
			}
			else {
				end.link = temp;
				end = temp;
			}
		}
		System.out.println("*** 리스트  L 출력");
		L.print(L);
		return(L);
	}
	
	Node5 search(Node5 L, int x) {
		Node5 temp = L;
		Node5 pos = L;
		while (temp != null && x > (Integer)temp.data) {
			pos = temp;
			temp = temp.link;
		}
		return pos;
	}
	
	Node5 insert(Node5 p, int x) {
		Node5 pos, insNode, temp = null;
		insNode = new Node5();
		insNode.data = x;
		if(x < (Integer)p.data) {
			insNode.link = p;
			p = insNode;
		}
		else {
			pos = search(p, x);
			temp = pos.link;
			pos.link = insNode;
			insNode.link = temp;
		}
		System.out.println("*** 원소 " +x+ " 삽입 후 리스트  L 출력" );
		print(p);
		return p;
	}
	
	void print(Node5 p) {
		while( p!= null) {
			System.out.println(p.data+" -> ");
			p = p.link;
		}
		System.out.println("null \n");
	}
}
