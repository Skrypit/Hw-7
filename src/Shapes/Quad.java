package Shapes;

import Tools.Shape;

public class Quad extends Shape {

    public String getShapeName() {
        return "Чотирикутник";
    }

    public String quadSize(int width, int height) {

        return "Ширина чотирикутника = " + width + ", висота = " + height;
    }
    @Override
    public String color() {
        String colorOfTheTexts = "Is black";
        return  colorOfTheTexts;
    }
}
