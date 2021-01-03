package javaDataStructure.SequentialDataStructure;

import java.util.Arrays;

public class UseLinearList {
	
	public static void main(String[] args) {
		ArrayLinearList list1 = new ArrayLinearList();
		list1.insert(12);
		list1.insert(24);
		list1.insert(36);
		list1.insert(58);
		list1.insert(79);
		System.out.println("*** 삽입 후 선형 리스트 ***");
		list1.print();
		list1.delete(24);
		System.out.println("*** 삽입 후 선형 리스트 ***");
		list1.print();
		list1.delete(58);
		System.out.println("*** 삽입 후 선형 리스트 ***");
		list1.print();
		list1.delete(12);
		System.out.println("*** 삽입 후 선형 리스트 ***");
		list1.print();
		list1.delete(10);
		System.out.println("*** 삽입 후 선형 리스트 ***");
		list1.print();
	}
	
}

class ArrayLinearList{
	private int no;
	private int size;
	private int increment;
	private int[] itemList;
	
	public ArrayLinearList() {
		no = -1;
		size = 50;
		increment = 10;
		itemList = new int[size];
	}
	
	public boolean isEmpty() {
		return no == -1;
	}
	
	public void insert(int x) {
		int pos = 0;
		if(no == size-1) {
			size+=increment;
			int[] tempArray = new int[size];
			for(int i = 0; i <= no; i++)
				tempArray[i] = itemList[i];
			itemList = tempArray;
		}
		if(no == -1) {
			no++;
			itemList[no] = x;
		}
		else {
			for(int i = 0; i < no; i++)
				if(x > itemList[i])
					pos++;
			for(int i = no+1; i > pos; i--)
				itemList[i] = itemList[i-1];
			itemList[pos] = x;
			no++;
		}
	}
	
	public void delete(int x) {
		if(isEmpty())
			System.out.println("List Empty");
		else {
			int loc = -1;
			for(int i = 0; i <= no; i++)
				if(x == itemList[i])
					loc = i;
			if(loc == -1)
				System.out.println("삭제할 원소 "+x+" 없습니다. \n");
			else {
				for(int i = loc; i < no; i++)
					itemList[i] = itemList[i+1];
				no--;
			}
		}
	}
	
	public void print() {
		for(int i = 0; i < no; i++)
			System.out.println(itemList[i]+", ");
		System.out.println(itemList[no]+"\n");
	}
}
