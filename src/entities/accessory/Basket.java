package entities.accessory;

import entities.enums.BasketSize;

/**
 * Created by wookie on 6/19/16.
 */
public class Basket extends Accessory {
    private BasketSize size;
    /**
     * Max count of flowers which current basket can contain.
     */
    private int capacity;

    public BasketSize getSize() {
        return size;
    }

    public void setSize(BasketSize size) {
        this.size = size;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Basket{" + super.toString() +
                "size=" + size +
                ", capacity=" + capacity +
                '}';
    }
}
