package ex1;

import java.util.Arrays;

public class Lengths {
	
	public static int yards = 0;
	public static int feet = 0;
	public static int inches = 0;
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		int[] iArr0 = Utilities.variableJTextFieldBoxesAsIntArray("Length", 3, 6, 10);
		int yrd = iArr0[0];
		int ft = iArr0[1];
		int inc = iArr0[2];
		//int[] iArr1 = Utilities.remainderChanges(yrd, ft, inc);
		int[] iArr1 = Utilities.remainderChanges(1, 8, 9);

		int[] iArr2 = Utilities.remainderChanges(1, 4, 9);
		System.out.println(Arrays.toString(iArr1));
		System.out.println(Arrays.toString(iArr2));
		
		System.out.println();
		
		
		

	} // end of main method
} // end of class
