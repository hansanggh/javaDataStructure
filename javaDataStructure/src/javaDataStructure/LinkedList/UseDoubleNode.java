package javaDataStructure.LinkedList;

public class UseDoubleNode {

	public static void main(String[] args) {
		DoubleNode obj = new DoubleNode();
		obj.build();
	}
}
class DoubleNode{
	Object data;
	DoubleNode llink, rlink;
	
	void build() {
		DoubleNode L = null, temp, end, pred;
		end = L;
		int[] Data = {12, 35, 57};
		int no = Data.length;
		
		for(int i = 0; i < no; i++) {
			temp = new DoubleNode();
			temp.rlink = null;
			temp.llink = null;
			temp.data = Data[i];
			if(L == null) {
				L = temp;
				end = L;
			}
			else {
				end.rlink = temp;
				temp.llink = end;
				end = temp;
			}
		}
		System.out.println("* 리스트 L 출력 - 오른쪽링크 사용 ");
		L.printrt(L);
		System.out.println();
		System.out.println("* 리스트 L 출력 - 왼쪽링크 사용 ");
		L.printlt(end);
	}
	
	void printrt(DoubleNode p) {
		while(p != null) {
			System.out.println(p.data + " -> ");
			p = p.rlink;
		}
		System.out.println("null");
	}
	void printlt(DoubleNode p) {
		while(p != null) {
			System.out.println(p.data + " -> ");
			p = p.llink;
		}
		System.out.println("null");
	}
}
