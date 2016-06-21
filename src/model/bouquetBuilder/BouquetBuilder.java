package model.bouquetBuilder;

import entities.accessory.Basket;
import entities.accessory.FlowerRibbon;
import entities.accessory.FlowerWrapper;
import entities.bouquet.Bouquet;
import entities.enums.*;
import entities.plant.Flower;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wookie on 6/21/16.
 */
public class BouquetBuilder {
    private Bouquet bouquet;
    protected List<Flower> flowers = new ArrayList<>();
    protected Basket basket;
    protected FlowerRibbon ribbon;
    protected FlowerWrapper wrapper;
    protected int cost;
    protected CostType costType;
    protected FreshnessType freshness;
    protected BouquetType type;

    public Bouquet build() {
        bouquet = new Bouquet();
        bouquet.setCost(cost);
        bouquet.setBasket(basket);
        bouquet.setCostType(costType);
        bouquet.setFlowers(flowers);
        bouquet.setFreshness(freshness);
        bouquet.setRibbon(ribbon);
        bouquet.setType(type);
        bouquet.setWrapper(wrapper);

        return bouquet;
    }

    public BouquetBuilder addFlower(Flower flower) {
        if(this.flowers.size() < this.basket.getCapacity())
            this.flowers.add(flower);
        return this;
    }

    public BouquetBuilder setFlowers(List<Flower> flowers) {
        this.flowers = flowers;
        return this;
    }

    public BouquetBuilder setBasket(Basket basket) {
        this.basket = basket;
        return this;
    }

    public BouquetBuilder setRibbon(FlowerRibbon ribbon) {
        this.ribbon = ribbon;
        return this;
    }

    public BouquetBuilder setWrapper(FlowerWrapper wrapper) {
        this.wrapper = wrapper;
        return this;
    }

    public BouquetBuilder setCost(int cost) {
        this.cost = cost;
        return this;
    }

    public BouquetBuilder setCostType(CostType costType) {
        this.costType = costType;
        return this;
    }


    public BouquetBuilder setFreshness(FreshnessType freshness) {
        this.freshness = freshness;
        return this;
    }

    public BouquetBuilder setType(BouquetType type) {
        this.type = type;
        return this;
    }
}
