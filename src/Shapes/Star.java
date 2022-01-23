package Shapes;

import Tools.Shape;

public class Star extends Shape {
    public String getShapeName() {
        String name = "Зірка";
        return name;
    }
    @Override
    public String color() {
        String colorOfTheTexts = "Is yellow";
        return  colorOfTheTexts;
    }
}
