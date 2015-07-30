package Solution.FourSidedMayhem;

public class Line {
	private Point p1,p2;

    public Point getPoint1() {
		return p1;
	}

	public Point getPoint2() {
		return p2;
	}

	public Line(Point p1, Point p2) {
      this.p1 = p1;
      this.p2 = p2;
    }
    
    public double getLength() {     
      return p1.distanceTo(p2);
    }
    public double getSlope() {
      
        if (p1.getX() == p2.getX())
        {
          return Double.POSITIVE_INFINITY;
        }
        return (p1.getY() - p2.getY()) / (p1.getX() - p2.getX());
      
    }

    //Check to see if two lines intersect - no lines should intersect when trying to draw any kind of quadrilateral 
    public static boolean intersect(Line l1, Line l2) {                                                  
      int test1 , test2;
      test1 = counterClockwiseTurn(l1.getPoint1(), l1.getPoint2(), l2.getPoint1()) 
    		   * counterClockwiseTurn(l1.getPoint1(), l1.getPoint2(), l2.getPoint2());
      test2 = counterClockwiseTurn(l2.getPoint1(), l2.getPoint2(), l1.getPoint1()) 
    		  * counterClockwiseTurn(l2.getPoint1(), l2.getPoint2(), l1.getPoint2());
      return (test1 <= 0) && (test2 <= 0);
    }

    //Check to see if three points form an angle and if angle produces a clockwise or counter-clockwise turn.
    //Used when finding out if lines intersect
    private static int counterClockwiseTurn(Point a, Point b, Point c) {
      // Clockwise turn:            CounterClockwise turn:     Colinear (no turn):
      //               C            A________B  
      //              /                      \               
      //             /                        \                _____________________
      //  __________/                          \               A         B         C
      // A          B                           C
      //
      double area2 = (b.getX() - a.getX()) * (c.getY() - a.getY()) 
    		           - (b.getY() - a.getY()) * (c.getX() - a.getX());
      if (area2 < 0)      //clockwise turn
        return -1;
      else if (area2 > 0) //counter clockwise turn
        return +1;
      else                //no turn (collinear)
        return 0;
    }
}
