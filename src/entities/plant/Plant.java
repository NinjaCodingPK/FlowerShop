package entities.plant;

import entities.enums.PlantType;

/**
 * Entity class Plant.
 * Created by wookie on 6/19/16.
 */
public class Plant {
    private PlantType type;

    public PlantType getType() {
        return type;
    }

    public void setType(PlantType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Plant{" +
                "type=" + type +
                '}';
    }
}
