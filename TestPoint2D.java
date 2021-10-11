
public class TestPoint2D {
public static void main(String[] args) {
	
	
//Java program to parameterized constructor to accept x and y coordinates 
Point2D p1 = new Point2D(9,17);
Point2D p2 = new Point2D(9,17);

//To create and return new point having given x & y offset.
Point2D p3 = p1.createNewPoint(11,-4);

//To add public string getDetails() - to return string form of x and y
System.out.println("for point 1: "+p1.getDetails());
System.out.println("for point 2: "+p2.getDetails());
System.out.println("for point 3: "+p3.getDetails());

//To add isEqual method if both are same x & y coordinates or false
System.out.println("comparision between p1 and p2 : "+ p1.isEqual(p2)); 



}
}