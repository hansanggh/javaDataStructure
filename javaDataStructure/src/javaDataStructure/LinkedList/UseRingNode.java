package javaDataStructure.LinkedList;

public class UseRingNode {
	
	public static void main(String[] args) {
		RingNode obj = new RingNode();
		obj.build();
	}
}
class RingNode{
	Object data;
	RingNode link;
	void build() {
		RingNode L = null, temp, end;
		end = L;
		int[] Data = {15, 35, 67, 98};
		int no = Data.length;
		for(int i = 0; i < no; i++) {
			temp = new RingNode();
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
		end.link = L;
		System.out.println("*** 리스트 L 출력");
		L.print(L, end);
	}
	void print (RingNode p, RingNode end) {
		while (p != end) {
			System.out.println(p.data + " -> ");
			p = p.link;
		}
		System.out.println(end.data);
	}
}