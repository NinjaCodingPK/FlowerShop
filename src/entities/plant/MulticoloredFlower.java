package entities.plant;

import entities.enums.Color;

import java.util.List;

/**
 * Created by wookie on 6/19/16.
 */
public class MulticoloredFlower extends Flower {
    private List<Color> colors;

    public List<Color> getColors() {
        return colors;
    }

    public void setColors(List<Color> colors) {
        this.colors = colors;
    }

    @Override
    public String toString() {
        return "MulticoloredFlower{" + super.toString() +
                "colors=" + colors +
                '}';
    }
}
