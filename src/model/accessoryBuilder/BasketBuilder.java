package model.accessoryBuilder;

import entities.accessory.Accessory;
import entities.accessory.Basket;
import entities.enums.BasketSize;

/**
 * Created by wookie on 6/21/16.
 */
public class BasketBuilder extends AccessoryBuilder {
    private Basket basket;
    private BasketSize size;
    private int capacity;

    public BasketBuilder setSize(BasketSize size) {
        this.size = size;
        return this;
    }

    public BasketBuilder setCapacity(int capacity) {
        this.capacity = capacity;
        return this;
    }

    @Override
    public BasketBuilder setCost(int cost) {
        this.cost = cost;
        return this;
    }

    public Basket build() {
        basket = new Basket();
        super.build(basket);
        basket.setSize(size);
        basket.setCapacity(capacity);

        return basket;
    }
}
