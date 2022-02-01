package tools;

import interfaces.Colorable;


public abstract class Shape implements Colorable, Cloneable {

     public String getShapeName() {
         return "shape";
    }

    @Override
    public Shape clone() {
        try {
            return (Shape) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}

