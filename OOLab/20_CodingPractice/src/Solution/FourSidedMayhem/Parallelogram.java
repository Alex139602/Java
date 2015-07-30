package Solution.FourSidedMayhem;

public class Parallelogram extends Trapezium {

    public Parallelogram(Point point1, Point point2, Point point3, Point point4)
    {
      super(point1, point2, point3, point4);
      if (!isParallelogram(this))
      {
        throw new ShapeException(getClass().getName(), 
        		getPoint1(), getPoint2(), getPoint3(), getPoint4());
      }
    }
   
    public double getArea() {
      
        // divide the parallelogram into 2 congruent triangles,
        //                
        //    A ___a___ B
        //    / \      /
        // b /   \ t1 / b
        //  / t2  \  /
        // /_______\/
        // D   a    C
        //
        // The total area of the parallelogram will be the sum of the areas
        // of t1 and t2.
        // 

        double halfArea 
             = CalculateTriangleArea(getSide1().getLength(), 
            		                 getSide2().getLength(), 
            		 new Line(getPoint1(), getPoint3()).getLength());

        return halfArea * 2;
      
    }

    public String toString() {
      StringBuilder sb = new StringBuilder();
      if (getClass().getName().equals("Solution.FourSidedMayhem.Parallelogram"))
      {
        drawParallelogram(sb);
      }
      return sb.toString() + super.toString();
    }

    private static void drawParallelogram(StringBuilder sb) {
      sb.append("   A_______B\n");
      sb.append("   /      /\n");
      sb.append("  /      /\n");
      sb.append(" /______/\n");
      sb.append("D       C\n");
    }
    public static boolean isParallelogram(Quadrilateral q) {
      //Opposite sides must be same length
      if (q.getSide1().getLength() == q.getSide3().getLength() && q.getSide2().getLength() == q.getSide4().getLength())
      {
        return true;
      }
      return false;
    }
  }
