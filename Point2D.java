//To create a parameterized constructor to accept x & y coordinates     
public class Point2D {
private int x,y;
public Point2D(int a,int b) {
x = a;
y = b;
}


//To Add public String getDetails() - to return string form points x and y coordinates
public String getDetails() {
return "Point ("+x+","+y+")";
}


//To Add isEqual method to Point2D class : boolean returning method : must return true if both points 
//are having same x, y coordinates or false otherwise. 
public boolean isEqual(Point2D p2) {
if(x==p2.getX() && y==p2.getY()) {
return true;
}
else 
{
return false;
}
}

//To Add a method to Point2D class -- to create and return new point having given x & y offset.
public Point2D createNewPoint(int n1,int n2) {
int p = n1 + x;
int q = n2 + y;
Point2D newPoint = new Point2D(p,q);
//returns the points p and q
return newPoint;
}


//to get the access of x and y coordinates
public int getX() {
return x;
}
public int getY() {
return y;
}
}

