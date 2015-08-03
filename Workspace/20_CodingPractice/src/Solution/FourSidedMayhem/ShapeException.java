package Solution.FourSidedMayhem;

public class ShapeException extends RuntimeException {

	public ShapeException(String attemptedShape, Point point1, Point point2, Point point3, Point point4)
	  {
		super(String.format("The following four coordinates cannot be used to make a %s:\n pt1(%s)\n pt2(%s)\n pt3(%s)\n pt4(%s)", 
	            attemptedShape, point1, point2, point3, point4));
	  }
}
