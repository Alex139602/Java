package ex1;

public class Shapes {

	public static void main(String[] args){
		String result = Utilities.getUserInputWindow("Shape Choice:", "Please choose a shape to calculate values for", "Circle", "Square", "Triangle (Side Lengths)", "Triangle (Area)");
		if( result == "Circle"){
			String radius = Utilities.getInput("Please Choose a Radius for your circle:");
			double dblRad = Utilities.strToDbl(radius);
			Utilities.showMsg("Your Circle Radius is: " + radius + "\nYour Circle Circumference is: " + Utilities.circleCircumference(dblRad) + "\nYour Circle Area is: " + Utilities.circleArea(dblRad));
		} else if(result == "Square"){
			double sqSideDbl = Utilities.strToDbl(Utilities.getInput("Please Choose a Side Length: "));
			Utilities.showMsg("Your Square Side Length is: " + sqSideDbl + "\nYour Square Permimeter is: " + Utilities.squarePerimeter(sqSideDbl) + "\nYour Square Area is: " + Utilities.squareArea(sqSideDbl));
		} else if(result == "Triangle (Side Lengths)"){
			Utilities.showMsg("Please input values for the Side lengths of the triangle");
			double[] trSideLengths = Utilities.variableJTextFieldBoxesAsDblArray("Side ", 2, 6, 10);
			double trPerimeter = Utilities.sumDblArray(trSideLengths);
			Utilities.showMsg("Your triangle side lengths are: " + trSideLengths + "\nYour triangle perimeter is: " + trPerimeter);
		} else if ( result == "Triangle (Area)"){
			Utilities.showMsg("Please input values of your triangle base and height");
			double[] dArr = Utilities.dbl_returnTwoJTextFields("Triangle Base: ", "Triangle Height: ");
			double base = dArr[1];
			double height = dArr[2];
			Utilities.triangleArea(base, height);
			Utilities.showMsg("Your Triangle values are:" + "\n" + "Base: " + base + "\nHeight: " + height);
			
		}
		Utilities.variableJTextFieldBoxesAsDblArray("Hello", 3, 6, 20);
	} // end of main method
}




