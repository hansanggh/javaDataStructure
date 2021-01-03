package javaDataStructure.SequentialDataStructure;

@FunctionalInterface
interface LambdaInterface {
	void print(int[][] a, String name);
}

public class LambdaUseArrayType {
	
	public static void main(String[] args) {
		int[][] intArray1 = new int[2][2];
		int[][] intArray2 = {{1,2}, {3,4}, {5,6}};
		LambdaInterface li = (a, name) -> {
			for(int i = 0; i < a.length; i++)
				for(int j = 0; j < a[i].length; j++)
					System.out.println(name + "["+i+"]["+j+"] = "+a[i][j]);
			System.out.println();
		};
		li.print(intArray1,"intArray1");
		li.print(intArray2,"intArray2");
		for(int i = 0; i < intArray2.length; i++)
			for(int j = 0; j < intArray2[i].length; j++)
				intArray2[i][j] = i*j;
		li.print(intArray2, "intArray2");
	}

}
