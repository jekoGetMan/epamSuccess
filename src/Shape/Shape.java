package Shape;

import java.util.Scanner;

interface Shape {
    float getArea();
    float getPerimeter();
    String toString();
}

class Rectangle implements Shape{
    public float length;
    public float width;
    public Rectangle(float length, float width){
        this.length = length;
        this.width = width;
    }

    public Rectangle(){

    }

    @Override
    public float getArea(){
        System.out.println("Finding area of rectangle with length: " + this.length + "and width = " + this.width);
        return this.length * this.width;
    }
    @Override
    public float getPerimeter(){
        System.out.println("Finding perimeter of rectangle with length = " + this.length + "and width = " + this.width);
        return 2 * (this.length + this.width);
    }

    @Override
    public String toString(){
        return "Rectangle = [length: " + this.length + ", width: " + this.width + ", area: " + getArea() + ", perimeter: " + getPerimeter() + "]";
    }
}

class Square extends Rectangle{
    public float side;
    public Square(float side){
        this.side = side;
    }

    @Override
    public float getArea(){
        System.out.println("Finding area of square with side = " + "{"+this.side+"}");
        return (this.side * this.side);
    }

    @Override
    public float getPerimeter(){
        System.out.println("Finding perimeter of square with side = " + "{"+this.side+"}");
        return (4 * this.side);
    }

    @Override
    public String toString(){
        return "Square = [side: " + this.side + ", area: " + getArea() + ", perimeter: " + getPerimeter() + "]";
    }
}

class Circle implements Shape{
    public float radius;
    public Circle(float radius){
        this.radius = radius;
    }

    @Override
    public float getArea(){
        System.out.println("Finding area of circle with radius = " + "{"+this.radius+"}");
        return this.radius * this.radius * 3.14f;
    }

    @Override
    public float getPerimeter(){
        System.out.println("Finding perimeter of circle with radius = " + "{"+this.radius+"}");
        return 6.28f * this.radius;
    }

    @Override
    public String toString(){
        return "Circle = [radius: " + this.radius + ", area: " + getArea() + ", perimeter: " + getPerimeter() + "]";
    }
}

class Main{
    private static final Scanner INPUT_READER = new Scanner(System.in);
    public static void main(String[] args){
        String[] lengthWidth = INPUT_READER.nextLine().split(" ");
        float length = Float.parseFloat(lengthWidth[0]);
        float width = Float.parseFloat(lengthWidth[1]);

        float side = Float.parseFloat(INPUT_READER.nextLine());
        float radius = Float.parseFloat(INPUT_READER.nextLine());

        Shape rectangle = new Rectangle(length, width);
        Rectangle square = new Square(side);
        Shape circle = new Circle(radius);

        System.out.println("==============================");
        System.out.println("Finding area and perimeter of shapes");
        System.out.println("============================== ");

        System.out.println("Area = " + rectangle.getArea() + " and Perimeter = " + rectangle.getPerimeter() + "\n");
        System.out.println("Area = " + square.getArea() + " and Perimeter = " + square.getPerimeter() + "\n");
        System.out.println("Area = " + circle.getArea() + " and Perimeter = " + circle.getPerimeter() + "\n");

        System.out.println("=====================");
        System.out.println(square.toString());
        System.out.println(circle.toString());
    }
}

