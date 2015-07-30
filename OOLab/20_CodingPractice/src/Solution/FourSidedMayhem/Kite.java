package Solution.FourSidedMayhem;

public class Kite extends Quadrilateral {
   
    public Kite(Point point1, Point point2, 
    		      Point point3, Point point4)
    {
      super(point1, point2, point3, point4);
      if (!isKite(this))
      {
        throw new ShapeException(getClass().getName(), point1, point2, point3, point4);
      }
    }
  
    public double getArea() {
        // area of kite = half product of diagonals (AC * BD)/2
        return (new Line(getPoint1(), getPoint3()).getLength() 
        		* new Line(getPoint2(), getPoint4()).getLength()) / 2; 
    }

    public String toString() {
      StringBuilder sb = new StringBuilder();
      if (getClass().getName().equals("Solution.FourSidedMayhem.Kite"))
      {
        drawKite(sb);
      }
      return sb.toString() + super.toString();
    }
    
    private static void drawKite(StringBuilder sb) {
      sb.append("      A      \n");
      sb.append("      /\\    \n");
      sb.append("     /  \\   \n");
      sb.append("    /    \\  \n");
      sb.append("  D/      \\B\n");
      sb.append("   \\      /  \n");
      sb.append("    \\    /   \n");
      sb.append("     \\  /    \n");
      sb.append("      \\/     \n");
      sb.append("       C      \n");
    }
    
    public static boolean isKite(Quadrilateral quad) {
      //two pairs of adjacent sides must be same length
      if ((quad.getSide1().getLength() == quad.getSide2().getLength() && quad.getSide3().getLength() == quad.getSide4().getLength()) 
       || (quad.getSide2().getLength() == quad.getSide3().getLength() && quad.getSide4().getLength() == quad.getSide1().getLength()))
      {
        return true;
      }
      return false;
    }
    
}
