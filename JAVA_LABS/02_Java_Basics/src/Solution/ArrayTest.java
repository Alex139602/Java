package Solution;

import java.util.Arrays;

public class ArrayTest {

	public static void main(String[] args){
		
		int[] intArray = {1,2,3,4,5,6,7};
				
		for (int i = 0; i == intArray.length; i++){
			System.out.println(testMethod(intArray));			
		}
		
	}
	
	public static String[] testMethod(int[] intArrayInput){
		
		String[] strArray = new String[intArrayInput.length];
		
		for(int j=0; j == intArrayInput.length; j++ ){
			strArray[j] = Arrays.toString(intArrayInput);
		}
		
		return strArray;
		
		
	}
}

