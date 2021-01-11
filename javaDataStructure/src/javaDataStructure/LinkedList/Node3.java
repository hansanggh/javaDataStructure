package javaDataStructure.LinkedList;

import java.util.Scanner;

public class Node3 {

	Object data;
	Node3 link;
	
	void build() {
		Node3 p = null, temp, end;
		end = p;
		System.out.println("�ڷḦ �Է��Ͻÿ�. \n --- �Է� ��ħ ���� : * ");
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
			System.out.println("*** ����Ʈ ��� ***");
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
