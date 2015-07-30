package Solution.FourSidedMayhem;

	  public class Square extends Rectangle {

	    public Square(Point point1, Point point2, Point point3, Point point4)
	    {
	      super(point1, point2, point3, point4);
	      if (!isSquare(this))
	      {
	        throw new ShapeException(getClass().getName(), 
	        		point1, point2, point3, point4);
	      }
	    }
	      
	    public static boolean isSquare(Quadrilateral q) {
	      //All four sides must be same length and the length of the two diagonals must be equal
	      if ((q.getSide1().getLength() == q.getSide2().getLength() 
	        && q.getSide1().getLength() == q.getSide3().getLength() 
	        && q.getSide1().getLength() == q.getSide4().getLength()) 
	        && (new Line(q.getPoint1(), q.getPoint3()).getLength() == new Line(q.getPoint2(), q.getPoint4()).getLength()))
	      {
	        return true;
	      }
	      return false;
	    }

	    public double getArea() {
	      return Math.pow(getSide1().getLength(), 2);   
	    }

	    public String toString() {
	      StringBuilder sb = new StringBuilder();
	      if (getClass().getName().equals("Solution.FourSidedMayhem.Square"))
	      {
	        drawSquare(sb);
	      }
	      return sb.toString() + super.toString();
	    }

	    private static void drawSquare(StringBuilder sb) {
	      sb.append("A ______ B\n");
	      sb.append(" |      |\n");
	      sb.append(" |      |\n");
	      sb.append(" |______|\n");
	      sb.append("D        C\n");
	    }
	  }
	
