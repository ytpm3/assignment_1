package models;
import java.util.ArrayList;
public class Shape {
    // Collection to store the points forming the shape
    ArrayList<Point> points = new ArrayList<>();

    // Method to add a point to the list
    public void addPoint(Point point) {
        points.add(point);
    }

    // Method to calculate the perimeter of the shape
    public double calculatePerimeter() {
        double perimeter = 0;
        int size = points.size();

        // Iterating through points and calculating distances
        for (int i = 0; i < size; i++) {
            Point currentPoint = points.get(i);
            Point nextPoint = points.get((i + 1) % size);

            perimeter += currentPoint.distanceTo(nextPoint);
        }

        return perimeter;
    }

    // Method to calculate the average side length of the shape
    public double getAverageSide() {
        int size = points.size();
        if (size == 0) {
            return 0;
        }

        return calculatePerimeter() / size;
    }

    // Method to find the length of the longest side in the shape
    public double getLongestSide() {
        double longestSide = 0;

        // Iterating through points and finding the longest side
        for (int i = 0; i < points.size(); i++) {
            Point currentPoint = points.get(i);
            Point nextPoint = points.get((i + 1) % points.size());

            double currentSide = currentPoint.distanceTo(nextPoint);
            if (currentSide > longestSide) {
                longestSide = currentSide;
            }
        }

        return longestSide;
    }
}
