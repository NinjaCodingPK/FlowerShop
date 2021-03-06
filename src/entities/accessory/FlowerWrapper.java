package entities.accessory;

import entities.enums.Color;

/**
 * Created by wookie on 6/19/16.
 */
public class FlowerWrapper extends Accessory {
    private Color color;

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "FlowerWrapper{" + super.toString() +
                "color=" + color +
                '}';
    }
}
