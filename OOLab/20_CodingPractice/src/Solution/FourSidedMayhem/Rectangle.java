package Solution.FourSidedMayhem;

public class Rectangle  extends Parallelogram {

  
    public Rectangle(Point point1, Point point2, 
    		            Point point3, Point point4)
    {
      super(point1, point2, point3, point4);
      if (!isRectangle(this))
      {
        throw new ShapeException(getClass().getName(), getPoint1(), getPoint2(), getPoint3(), getPoint4());
      }
    }
   

    public static boolean isRectangle(Quadrilateral q) {
      //Opposite sides must be same length and length of diagonals must be the same
      if ((q.getSide1().getLength() == q.getSide3().getLength() 
        && q.getSide2().getLength() == q.getSide4().getLength()) && 
        (new Line(q.getPoint1(), q.getPoint3()).getLength() == new Line(q.getPoint2(), q.getPoint4()).getLength()))
      {
        return true;
      }
      return false;
    }

    public double getArea() {    
        return getSide1().getLength() * getSide2().getLength();
    }
    
    public String toString() {
      StringBuilder sb = new StringBuilder();
      if (getClass().getName().equals("Solution.FourSidedMayhem.Rectangle"))
      {
        drawRectangle(sb);
      }

      return sb.toString() + super.toString();
    }

    private static void drawRectangle(StringBuilder sb) {
      sb.append("A __________ B\n");
      sb.append(" |          |\n");
      sb.append(" |          |\n");
      sb.append(" |__________|\n");
      sb.append("D            C\n");
    }
  }
