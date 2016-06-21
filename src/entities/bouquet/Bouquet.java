package entities.bouquet;

import entities.accessory.Basket;
import entities.accessory.FlowerRibbon;
import entities.accessory.FlowerWrapper;
import entities.enums.*;
import entities.plant.Flower;

import java.util.List;

/**
 * Entity class "Bouquet".
 * Created by wookie on 6/19/16.
 */
public class Bouquet {
    private List<Flower> flowers;
    private Basket basket;
    private FlowerRibbon ribbon;
    private FlowerWrapper wrapper;
    private int cost;
    private CostType costType;
    private FreshnessType freshness;
    private BouquetType type;

    public List<Flower> getFlowers() {
        return flowers;
    }

    public void setFlowers(List<Flower> flowers) {
        this.flowers = flowers;
    }

    public Basket getBasket() {
        return basket;
    }

    public void setBasket(Basket basket) {
        this.basket = basket;
    }

    public FlowerRibbon getRibbon() {
        return ribbon;
    }

    public void setRibbon(FlowerRibbon ribbon) {
        this.ribbon = ribbon;
    }

    public FlowerWrapper getWrapper() {
        return wrapper;
    }

    public void setWrapper(FlowerWrapper wrapper) {
        this.wrapper = wrapper;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public CostType getCostType() {
        return costType;
    }

    public void setCostType(CostType costType) {
        this.costType = costType;
    }

    public FreshnessType getFreshness() {
        return freshness;
    }

    public void setFreshness(FreshnessType freshness) {
        this.freshness = freshness;
    }

    public BouquetType getType() {
        return type;
    }

    public void setType(BouquetType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Bouquet{" +
                "flowers=" + flowers +
                ", basket=" + basket +
                ", ribbon=" + ribbon +
                ", wrapper=" + wrapper +
                ", cost=" + cost +
                ", costType=" + costType +
                ", freshness=" + freshness +
                ", type=" + type +
                '}';
    }
}
