package shapes;

import tools.Shape;

public class Quad extends Shape {

    @Override
    public String getShapeName() {
        return "Чотирикутник";
    }

    public String quadSize(int width, int height) {

        return "Ширина чотирикутника = " + width + ", висота = " + height;
    }

    @Override
    public String getColor(String colorName) {
        String colorOfTheShape = colorName;
        return colorOfTheShape;
    }
}
