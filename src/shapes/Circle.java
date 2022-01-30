package shapes;

import tools.Shape;

public class Circle extends Shape {

    @Override
    public String getShapeName() {
        String name = "Коло";
        return name;
    }

    @Override
    public String getColor(String colorName) {
        String colorOfTheShape = colorName;
        return colorOfTheShape;
    }
}
