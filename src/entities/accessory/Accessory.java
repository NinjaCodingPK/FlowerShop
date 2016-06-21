package entities.accessory;

/**
 * Created by wookie on 6/19/16.
 */
public abstract class Accessory {
    private int cost;

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Accessory{" +
                "cost=" + cost +
                '}';
    }
}
