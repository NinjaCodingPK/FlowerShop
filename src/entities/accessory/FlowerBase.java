package entities.accessory;

import entities.enums.BaseType;

/**
 * Created by wookie on 6/19/16.
 */
public class FlowerBase extends Accessory {
    /**
     * Type of plant's base.
     */
    private BaseType baseType;

    public BaseType getBaseType() {
        return baseType;
    }

    public void setBaseType(BaseType baseType) {
        this.baseType = baseType;
    }

    @Override
    public String toString() {
        return "FlowerBase{" + super.toString() +
                "baseType=" + baseType +
                '}';
    }
}
