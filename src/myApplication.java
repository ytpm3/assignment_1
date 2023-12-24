import models.Point;
import models.Shape;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class myApplication {
    public static void main(String[] args) throws FileNotFoundException {
        //Link to source file
        File file = new File("C:\\Users\\emqty\\IdeaProjects\\assign_1\\src\\source");

        Scanner sc = new Scanner(file);

        //Shape for points
        Shape shape = new Shape();

        //Variables for the first and previous points
        Point firstPoint = null;
        Point previousPoint = null;

        //Reading points from the file
        while (sc.hasNext()) {
            double x = sc.nextDouble();
            double y = sc.nextDouble();

            //Creating a Point with the coordinates
            Point point = new Point(x, y);

            //Adding the point to the Shape
            shape.addPoint(point);

            //Distance between points
            if (previousPoint != null) {
                double distance = previousPoint.distanceTo(point);
                System.out.println("Distance between " + previousPoint + " and " + point + " = " + distance);
            } else {
                firstPoint = point;
            }

            //Updating the previous point to the current point
            previousPoint = point;
        }

        //Printing the distance between the last and first points to close the shape
        if (previousPoint != null) {
            double distance = previousPoint.distanceTo(firstPoint);
            System.out.println("Distance between " + previousPoint + " and " + firstPoint + " = " + distance);
        }

        //Final output
        System.out.println("Perimeter: " + shape.calculatePerimeter());
        System.out.println("Average side: " + shape.getAverageSide());
        System.out.println("Longest side: " + shape.getLongestSide());
    }
}
