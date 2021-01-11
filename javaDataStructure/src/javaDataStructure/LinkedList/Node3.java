package javaDataStructure.LinkedList;

import java.util.Scanner;

public class Node3 {

	Object data;
	Node3 link;
	
	void build() {
		Node3 p = null, temp, end;
		end = p;
		System.out.println("자료를 입력하시오. \n --- 입력 마침 문자 : * ");
		Scanner scanner = new Scanner(System.in);
		while(true) {
			String x = scanner.next();
			if(x.equals("*"))
				break;
			temp = new Node3();
			temp.data = x;
			if(p == null) {
				p = temp;
				end = p;
			}
			else {
				end.link = temp;
				end = temp;
			}
			System.out.println("*** 리스트 출력 ***");
			display(p);
		}
		
	}
	void display(Node3 p) {
		if(p != null) {
			System.out.println(p.data+" -> ");
			display(p.link);
		}
		else System.out.println("null");
	}
	
	public static void main(String[] args) {
		Node3 list = new Node3();
		list.build();
	}
}
