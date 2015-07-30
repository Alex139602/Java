package Solution.FourSidedMayhem;

import java.util.Comparator;

public abstract class Quadrilateral implements Comparable<Quadrilateral> {

	private Point point1, point2, point3, point4;
	private Line side1, side2, side3, side4;
	private boolean pointsResequencedFlag;

	public Point getPoint1() {
		return point1;
	}
	public Point getPoint2() {
		return point2;
	}
	public Point getPoint3() {
		return point3;
	}
	public Point getPoint4() {
		return point4;
	}

	public Line getSide1() {
		return side1;
	}
	public Line getSide2() {
		return side2;
	}
	public Line getSide3() {
		return side3;
	}
	public Line getSide4() {
		return side4;
	}
	public boolean getPointsResequencedFlag() {
		return pointsResequencedFlag;
	}

	public Quadrilateral(Point p1, Point p2, Point p3, Point p4) {
		this.point1 = p1;
		this.point2 = p2;
		this.point3 = p3;
		this.point4 = p4;
		side1 = new Line(p1, p2);
		side2 = new Line(p2, p3);
		side3 = new Line(p3, p4);
		side4 = new Line(p4, p1);

		if (!isQuadrilateral(this)) {
//			 throw new ShapeException(getClass().getName(),
//			 p1, p2,
//			 p3, p4); // removed when swapPoints() implemented
			swapPoints();
			if (!isQuadrilateral(this)) {
				throw new ShapeException(getClass().getName(), 
						p1, p2, p3, p4);
			}
			
		}
	}

	public double getPerimeter() {
		return getSide1().getLength() + getSide2().getLength()
				+ getSide3().getLength() + getSide4().getLength();
	}

	public abstract double getArea();

	public String toString() {
		StringBuilder sb = new StringBuilder();

		sb.append(getClass().getName() + "\n");
		if (pointsResequencedFlag) {
			sb.append(String
					.format("\tNote: the Points have been resequenced\n"));
		}
		sb.append(String.format("\tPoint A  = %s\n", getPoint1()));
		sb.append(String.format("\tPoint B  = %s\n", getPoint2()));
		sb.append(String.format("\tPoint C  = %s\n", getPoint3()));
		sb.append(String.format("\tPoint D  = %s\n", getPoint4()));
		sb.append(String.format("\tSide A-B  = %.2f\n", getSide1()
				.getLength()));
		sb.append(String.format("\tSide B-C  = %.2f\n", getSide2()
				.getLength()));
		sb.append(String.format("\tSide C-D  = %.2f\n", getSide3()
				.getLength()));
		sb.append(String.format("\tSide D-A  = %.2f\n", getSide4()
				.getLength()));
		sb.append(String.format("\tPerimeter = %.2f\n", getPerimeter()));
		sb.append(String.format("\tArea      = %.2f\n", getArea()));
		return sb.toString();
	}

	// Swap either points 2 and 3 or 3 and 4 to ensure no lines intersect
	// Enhancement to allow the 4 points to be defined in any sequence
	private void swapPoints() {
		// Calculate proximity of point 2,3 & 4 to point 1
		// the two nearest become points 2 and 4. the furthest becomes point 3
		double distanceToPoint2 = point1.distanceTo(point2);
		double distanceToPoint3 = point1.distanceTo(point3);
		double distanceToPoint4 = point1.distanceTo(point4);
		if (distanceToPoint2 > distanceToPoint3
				&& distanceToPoint2 > distanceToPoint4) {
			// swap points 2 & 3 (or 2 & 4) as 2 is furthest away
			Point temp = point2;
			point2 = point3;
			point3 = temp;
			pointsResequencedFlag = true;
		} else {
			if (distanceToPoint4 > distanceToPoint2
					&& distanceToPoint4 > distanceToPoint3) {
				// swap points 4 & 3 (or 4 and 2) as 4 is furthest away
				Point temp = point4;
				point4 = point3;
				point3 = temp;
				pointsResequencedFlag = true;
			}
			// else - Point3 is already the furthest
		}
		// Recalc Sides
		side1 = new Line(point1, point2);
		side2 = new Line(point2, point3);
		side3 = new Line(point3, point4);
		side4 = new Line(point4, point1);
	}

	public static boolean isQuadrilateral(Quadrilateral quad) {
		// if side 1 and side 3 touch or side 2 and side 4 touch
		if (Line.intersect(quad.getSide1(), quad.getSide3())
				|| (Line.intersect(quad.getSide2(), quad.getSide4()))) {
			return false;
		}
		return true;
	}

	// Sort Sequence definitions
	// natural sort sequence is by name
	public int compareTo(Quadrilateral other) {
		return getClass().getName().compareTo(other.getClass().getName());
	}

	private static Comparator<Quadrilateral> areaComparerInstance = null;

	public static Comparator<Quadrilateral> getAreaComparator() {
		if (areaComparerInstance == null) {
			areaComparerInstance = new QuadrilateralAreaComparer();
		}
		return areaComparerInstance;
	}

	private static Comparator<Quadrilateral> perimeterComparerInstance = null;

	public static Comparator<Quadrilateral> getPerimeterComparator() {
		if (perimeterComparerInstance == null) {
			perimeterComparerInstance = new QuadrilateralPerimeterComparer();
		}
		return perimeterComparerInstance;

	}

	private static class QuadrilateralAreaComparer implements
			Comparator<Quadrilateral> {
		public int compare(Quadrilateral q1, Quadrilateral q2) {
			return (int) (q1.getArea() - q2.getArea());
		}
	}

	private static class QuadrilateralPerimeterComparer implements
			Comparator<Quadrilateral> {
		public int compare(Quadrilateral q1, Quadrilateral q2) {
			return (int) (q1.getPerimeter() - q2.getPerimeter());
		}
	}

}
