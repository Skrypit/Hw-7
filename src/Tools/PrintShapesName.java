package Tools;

import Shapes.*;

public class PrintShapesName {
    public static void main(String[] args) {
        Shape circle = new Circle();
        System.out.println(circle.getShapeName());

        Shape square = new Square();
        System.out.println(square.getShapeName());

        Shape quad = new Quad();
        System.out.println(quad.getShapeName() + "\n" + ((Quad) quad).quadSize(2, 5));

        Shape triangle = new Triangle();
        System.out.println(triangle.getShapeName());

        Shape star = new Star();
        System.out.println(star.getShapeName());
    }
}