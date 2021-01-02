package javaDataStructure.SequentialDataStructure;

import java.util.Arrays;

public class UseArrayList1 {
	static void print(Object[] ob, int length) {
		for (int i = 0; i < length; i++)
			System.out.println(ob[i]+" ");
		System.out.println();
	}
	
	public static void main(String[] args) {
		int[] a = new int[3];
		for(int i = 0; i < a.length; i++)
			a[i] = i*3;
		char[] b = {'a','b','c','d','f'};
		System.out.println("int array : ");
		Object[] obj = new Object[5];
		for(int i = 0; i < a.length; i++)
			obj[i] = a[i];
		print(obj, a.length);
		System.out.println("char array : ");
		for (int i = 0; i < b.length; i++)
			obj[i] = b[i];
		print(obj, b.length);
		System.out.println("a 배열 : " + Arrays.toString(a));
		System.out.println("b 배열 : " + Arrays.toString(b));
	}
}
