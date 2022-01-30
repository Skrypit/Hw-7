package shapes;

import tools.Shape;

public class Square extends Shape {

    @Override
    public String getShapeName() {
        String name = "Квадрат";
        return name;
    }

    @Override
    public String getColor(String colorName) {
        String colorOfTheShape = colorName;
        return colorOfTheShape;
    }

}


