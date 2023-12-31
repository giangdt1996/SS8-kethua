package ra;



public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);

        shape = new Shape("red",false);
        System.out.println(shape);

        //Kiểm thử Class Shape
        System.out.println("---------SHAPE----------");

        System.out.println(shape);
        shape = new Shape("red", false);
        System.out.println(shape);
        //kiểm thử Class Circle
        System.out.println("---------CIRCLE----------");
        Circle circle = new Circle();
        System.out.println(circle);
        circle = new Circle(3.5);
        System.out.println(circle);
        circle = new Circle("indigo", false, 3.5);
        System.out.println(circle);
        //Kiểm thử RECTANGLE
        System.out.println("--------RECTANGLE----------");
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);
        rectangle = new Rectangle(2.3, 5.8);
        System.out.println(rectangle);
        rectangle = new Rectangle("orange", true, 3.8, 2.5);
        System.out.println(rectangle);
        //Kiểm thử SQUARE
        System.out.println("---------SQUARE----------");
        Square square = new Square();
        System.out.println(square);
        square = new Square(2.3);
        System.out.println(square);
        square = new Square("yellow", true, 5.8);
        System.out.println(square);
    }
}
