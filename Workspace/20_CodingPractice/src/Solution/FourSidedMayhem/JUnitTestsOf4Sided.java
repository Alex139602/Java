package Solution.FourSidedMayhem;

import static org.junit.Assert.*;

import org.junit.Test;

public class JUnitTestsOf4Sided {

	
    // Basic Trapezium Test
	@Test
    public void basicTrapezium() {

      //Arrange
      Point p1 = new Point(0, 0);
      Point p2 = new Point(10, 0); 
      Point p3 = new Point(8, 5); 
      Point p4 = new Point(3.3, 5); 
      double actualArea, expectedArea;
      double actualPerim, expectedPerim;

      // Act
      Trapezium target = new Trapezium(p1, p2, p3, p4);

      actualArea = target.getArea();
      expectedArea = 36.75;
      actualPerim = target.getPerimeter();
      expectedPerim = 26.08;

      // Assert
      assertEquals(expectedArea, actualArea, 0.01);
      assertEquals(expectedPerim, actualPerim, 0.01);

      assertTrue(Quadrilateral.isQuadrilateral(target));
      assertTrue(Trapezium.isTrapezium(target));
      assertFalse(Parallelogram.isParallelogram(target));
      assertFalse(Rectangle.isRectangle(target));
      assertFalse(Square.isSquare(target));
      assertFalse(Kite.isKite(target));


    }
	// Basic Trapezium Test
	// Points StartingAtDifferentCorner 1--> 2, 2-->3 etc
		@Test
	    public void basicTrapeziumSamePoints_StartingAtDifferentCorner() {

	      //Arrange
	      Point p2 = new Point(0, 0);
	      Point p3 = new Point(10, 0); 
	      Point p4 = new Point(8, 5); 
	      Point p1 = new Point(3.3, 5); 
	      double actualArea, expectedArea;
	      double actualPerim, expectedPerim;

	      // Act
	      Trapezium target = new Trapezium(p1, p2, p3, p4);

	      actualArea = target.getArea();
	      expectedArea = 36.75;
	      actualPerim = target.getPerimeter();
	      expectedPerim = 26.08;

	      // Assert
	      assertEquals(expectedArea, actualArea, 0.01);
	      assertEquals(expectedPerim, actualPerim, 0.01);

	      assertTrue(Quadrilateral.isQuadrilateral(target));
	      assertTrue(Trapezium.isTrapezium(target));
	      assertFalse(Parallelogram.isParallelogram(target));
	      assertFalse(Rectangle.isRectangle(target));
	      assertFalse(Square.isSquare(target));
	      assertFalse(Kite.isKite(target));


	    }
    
   
    // Trapezium Test with vertical parallels 
	// so both slopes are infinity
    @Test
    public void basicTrapeziumWithVerticalParallels() {

      //Arrange
      Point p1 = new Point(0, 0);
      Point p2 = new Point(0, 10); 
      Point p3 = new Point(8, 5); 
      Point p4 = new Point(8, 2); 
      double actualArea, expectedArea;
      double actualPerim, expectedPerim;

      // Act
      Trapezium target = new Trapezium(p1, p2, p3, p4);

      actualArea = target.getArea();
      expectedArea = 52;
      actualPerim = target.getPerimeter();
      expectedPerim = 30.68;

      // Assert
      assertEquals(expectedArea, actualArea, 0.01);
      assertEquals(expectedPerim, actualPerim, 0.01);

      assertTrue(Quadrilateral.isQuadrilateral(target));
      assertTrue(Trapezium.isTrapezium(target));
      assertFalse(Parallelogram.isParallelogram(target));
      assertFalse(Rectangle.isRectangle(target));
      assertFalse(Square.isSquare(target));
      assertFalse(Kite.isKite(target));
    }

    
    // Basic Trapezium Test - when Trapezium is actually a square
    @Test
    public void basicTrapeziumThatIsASquare() {
      //Arrange
      Point p1 = new Point(0, 0);
      Point p2 = new Point(0, 10);
      Point p3 = new Point(10,10);
      Point p4 = new Point(10, 0);
      double actualArea, expectedArea;
      double actualPerim, expectedPerim;

      // Act
      Trapezium target = new Trapezium(p1, p2, p3, p4);

      actualArea = target.getArea();
      expectedArea = 100;
      actualPerim = target.getPerimeter();
      expectedPerim = 40;

      // Assert
      assertEquals(expectedArea, actualArea, 0.01);
      assertEquals(expectedPerim, actualPerim, 0.01);

      assertTrue(Quadrilateral.isQuadrilateral(target));
      assertTrue(Trapezium.isTrapezium(target));
      assertTrue(Parallelogram.isParallelogram(target));
      assertTrue(Rectangle.isRectangle(target));
      assertTrue(Square.isSquare(target));
      assertTrue(Kite.isKite(target));
    }
    

