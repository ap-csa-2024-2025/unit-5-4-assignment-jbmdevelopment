public class Main {
  public static double distance(int x, int y, int x2, int y2) {
     final int xDist = x2 - x;
     final int yDist = y2 - y;
     final int xSQ = xDist * xDist;
     final int ySQ = yDist * yDist;
     final int total = xSQ + ySQ;
     final double dist = Math.sqrt(total);
     return dist;
  }
  public static void main(String[] args) {
    System.out.print(distance(0, 5, 0, 0)); // expected 5.0
  }
    // test your functions here to make sure they work

  // Implement distance formula method here

  // implement one of your quadratic formula methods here

  // implement the other quadratic formula here
}
