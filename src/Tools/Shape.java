package Tools;

import Interfaces.Colorable;
import Interfaces.Drawable;


 public abstract class Shape implements Drawable, Colorable, Cloneable {
    public String getShapeName() {
        String name = "shape";
        return name;
    }
}

