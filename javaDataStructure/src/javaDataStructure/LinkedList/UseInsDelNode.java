package javaDataStructure.LinkedList;

public class UseInsDelNode {

	public static void main(String[] args) {
		Node8 obj = new Node8();
		Node8 L = null;
		L = obj.build();
		L = obj.insert(L, 26);
		L = obj.insert(L, 8);
		L = obj.delete(L, 24);
		L = obj.insert(L, 105);
		L = obj.delete(L, 8);
		L = obj.delete(L, 105);
		L = obj.delete(L, 95);
		L = obj.insert(L, 56);
	}
}

class Node8{
	Object data;
	Node8 link;
	
	Node8 build() {
		Node8 L = null, temp, end;
		end = L;
		int [] Data = {15, 35, 67, 98};
		int no = Data.length;
		for(int i = 0; i < no; i++) {
			temp = new Node8();
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
		System.out.println("*** 리스트 L 출력");
		L.print(L);
		return(L);
	}
	
	Node8 search(Node8 L, int x) {
		Node8 temp = L;
		Node8 pos = L;
		while (temp != null && x > (Integer)temp.data) {
			pos = temp;
			temp = temp.link;
		}
		return pos;		
	}
	Node8 delSearch(Node8 L, int x) {
		Node8 temp = L;
		Node8 pos = L;
		while(temp != null && x != (Integer)temp.data) {
			pos = temp;
			temp = temp.link;
		}
		return pos;
	}
	
	Node8 insert(Node8 p, int x) {
		Node8 pos, insNode, temp = null;
		insNode = new Node8();
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
		System.out.println("*** 원소 " + x + " 삽입ㅎ 후 리스트  L 출력");
		p.print(p);
		return p;
	}
	
	Node8 delete(Node8 p, int x) {
		Node8 pos, temp = null;
		boolean flag = false;
		pos = delSearch(p, x);
		if(x == (Integer)p.data)
			p = p.link;
		else {
			if(pos.link != null) {
				temp = pos.link;
				pos.link = temp.link;
			}
			else {
				System.out.println("*** 삭제할 원소 " + x + " 없습니다. \n");
				flag = true;
			}
		}
		if(flag == false) {
			System.out.println("*** 원소 " +x+ " 삭제후 리스트  L 출력");
			print(p);
		}
		return p;
	}
	void print (Node8 p) {
		while (p!= null) {
			System.out.println(p.data+" -> ");
			p = p.link;
		}
		System.out.println("null \n");
	}
}
