package model.flowerBuilder;

import entities.accessory.FlowerBase;
import entities.enums.BaseType;
import entities.enums.Color;
import entities.enums.PlantType;
import entities.enums.StemType;
import model.accessoryBuilder.FlowerBaseBuilder;

/**
 * Created by wookie on 6/21/16.
 */
public class RoseBuilder extends MonocoloredFlowerBuilder {
    {
        type = PlantType.DOMESTIC;
        color = Color.RED;
        cost = 5;
        topDressing = false;
        support = false;
        base = new FlowerBaseBuilder()
                .setBaseType(BaseType.SOFT)
                .setCost(1)
                .build();
        name = "Rose";
        stem = StemType.MIDDLE;
    }
}
