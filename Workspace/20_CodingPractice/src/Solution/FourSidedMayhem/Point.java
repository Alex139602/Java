package Solution.FourSidedMayhem;

public class Point {
	private double x,y;
	
    public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
	public Point(double x, double y) {
      this.x = x;
      this.y = y;
    }
    public double distanceTo(Point p) {
      double xDiff = Math.abs(x - p.x);
      double yDiff = Math.abs(y - p.y);

      return Math.sqrt((xDiff * xDiff) + (yDiff * yDiff));
    }
    public String toString() {
      return String.format("X: {%.2f}, Y: {%.2f}", x, y);
    }
}
