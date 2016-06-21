package model.flowerBuilder;

import entities.accessory.FlowerBase;
import entities.enums.PlantType;
import entities.enums.StemType;
import entities.plant.Flower;

/**
 * Created by wookie on 6/21/16.
 */
public abstract class FlowerBuilder {
    protected PlantType type;
    protected int cost;
    protected boolean topDressing;
    protected boolean support;
    protected FlowerBase base;
    protected String name;
    protected StemType stem;



    protected void build(Flower flower) {
        flower.setType(type);
        flower.setName(name);
        flower.setBase(base);
        flower.setCost(cost);
        flower.setSupport(support);
        flower.setTopDressing(topDressing);
        flower.setStem(stem);
    }

    public FlowerBuilder setStem(StemType stem) {
        this.stem = stem;
        return this;
    }

    public FlowerBuilder setType(PlantType type) {
        this.type = type;
        return this;
    }

    public FlowerBuilder setCost(int cost) {
        this.cost = cost;
        return this;
    }

    public FlowerBuilder setTopDressing(boolean topDressing) {
        this.topDressing = topDressing;
        return this;
    }

    public FlowerBuilder setSupport(boolean support) {
        this.support = support;
        return this;
    }

    public FlowerBuilder setBase(FlowerBase base) {
        this.base = base;
        return this;
    }

    public FlowerBuilder setName(String name) {
        this.name = name;
        return this;
    }

}
