/*************************************************************************
 *  Compilation:  javac Sierpinski.java
 *  Execution:    java Sierpinski
 *
 *  @author:
 * Mychal Ortega
 * mlo77@scarletmail.rutgers.edu
 * mlo77
 *
 *************************************************************************/

public class Sierpinski {

    // Height of an equilateral triangle whose sides are of the specified length. 
    public static double height(double length) {
        double b = (Math.sqrt(3)*length)/2;
        return b;
	// WRITE YOUR CODE HERE

    }

    // Draws a filled equilateral triangle whose bottom vertex is (x, y) 
    // of the specified side length. 
    public static void filledTriangle(double x, double y, double length) {
        double h = height(length);
        double x0 = x - length/2.0;
        double x1 = x + length/2.0;
        double y0 = y - h;
        // StdDraw.line(x,y,x0,y0);
        // StdDraw.line(x,y,x1,y0);
        // StdDraw.line(x0,y0,x1,y0);
        StdDraw.filledPolygon(new double[] {x,x1,x0},new double[] {y,y+h,y+h});



	// WRITE YOUR CODE HERE
    }

    // Draws a Sierpinski triangle of order n, such that the largest filled 
    // triangle has bottom vertex (x, y) and sides of the specified length. 
    public static void sierpinski(int n, double x, double y, double length) {
        if (n > 0) {
        filledTriangle(x,y,length);
        n--;
        sierpinski(n,x + (length/2),y,length/2);
        sierpinski(n,x - (length/2) ,y,length/2);
        sierpinski(n,x,y + height(length),length/2);
    }





	// WRITE YOUR CODE HERE
    }

    // Takes an integer command-line argument n; 
    // draws the outline of an equilateral triangle (pointed upwards) of length 1; 
    // whose bottom-left vertex is (0, 0) and bottom-right vertex is (1, 0); and 
    // draws a Sierpinski triangle of order n that fits snugly inside the outline. 
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        double[] x = {0,1,0.5};
        double[] y = {0,0,(Math.sqrt(3)*1/2)};
        StdDraw.polygon(x,y);
        sierpinski(n,0.5,0,0.5);
        





	// WRITE YOUR CODE HERE 
    }
}
