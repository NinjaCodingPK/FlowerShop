package entities.accessory;

import entities.enums.Color;

/**
 * Created by wookie on 6/19/16.
 */
public class FlowerRibbon extends Accessory {
    private Color color;
    private int length;

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "FlowerRibbon{" + super.toString() +
                "color=" + color +
                ", length=" + length +
                '}';
    }
}
