package javaDataStructure.SequentialDataStructure;

public class UseArrayList2 {
	
	static void print(int[] a, char ch)
	{
		for(int i = 0; i < a.length; i++)
			System.out.println(ch+"["+i+"] = " + a[i]);
		System.out.println();
	}

	public static void main(String[] args) {
		int[] a = new int[5];
		int b[] = {0,1,5,7,9};
		int c[] = new int[5];
		for(int i = 0; i < a.length; i++)
			{
				a[i] = i*i;
				c[i] = a[i] +b[i];
			}
		print(a, 'a');
		print(b, 'b');
		System.out.println("* 배열 a와 배열 b의 합 --- 배열 c");
		print(c, 'c');
	}

}
