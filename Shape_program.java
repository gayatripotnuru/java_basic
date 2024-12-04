package basic;
abstract class Shape {
abstract void calculateArea();
abstract void calculatePerimeter();
}
class Circle extends Shape {
       int radius;
     double pi = 3.14;
     public Circle(int radius) {
        this.radius = radius;
    }
@Override
    void calculateArea() {
        System.out.println("Area of the Circle: " + pi * (radius * radius));
    }
@Override
    void calculatePerimeter() {
        System.out.println("Perimeter of the Circle: " + (2 * pi * radius));
    }
}
class Triangle extends Shape {
      double base, height, side1, side2, side3;
     public Triangle(double base, double height, double side1, double side2, double side3) {
        this.base = base;
        this.height = height;
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
     @Override
    void calculateArea() {
        System.out.println("Area of the Triangle: " + (0.5 * base * height));
    }
   @Override
    void calculatePerimeter() {
        System.out.println("Perimeter of the Triangle: " + (side1 + side2 + side3));
    }
}
public class Shape_program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Circle c = new Circle(5);
	        c.calculateArea();
	        c.calculatePerimeter();
 Triangle t = new Triangle(5, 6, 7, 8, 5);
	        t.calculateArea();
	        t.calculatePerimeter();
	}

}
