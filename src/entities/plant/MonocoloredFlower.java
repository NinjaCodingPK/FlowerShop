package entities.plant;

import entities.enums.Color;

/**
 * Created by wookie on 6/19/16.
 */
public class MonocoloredFlower extends Flower {
    private Color color;

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "MonocoloredFlower{" + super.toString() +
                "color=" + color +
                '}';
    }
}