    // Basic Trapezium Test 
    // when Trapezium is actually a parallelogram
    @Test
    public void basicTrapeziumThatIsAParallelogram() {
      //Arrange
      Point p1 = new Point(0, 0);
      Point p2 = new Point(0, 10);
      Point p3 = new Point(10, 16);
      Point p4 = new Point(10, 6);
      double actualArea, expectedArea;
      double actualPerim, expectedPerim;

      // Act
      Trapezium target = new Trapezium(p1, p2, p3, p4);

      actualArea = target.getArea();
      expectedArea = 100;
      actualPerim = target.getPerimeter();
      expectedPerim = 43.32;

      // Assert
      assertEquals(expectedArea, actualArea, 0.01);
      assertEquals(expectedPerim, actualPerim, 0.01);

      assertTrue(Quadrilateral.isQuadrilateral(target));
      assertTrue(Trapezium.isTrapezium(target));
      assertTrue(Parallelogram.isParallelogram(target));
    }
    

    // Basic Parallelogram Test
    @Test
    public void basicParallelogram() {

      //Arrange
      Point p1 = new Point(5, 5);
      Point p2 = new Point(11, 5);
      Point p3 = new Point(12, 20);
      Point p4 = new Point(6, 20);
      double actualArea, expectedArea;
      double actualPerim, expectedPerim;

      // Act
      Parallelogram target = new Parallelogram(p1, p2, p3, p4);

      actualArea = target.getArea();
      expectedArea = 90;
      actualPerim = target.getPerimeter();
      expectedPerim = 42.07;

      // Assert
      assertEquals(expectedArea, actualArea, 0.01);
      assertEquals(expectedPerim, actualPerim, 0.01);
      assertTrue(Quadrilateral.isQuadrilateral(target));
      assertTrue(Trapezium.isTrapezium(target));
      assertTrue(Parallelogram.isParallelogram(target));
      assertFalse(Rectangle.isRectangle(target)); 
      assertFalse(Square.isSquare(target));
      assertFalse(Kite.isKite(target));
    }


    // Basic Rectangle Test
    @Test
    public void basicRectangle() {

      //Arrange
      Point p1 = new Point(17, 14);
      Point p2 = new Point(30, 14);
      Point p3 = new Point(30, 28);
      Point p4 = new Point(17, 28);
      double actualArea, expectedArea;
      double actualPerim, expectedPerim;

      // Act
      Rectangle target = new Rectangle(p1, p2, p3, p4);

      actualArea = target.getArea();
      expectedArea = 182;
      actualPerim = target.getPerimeter();
      expectedPerim = 54;

      // Assert


      assertEquals(expectedArea, actualArea, 0.01);
      assertEquals(expectedPerim, actualPerim, 0.01);
      assertTrue(Quadrilateral.isQuadrilateral(target));
      assertTrue(Trapezium.isTrapezium(target));
      assertTrue(Parallelogram.isParallelogram(target));
      assertTrue(Rectangle.isRectangle(target));
      assertFalse(Square.isSquare(target));
      assertFalse(Kite.isKite(target));

    }


    // Basic Square Test
    @Test
    public void basicSquare() {

      //Arrange
      Point p1 = new Point(4, 0);
      Point p2 = new Point(8, 0);
      Point p3 = new Point(8, 4);
      Point p4 = new Point(4, 4);
      double actualArea, expectedArea;
      double actualPerim, expectedPerim;

      // Act
      Square target = new Square(p1, p2, p3, p4);

      actualArea = target.getArea();
      expectedArea = 16;
      actualPerim = target.getPerimeter();
      expectedPerim = 16;

      // Assert


      assertEquals(expectedArea, actualArea, 0.01);
      assertEquals(expectedPerim, actualPerim, 0.01);
      assertTrue(Quadrilateral.isQuadrilateral(target));
      assertTrue(Trapezium.isTrapezium(target));
      assertTrue(Parallelogram.isParallelogram(target));
      assertTrue(Rectangle.isRectangle(target));
      assertTrue(Square.isSquare(target));
      assertTrue(Kite.isKite(target));

    }


