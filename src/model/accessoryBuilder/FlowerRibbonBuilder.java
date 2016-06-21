package model.accessoryBuilder;

import entities.accessory.FlowerRibbon;
import entities.enums.Color;

/**
 * Created by wookie on 6/21/16.
 */
public class FlowerRibbonBuilder extends AccessoryBuilder {
    private FlowerRibbon ribbon;
    private Color color;
    private int length;

    public FlowerRibbonBuilder setColor(Color color) {
        this.color = color;
        return this;
    }

    public FlowerRibbonBuilder setLength(int length) {
        this.length = length;
        return this;
    }

    @Override
    public FlowerRibbonBuilder setCost(int cost) {
        this.cost = cost;
        return this;
    }

    public FlowerRibbon build() {
        ribbon = new FlowerRibbon();
        super.build(ribbon);
        ribbon.setColor(color);
        ribbon.setLength(length);

        return ribbon;
    }
}
