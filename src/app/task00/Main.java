package app.task00;

public class Main {
    public static void main(String[] args) {
        GeometricFigure[] figures = new GeometricFigure[3];
        figures[0] = new Circle(5.0);
        figures[1] = new Triangle(5.0, 8.0);
        figures[2] = new Square(5.0);

        double totalArea = calculateTotalArea(figures);
        System.out.println("Total area: " + totalArea);
    }

    public static double calculateTotalArea(GeometricFigure[] figures) {
        double totalArea = 0.0;
        for (GeometricFigure figure : figures) {
            totalArea += figure.getArea();
        }
        return totalArea;
    }
}
