package model.accessoryBuilder;

import entities.accessory.FlowerWrapper;
import entities.enums.Color;

/**
 * Created by wookie on 6/21/16.
 */
public class FlowerWrapperBuilder extends AccessoryBuilder {
    private FlowerWrapper wrapper;
    private Color color;

    public FlowerWrapperBuilder setColor(Color color) {
        this.color = color;
        return this;
    }

    @Override
    public FlowerWrapperBuilder setCost(int cost) {
        this.cost = cost;
        return this;
    }

    public FlowerWrapper build() {
        wrapper = new FlowerWrapper();
        super.build(wrapper);
        wrapper.setColor(color);

        return wrapper;
    }

}
