package Solution.FourSidedMayhem;

import java.util.*;

public class TestProgram {

	public static void main(String[] args) {
      basicDrawingsDisplay();
      collectionSorts();
    }

    private static void basicDrawingsDisplay() {
      ArrayList<Quadrilateral> quads = new ArrayList<>();

      Quadrilateral q;

      //Examples from Spec
      q = new Trapezium(new Point(0, 0), new Point(10, 0), new Point(8, 5), new Point(3.3, 5));
      System.out.println(q);
      quads.add(q);

      q = new Parallelogram(new Point(5.0, 5.0), new Point(11.0, 5.0), new Point(12.0, 20.0), new Point(6.0, 20.0));
      System.out.println(q);
      quads.add(q);

      q = new Rectangle(new Point(17.0, 14.0), new Point(30.0, 14.0), new Point(30.0, 28.0), new Point(17.0, 28.0));
      System.out.println(q);
      quads.add(q);

      q = new Square(new Point(4.0, 0.0), new Point(8.0, 0.0), new Point(8.0, 4.0), new Point(4.0, 4.0));
      System.out.println(q);
      quads.add(q);

      //Additional Tests
      q = new Trapezium(new Point(0, 0), new Point(0, 10), new Point(10, 16), new Point(10, 6));
      System.out.println(q);
      quads.add(q);

      q = new Kite(new Point(300, 100), new Point(100, 400), new Point(300, 600), new Point(500, 400));
      System.out.println(q);
      quads.add(q);
    }

    private static void collectionSorts() {
      ArrayList<Quadrilateral> quads = new ArrayList<>();

      Quadrilateral quad;
      quad = new Trapezium(new Point(0, 0), new Point(10, 0), new Point(8, 5), new Point(3.3, 5));
      quads.add(quad);

      quad = new Parallelogram(new Point(5.0, 5.0), new Point(11.0, 5.0), new Point(12.0, 20.0), new Point(6.0, 20.0));
      quads.add(quad);

      quad = new Rectangle(new Point(17.0, 14.0), new Point(30.0, 14.0), new Point(30.0, 28.0), new Point(17.0, 28.0));
      quads.add(quad);

      quad = new Square(new Point(4.0, 0.0), new Point(8.0, 0.0), new Point(8.0, 4.0), new Point(4.0, 4.0));
      quads.add(quad);

      quad = new Trapezium(new Point(100, 100), new Point(200, 100), new Point(300, 200), new Point(0, 200));
      quads.add(quad);

      quad = new Kite(new Point(300, 100), new Point(100, 400), new Point(300, 600), new Point(500, 400));
      quads.add(quad);

      quad = new Parallelogram(new Point(200, 100), new Point(400, 100), new Point(300, 200), new Point(100, 200));
      quads.add(quad);

      quad = new Rectangle(new Point(100, 100), new Point(400, 100), new Point(400, 200), new Point(100, 200));
      quads.add(quad);

      quad = new Square(new Point(100, 100), new Point(200, 100), new Point(200, 200), new Point(100, 200));
      quads.add(quad);

      quad = new Trapezium(new Point(100, 100), new Point(200, 100), new Point(200, 200), new Point(100, 200));
      quads.add(quad);

      quad = new Trapezium(new Point(100, 100), new Point(200, 100), new Point(300, 200), new Point(0, 200));
      quads.add(quad);

      quad = new Square(new Point(100, 100), new Point(200, 100), new Point(200, 200), new Point(100, 200));
      quads.add(quad);

      quad = new Parallelogram(new Point(100, 100), new Point(200, 100), new Point(270.7106, 171.7106), new Point(170.7106, 171.7106));
      quads.add(quad);


      //Sort

      System.out.println("\n\n********** UNSORTED **********");
      printQuadrilaterals(quads);
      Collections.sort(quads);

      System.out.println("\n********** DEFAULT SORT (By Type) **********");
      printQuadrilaterals(quads);


      System.out.println("\n********** SORT by Perimeter **********");
      Collections.sort(quads, Quadrilateral.getPerimeterComparator());
      printQuadrilaterals(quads);

      System.out.println("\n********** SORT by Area ***************");
      Collections.sort(quads, Quadrilateral.getAreaComparator());
      printQuadrilaterals(quads);


    }

    private static void printQuadrilaterals(List<Quadrilateral> quads) {
      for (Quadrilateral q : quads)
      {
        System.out.printf("%-40s Perimeter: %9.2f  Area: %9.2f\n", 
          q.getClass().getName(), 
          q.getPerimeter(), 
          q.getArea());
      }
    }
  }