package Solution.FourSidedMayhem;

public class Trapezium extends Quadrilateral {

	private double longBase, shortBase;
	private double slantingSide1, slantingSide2;

	public Trapezium(Point point1, Point point2, Point point3, Point point4) {
		super(point1, point2, point3, point4);
		if (!isTrapezium(this)) {
			throw new ShapeException(getClass().getName(), point1, point2,
					point3, point4);
		} else {
			calculate4Sides();
		}
	}

	public static boolean isTrapezium(Quadrilateral quad) {
		// At least one pair of the opposite sides must be parallel.
		// Lines are parallel if their slopes are the same
		if (quad.getSide1().getSlope() == quad.getSide3().getSlope()
				|| quad.getSide2().getSlope() == quad.getSide4().getSlope()) {
			return true;
		}
		return false;
	}

	private void calculate4Sides() {
		// to avoid repeating the calculations
		double s1Length = getSide1().getLength();
		double s2Length = getSide2().getLength();
		double s3Length = getSide3().getLength();
		double s4Length = getSide4().getLength();

		if (getSide1().getSlope() == getSide3().getSlope()) {
			longBase = s1Length > s3Length ? s1Length : s3Length;
			shortBase = s1Length > s3Length ? s3Length : s1Length;
			slantingSide1 = s2Length;
			slantingSide2 = s4Length;
		} else // Side2 slope is equal to Side4 slope
		{
			longBase = s2Length > s4Length ? s2Length : s4Length;
			shortBase = s2Length > s4Length ? s4Length : s2Length;
			slantingSide1 = s1Length;
			slantingSide2 = s3Length;
		}
	}

	public double getArea() {

		// We will PROBABLY need to find the height of the trapezium here
		// This is basically done by calculating the area of an imaginary
		// triangle consisting of the 2 slanting sides and a 3rd side
		// made up of the difference between the long and short parallel
		// sides 'the bases'
		// You can think of this triangle as the original trapezium with
		// the largest possible parallelogram removed from it
		// As per diagram below we need the area of Triangle ADE which
		// is trapezium ABCD less parallelogram ABCE
		// Length DE = DC - AB (difference in length of parallel bases)
		// Then we can get the height of it which is the height of
		// the trapezium
		// A ___a___ B
		// /\ \
		// c / \e \ d
		// / \ \
		// /______\_______\
		// D b E a C
		// So we need 1st the area of Triangle ADE whose sides are
		// 'c' (slantingSide1)
		// 'e' which is equal to 'd' (slantingSide2) and
		// 'b' which is actually the length of DE
		// i.e the difference between the bases
		//
		// Problem only occurs if bases are same length as then you have
		// a triangle with one side (the base) of length 0
		// (effectively a triangle consisting of 2 straight lines on top of
		// each other!) and then Hero's formula comes back with an Area = 0.
		// Then when you do the Height = 2 * Area / Base calculation you are
		// dividing by 0.00 and then Height comes out at double.Nan
		// and it all gets messy.
		// So an alternative approach is needed only when your trapezium
		// is actually a parallelogram, i.e it has 2 sets of parallel sides
		// (it might be a rectangle or even a square but they are both
		// parallelograms)
		// So in this case we would need to use a different technique..one
		// that calculates the area of a parallelogram.
		// This revolves around calculating the area of a different triangle,
		// namely one of the 2 congruent triangles that you get when you
		// split a parallelogram in half by creating a line across the
		// diagonals.
		// and then just doubling it

		// If bases are different lengths then a 'proper' trapezium
		// and not a Square, Rectangle or Parallelogram

		if (longBase != shortBase) {
			double baseDiff = longBase - shortBase;
			// get area of the 'end' triangle consisting of 2 slantingSides
			// & difference between the length of bases
			// this is triangle ADE in the diagram above
			double triangleSize = CalculateTriangleArea(baseDiff,
					slantingSide1, slantingSide2);
			// but as area = base * height / 2
			// then height = area * 2 / base
			double height = triangleSize * 2 / baseDiff;
			return height * (longBase + shortBase) / 2;
		}
		// longbase and shortbase are equal
		// So it is a Parallelogram, (even if it a Rectangle or Square)
		// Can use same technique for each
		else // Parallelogram
		{
			// Calculate the area of 1 of the 2 congruent triangles
			// that are one half the Parallelogram and then double it
			// This would be a triangle made up of AB, BC and AC in
			// diagram above
			double halfArea = CalculateTriangleArea(getSide1().getLength(),
					getSide2().getLength(),
					new Line(getPoint1(), getPoint3()).getLength());
			return halfArea * 2;
		}

		// note in code above that the else{} could have found out if
		// the diagonals were same length in which case it is a rectangular
		// parallelogram (with no sloping sides) and then area would
		// be eitherBase * eitherSlantingSide
		// Probably not worth bothering.
	}

	// Produces the area of any triangle using Hero's formula
	protected double CalculateTriangleArea(double side1, 
			                               double side2,
			                               double side3) {
		double hp = (side1 + side2 + side3) / 2;
		return Math.sqrt(hp * (hp - side1) * (hp - side2) * (hp - side3));
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		if (getClass().getName().equals("Solution.FourSidedMayhem.Trapezium")) {
			drawTrapezium(sb);
		}
		return sb.toString() + super.toString();
	}

	private static void drawTrapezium(StringBuilder sb) {
		sb.append("   A ____ B\n");
		sb.append("    /    \\\n");
		sb.append("   /      \\\n");
		sb.append("  /________\\\n");
		sb.append("D            C\n");
	}
}
