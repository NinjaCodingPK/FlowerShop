package model.flowerBuilder;

import entities.enums.Color;
import entities.plant.Flower;
import entities.plant.MonocoloredFlower;

/**
 * Created by wookie on 6/21/16.
 */
public class MonocoloredFlowerBuilder extends FlowerBuilder {
    private MonocoloredFlower flower;
    protected Color color;

    public MonocoloredFlowerBuilder setColor(Color color) {
        this.color = color;
        return this;
    }

    public Flower build() {
        flower = new MonocoloredFlower();
        super.build(flower);
        flower.setColor(color);

        return flower;
    }
}
