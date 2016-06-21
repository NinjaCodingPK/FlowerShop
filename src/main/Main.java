package main;

import entities.bouquet.Bouquet;
import entities.plant.Flower;
import model.bouquetBuilder.BouquetBuilder;
import model.bouquetBuilder.smallBouquetBuilder;
import model.flowerBuilder.FlowerBuilder;
import model.flowerBuilder.RoseBuilder;

/**
 * Created by wookie on 6/19/16.
 */
public class Main {
    public static void main(String[] args) {
        Bouquet b = new smallBouquetBuilder()
                .addFlower(new RoseBuilder().build())
                .addFlower(new RoseBuilder().build())
                .addFlower(new RoseBuilder().build())
                .addFlower(new RoseBuilder().build())
                .addFlower(new RoseBuilder().build())
                .addFlower(new RoseBuilder().build())
                .build();

        System.out.println(b);
    }
}
