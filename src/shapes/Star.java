package shapes;

import tools.Shape;

public class Star extends Shape {

    @Override
    public String getShapeName() {
        String name = "Зірка";
        return name;
    }

    @Override
    public String getColor(String colorName) {
        String colorOfTheShape = colorName;
        return colorOfTheShape;
    }
}
