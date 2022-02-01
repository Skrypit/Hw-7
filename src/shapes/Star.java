package shapes;

import tools.Shape;

public class Star extends Shape {

    @Override
    public String getShapeName() {
        return "Зірка";
    }

    @Override
    public String setColor(String colorName) {
        return colorName;
    }
}
