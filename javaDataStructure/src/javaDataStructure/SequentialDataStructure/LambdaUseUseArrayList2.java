package javaDataStructure.SequentialDataStructure;


@FunctionalInterface
interface LambdaArray{
	void print(int[] a, char ch);
}

public class LambdaUseUseArrayList2 {
	
	public static void main(String[] args) {
		int[] a = new int[5];
		int b[] = {0,1,5,7,9};
		int c[] = new int[5];
		for(int i = 0; i < a.length; i++)
			{
				a[i] = i*i;
				c[i] = a[i] +b[i];
			}
		
		LambdaArray la = (ar, ch) -> {
			for(int i = 0; i < ar.length; i++)
				System.out.println(ch+"["+i+"] = "+ar[i]);
			System.out.println();
		};
		
		la.print(a, 'a');
		la.print(a, 'b');
		System.out.println("* 배열 a와 배열 b의 합 --- 배열 c");
		la.print(c, 'c');
	}

}
