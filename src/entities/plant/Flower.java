package entities.plant;

import entities.accessory.FlowerBase;
import entities.enums.StemType;

/**
 * Entity class "Flower".
 * Created by wookie on 6/19/16.
 */
public class Flower extends Plant {
    private int cost;
    /**
     * Value should be true if the plant needs a top-dressing. False - if not.
     */
    private boolean topDressing;
    /**
     * Value should be true if the plant needs a support. False - if not.
     */
    private boolean support;
    private FlowerBase base;
    private String name;
    private StemType stem;

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public StemType getStem() {
        return stem;
    }

    public void setStem(StemType stem) {
        this.stem = stem;
    }

    public boolean isTopDressing() {
        return topDressing;
    }

    public void setTopDressing(boolean topDressing) {
        this.topDressing = topDressing;
    }

    public boolean isSupport() {
        return support;
    }

    public void setSupport(boolean support) {
        this.support = support;
    }

    public FlowerBase getBase() {
        return base;
    }

    public void setBase(FlowerBase base) {
        this.base = base;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Flower{" + super.toString() +
                "cost=" + cost +
                ", topDressing=" + topDressing +
                ", support=" + support +
                ", base=" + base +
                ", name='" + name + '\'' +
                ", stem=" + stem +
                '}';
    }
}
