package models;

public class Point {
    //Coordinates of the point
    private double x;
    private double y;

    //Initialization of a point with coordinates
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    //Distance from the current point to the destination point
    public double distanceTo(Point destination) {
        double deltaX = destination.x - this.x;
        double deltaY = destination.y - this.y;
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }
    
    //String representation of the point
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
