package shapes;

import tools.Shape;

public class Square extends Shape {

    @Override
    public String getShapeName() {
        return "Квадрат";
    }

    @Override
    public String setColor(String colorName) {
        return colorName;
    }

}


