package javaDataStructure.SequentialDataStructure;

import java.util.Vector;

public class VectorList {
	static void print(Vector<Integer> v) {
		for(int i = 0; i < v.size()-1; i++) {
			int num = v.get(i);
			System.out.println(num+", ");
		}
		System.out.println(v.get(v.size()-1));
	}
	
	static int search(Vector<Integer> v, int x) {
		for(int i = 0; i < v.size(); i++) {
			int num = v.get(i);
			if(num == x)
				return i;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<>();
		v.add(12);
		v.add(24);
		v.add(36);
		v.add(58);
		v.add(79);
		
		v.add(2, 32);
		System.out.println("*** 삽입 후 리스트 ***");
		print(v);
		System.out.println();
		int no = search(v, v.get(1));
		v.remove(no);
		System.out.println("*** 삭제 후 리스트 ***");
		print(v);
	}
}