    ///Basic Kite Test
    @Test
    public void basicKite() {

      //Arrange
      Point p1 = new Point(3, 1);
      Point p2 = new Point(1, 4);
      Point p3 = new Point(3, 6);
      Point p4 = new Point(5, 4);
      double actualArea, expectedArea;
      double actualPerim, expectedPerim;

      // Act
      Kite target = new Kite(p1, p2, p3, p4);

      actualArea = target.getArea();
      expectedArea = 10;
      actualPerim = target.getPerimeter();
      expectedPerim = 12.87;

      // Assert
      assertEquals(expectedArea, actualArea, 0.01);
      assertEquals(expectedPerim, actualPerim, 0.01);
      assertTrue(Quadrilateral.isQuadrilateral(target));
      assertFalse(Trapezium.isTrapezium(target));
      assertFalse(Parallelogram.isParallelogram(target));
      assertFalse(Rectangle.isRectangle(target));
      assertFalse(Square.isSquare(target));
      assertTrue(Kite.isKite(target));

    }
    

    // Not A Valid Quadrilateral
    // This tested exception thrown before 
    // re sequencing of code introduced
    // This test will no longer throw that exception and
    // currently fails
    //@Test(expected = ShapeException.class)
//    public void preReSequencing_NotAQuadrilateralTest() {
//      //Arrange
//      Point p1 = new Point(400, 100);
//      Point p2 = new Point(100, 100);
//      Point p3 = new Point(400, 200);
//      Point p4 = new Point(100, 200);
//      
//      // Act
//      Rectangle target = new Rectangle(p1, p2, p3, p4);
//    }

    // After ReSequence 
    // IsAQuadTest SwapOfPoints_3_and_4
    @Test
    public void afterReSequence_IsAQuadTest_SwapOfPoints_3_and_4() {
      //Arrange
      Point p1 = new Point(400, 100);
      Point p2 = new Point(400, 200);
      Point p3 = new Point(100, 100);
      Point p4 = new Point(100, 200);
      
      // Act
      Rectangle target = new Rectangle(p1, p2, p3, p4);

      // Assert
      assertTrue(Quadrilateral.isQuadrilateral(target));
      assertTrue(Trapezium.isTrapezium(target));
      assertTrue(Parallelogram.isParallelogram(target));
      assertTrue(Rectangle.isRectangle(target));
      assertFalse(Square.isSquare(target));
      assertFalse(Kite.isKite(target));

    }

    // AfterReSequence
    // IsAQuadTest SwapOfPoints_2_and_3
    @Test
    public void afterReSequence_IsAQuadTest_SwapOfPoints_2_and_3() {
      //Arrange
      Point p1 = new Point(100, 100);
      Point p2 = new Point(400, 200);
      Point p3 = new Point(100, 200);
      Point p4 = new Point(400, 100);

      // Act
      Rectangle target = new Rectangle(p1, p2, p3, p4);

      // Assert
      assertTrue(Quadrilateral.isQuadrilateral(target));
      assertTrue(Trapezium.isTrapezium(target));
      assertTrue(Parallelogram.isParallelogram(target));
      assertTrue(Rectangle.isRectangle(target));
      assertFalse(Square.isSquare(target));
      assertFalse(Kite.isKite(target));

    }

    // Not A QuadrilateralTest After ReSequencing
    // Still Throws exception
    @Test(expected = ShapeException.class)
    public void afterReSequencing_NotAQuadrilateralTest() {
      //Arrange
      Point p1 = new Point(400, 100);
      Point p2 = new Point(400, 200);
      Point p3 = new Point(100, 101); // note 101 not 100
      Point p4 = new Point(100, 200);


      // Act
      Rectangle target = new Rectangle(p1, p2, p3, p4);

    }
  
}
