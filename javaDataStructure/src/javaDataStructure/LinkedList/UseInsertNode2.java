package javaDataStructure.LinkedList;

public class UseInsertNode2 {

	public static void main(String[] args) {
		Node6 obj = new Node6();
		Node6 L = null;
		L = obj.build(args);
		L = obj.insert(L, 65);
		L = obj.insert(L, 3);
		L = obj.insert(L, 39);
	}
}

class Node6{
	Object data;
	Node6 link;
	
	Node6 build(String args[]) {

		Node6 L = null, temp, end;
		end = L;
		int no = Integer.parseInt(args[0]);
		for(int i = 1; i <= no; i++) {
			temp = new Node6();
			temp.data = Integer.parseInt(args[i]);
			if(L == null) {
				L = temp;
				end = L;
			}
			else {
				end.link = temp;
				end = temp;
			}
		}
		System.out.println("*** 리스트 L 출력");
		L.print(L);
		return(L);
	}
	
	Node6 search(Node6 L, int x) {
		Node6 temp = L;
		Node6 pos = L;
		while (temp != null && x > (Integer)temp.data) {
			pos = temp;
			temp = temp.link;
		}
		return pos;
	}
	
	Node6 insert(Node6 p, int x) {
		Node6 pos, insNode, temp = null;
		insNode = new Node6();
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
		System.out.println("*** 원소 " + x + " 삽입 후 리스트  L 출력");
		print(p);
		return p;
	}
	
	void print(Node6 p) {
		while(p != null) {
			System.out.println(p.data + " -> ");
			p = p.link;
		}
		System.out.println("null \n");
	}
}
