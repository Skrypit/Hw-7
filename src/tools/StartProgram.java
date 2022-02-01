package tools;

import shapes.Circle;
import shapes.Quad;
import shapes.Square;
import shapes.Star;
import shapes.Triangle;


public class StartProgram {

    public static void main(String[] args) {

        Shape circle = new Circle();
        System.out.println(circle.getShapeName());

        Quad quad = new Quad();
        System.out.println(quad.getShapeName() + "\n" + quad.quadSize(2, 5));

        Shape triangle = new Triangle();
        System.out.println(triangle.getShapeName());

        Shape star = new Star();
        System.out.println(star.getShapeName());

        Shape square = new Square();

        System.out.println(square.getShapeName() + ". Колір " + square.setColor("чорний"));

    }
}