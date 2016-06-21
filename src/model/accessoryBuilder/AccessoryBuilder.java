package model.accessoryBuilder;

import entities.accessory.Accessory;

/**
 * Created by wookie on 6/21/16.
 */
public abstract class AccessoryBuilder {
    protected int cost;

    public abstract AccessoryBuilder setCost(int cost);

    protected void build(Accessory accessory) {
        accessory.setCost(cost);
    }
}
