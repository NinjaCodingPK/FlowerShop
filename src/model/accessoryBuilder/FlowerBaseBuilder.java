package model.accessoryBuilder;

import entities.accessory.FlowerBase;
import entities.enums.BaseType;

/**
 * Created by wookie on 6/21/16.
 */
public class FlowerBaseBuilder extends AccessoryBuilder {
    private FlowerBase base;
    private BaseType baseType;

    public FlowerBaseBuilder setBaseType(BaseType baseType) {
        this.baseType = baseType;
        return this;
    }

    @Override
    public FlowerBaseBuilder setCost(int cost) {
        this.cost = cost;
        return this;
    }

    public FlowerBase build() {
        base = new FlowerBase();
        super.build(base);
        base.setBaseType(baseType);

        return base;
    }
}
