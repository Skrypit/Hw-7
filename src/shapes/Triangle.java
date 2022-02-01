package shapes;

import tools.Shape;

public class Triangle extends Shape {

    @Override
    public String getShapeName() {
        return "Трикутник";
    }

    @Override
    public String setColor(String colorName) {
        return colorName;
    }
}
