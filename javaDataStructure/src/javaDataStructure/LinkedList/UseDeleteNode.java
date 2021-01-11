package javaDataStructure.LinkedList;

public class UseDeleteNode {

	public static void main(String[] args) {
		Node7 obj = new Node7();
		Node7 L = null;
		L = obj.build();
		L = obj.delete(L, 15);
		L = obj.delete(L, 67);
		L = obj.delete(L, 30);
		L = obj.delete(L, 11);
	}
}

class Node7{
	Object data;
	Node7 link;
	
	Node7 build() {
		Node7 L = null, temp, end;
		end = L;
		int[] Data = {15, 35, 67, 98, 128};
		int no = Data.length;
		for (int i = 0; i < no; i++) {
			temp = new Node7();
			temp.data = Data[i];
			if(L == null) {
				L = temp;
				end =  L;
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
	
	Node7 delSearch(Node7 L, int x) {
		Node7  temp = L;
		Node7 pos = null;
		while(temp != null && x != (Integer)temp.data) {
			pos = temp;
			temp = temp.link;
		}
		return pos;
	}
	
	Node7 delete(Node7 p, int x) {
		Node7 pos, temp = null;
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
			System.out.println("*** 삭제할 원ㄴ소 " + x + " 없습니다. \n" );
			print(p);
		}
		return p;
	}
	
	void print(Node7 p) {
		while (p != null) {
			System.out.println(p.data+" -> ");
			p = p.link;
		}
		System.out.println("null \n");
	}
}
