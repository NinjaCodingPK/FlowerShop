package model.bouquetBuilder;

import entities.accessory.Basket;
import entities.accessory.FlowerRibbon;
import entities.accessory.FlowerWrapper;
import entities.enums.*;
import model.accessoryBuilder.BasketBuilder;
import model.accessoryBuilder.FlowerRibbonBuilder;
import model.accessoryBuilder.FlowerWrapperBuilder;

/**
 * Created by wookie on 6/21/16.
 */
public class smallBouquetBuilder extends BouquetBuilder {
    public static final int BASKET_COST = 10;
    public static final int BASKET_CAPACITY = 5;
    public static final int RIBBON_COST = 5;
    public static final int RIBBON_LENGTH = 3;

    {
        basket = new BasketBuilder()
                .setCost(BASKET_COST)
                .setCapacity(BASKET_CAPACITY)
                .setSize(BasketSize.LITTLE)
                .build();
        ribbon = new FlowerRibbonBuilder()
                .setCost(RIBBON_COST)
                .setColor(Color.RED)
                .setLength(RIBBON_LENGTH)
                .build();
        wrapper = new FlowerWrapperBuilder()
                .setCost(10)
                .setColor(Color.RED)
                .build();
        cost = 100;
        costType = CostType.BUDGET;
        freshness = FreshnessType.GOOD;
        type = BouquetType.ALL;
    }
}
