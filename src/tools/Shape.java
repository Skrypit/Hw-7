package tools;

import interfaces.Colorable;


public abstract class Shape implements Colorable, Cloneable {

     public String getShapeName() {
        String name = "shape";
        return name;
    }
}

