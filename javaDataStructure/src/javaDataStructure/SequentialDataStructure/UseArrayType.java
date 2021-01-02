package javaDataStructure.SequentialDataStructure;


public class UseArrayType {
	
	static void print(int[][] a, String name)
	{
		for(int i = 0; i < a.length; i++)
			for(int j = 0; j < a[i].length; j++)
				System.out.println(name+"["+i+"]["+j+"] = "+a[i][j]);
		System.out.println();
	}
	
	public static void main(String[] args) {
		int[][] intArray1 = new int[2][2];
		int[][] intArray2 = {{1,2}, {3,4}, {5,6}};
		print(intArray1,"intArray1");
		print(intArray2,"intArray2");
		for(int i = 0; i < intArray2.length; i++)
			for(int j = 0; j < intArray2[i].length; j++)
				intArray2[i][j] = i*j;
		print(intArray2, "intArray2");
	}

}
