package ex1;

public class Shapes {

	public static void main(String[] args){
		String result = Utilities.getUserInputWindow("Shape Choice:", "Please choose a shape", "Circle", "Square", "Triangle");
		if( result == "Circle"){
			String radius = Utilities.getInput("Please Choose a Radius for your circle:");
			double dblRad = Utilities.strToDbl(radius);
			Utilities.showMsg("Your Circle Radius is: " + radius + "\nYour Circle Circumference is: " + Utilities.circleCircumference(dblRad) + "\nYour Circle Area is: " + Utilities.circleArea(dblRad));
		} else if(result == "Square"){
			String sqSide = Utilities.getInput("Please Choose a Side Length");
			double sqSideDbl = Utilities.strToDbl(sqSide);
			Utilities.showMsg("Your Square Side Length is: " + sqSide + "\nYour Square Permimeter is: " + Utilities.squarePerimeter(sqSideDbl) + "\nYour Square Area is: " + Utilities.squareArea(sqSideDbl));
		} else if(result == "Triangle"){
			double[] trSides = new double[]{1, 2, 3};
			//double[] trSides = Utilities.getNumbersAsDbls(0);
			double trPerimeter = Utilities.sumDblArray(trSides);
			// double trSideLengths = 
			Utilities.showMsg("Your triangle side lengths are: " + /*trSideLengths +*/ "\nYour triangle perimeter is: " + /*Utilities.trianglePerimeter(trPerimeter)*/ trPerimeter + "\nYour triangle Area is: " /* Utilities.triangleArea(base, height)*/);
		}
	} // end of main method
}



