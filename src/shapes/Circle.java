package shapes;

import tools.Shape;

public class Circle extends Shape {

    @Override
    public String getShapeName() {
        return "Коло";
    }

    @Override
    public String setColor(String colorName) {
        return colorName;
    }
}
