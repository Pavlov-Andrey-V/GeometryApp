import com.geometry.shapes.Circle;
import com.geometry.shapes.Rectangle;
import com.geometry.shapes.Triangle;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 6);
        Triangle triangle = new Triangle(3, 5, 6);

        System.out.printf("Круг: площадь = %.2f, периметр = %.2f%n", circle.getArea(), circle.getPerimeter());
        System.out.printf("Прямоугольник: площадь = %.2f, периметр = %.2f%n", rectangle.getArea(), rectangle.getPerimeter());
        System.out.printf("Треугольник: площадь = %.2f, периметр = %.2f%n", triangle.getArea(), triangle.getPerimeter());
        System.out.printf("Диаметр круга = %.2f%n", circle.getDiameter());
    }
}
