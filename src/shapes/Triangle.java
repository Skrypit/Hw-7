package shapes;

import tools.Shape;

public class Triangle extends Shape {

    @Override
    public String getShapeName() {
        String name = "Трикутник";
        return name;
    }

    @Override
    public String getColor(String colorName) {
        String colorOfTheShape = colorName;
        return colorOfTheShape;
    }
}
