import com.geometry.shapes.Circle;
import com.geometry.shapes.Rectangle;
import com.geometry.shapes.Shape;
import com.geometry.shapes.Triangle;
import com.geometry.three_dimensional_shapes.Cube;
import com.geometry.three_dimensional_shapes.Sphere;
import com.geometry.utils.GeometryUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 6);
        Triangle triangle = new Triangle(3, 5, 6);
        GeometryUtils utils = new GeometryUtils();
        Cube cube = new Cube(7);
        Sphere sphere = new Sphere(8);

        Collections.addAll(shapes, circle, rectangle, triangle);

        System.out.printf("Круг: площадь = %.2f, периметр = %.2f%n", circle.getArea(), circle.getPerimeter());
        System.out.printf("Прямоугольник: площадь = %.2f, периметр = %.2f%n", rectangle.getArea(), rectangle.getPerimeter());
        System.out.printf("Треугольник: площадь = %.2f, периметр = %.2f%n", triangle.getArea(), triangle.getPerimeter());
        System.out.printf("Диаметр круга = %.2f%n", circle.getDiameter());

        System.out.printf("Площадь круга в сантиметрах = %.2f%n", utils.metersToCentimeters(circle.getArea()));
        System.out.printf("Периметр прямоугольника в метрах = %.2f%n", utils.centimetersToMeters(rectangle.getPerimeter()));
        Shape shapeWithLargerArea = utils.getLargerArea(circle, rectangle);
        System.out.printf("Определение большей площади фигуры: %.2f%n", shapeWithLargerArea.getArea());

        System.out.printf("Общая площадь фигур: %.2f%n", utils.getTotalArea(shapes));

        System.out.printf("Куб: объем = %.2f, площадь поверхности = %.2f%n", cube.getVolume(), cube.getSurfaceArea());
        System.out.printf("Сфера: объем = %.2f, площадь поверхности = %.2f%n", sphere.getVolume(), sphere.getSurfaceArea());
    }
}
