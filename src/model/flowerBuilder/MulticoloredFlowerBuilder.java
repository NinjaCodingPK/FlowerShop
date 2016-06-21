package model.flowerBuilder;

import entities.enums.Color;
import entities.plant.Flower;
import entities.plant.MulticoloredFlower;

import java.util.List;

/**
 * Created by wookie on 6/21/16.
 */
public class MulticoloredFlowerBuilder extends FlowerBuilder {
    private MulticoloredFlower flower;
    private List<Color> colors;

    public MulticoloredFlowerBuilder setColors(List<Color> colors) {
        this.colors = colors;
        return this;
    }

    public Flower build() {
        flower = new MulticoloredFlower();
        super.build(flower);
        flower.setColors(colors);

        return flower;
    }
}
