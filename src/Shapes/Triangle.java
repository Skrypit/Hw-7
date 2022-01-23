package Shapes;

import Tools.Shape;

public class Triangle extends Shape {

    public String getShapeName() {
        String name = "Трикутник";
        return name;
    }
    @Override
    public String color() {
        String colorOfTheTexts = "Is black";
        return  colorOfTheTexts;
    }
}
