package ex1;

import java.util.Arrays;

public class TestingLoops {
	
	public static void main(String[] args){
		int[] iA = runTheNumbers(10, 1);
		String s = Arrays.toString(iA);
		System.out.println(s);
		
		doubleTheNumbers(2048);
		System.out.println();
		long[] iB = fibbonaciSequence(220);
		String ss = Arrays.toString(iB);
		System.out.println(ss);
	}

	public static long[] fibbonaciSequence(int nthElement) {
		long[] iArr = new long[nthElement+1];
		iArr[0] = 1;
		iArr[1] = 2;
		for (int i = 0; i < iArr.length; i++) {
			if ( i > 1 ) {
				iArr[i] = iArr[i-1] + iArr[i-2]; 
			}
			
		}
		return iArr;
	}
	

	public static int[] doubleTheNumbers(int x) {
		int[] iArr = new int[x+1];
		int ii = 1;
		do {
			System.out.print(ii + ", ");
			ii *= 2;
		} while (ii < 2*x);
		
		return iArr;
		
		
	}

	public static int[] runTheNumbers(int x, int stepSize) {
		int[] intArr = new int[x+1];
		for ( int i = 0; i < intArr.length ; i += stepSize ){
			intArr[i] = i;
		}
		return intArr;
	}

	
}
