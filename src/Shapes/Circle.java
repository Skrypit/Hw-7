package Shapes;

import Tools.Shape;

public class Circle extends Shape {
    public int radius;

    public String getShapeName() {
        String name = "Коло";
        return name;
    }
    @Override
    public String color() {
        String colorOfTheTexts = "Is black";
        return  colorOfTheTexts;
    }
}
