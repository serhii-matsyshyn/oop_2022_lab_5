package flower.store;

import java.util.List;

public class FlowerBucket {
    private final List<FlowerPack> flowerPacks;

    public FlowerBucket() {
        flowerPacks = new java.util.ArrayList<>();
    }

    public double getPrice() {
        double price = 0;
        for (FlowerPack flowerPack : flowerPacks) {
            price += flowerPack.getPrice();
        }
        return price;
    }

    public void add(FlowerPack flowerPack) {
        flowerPacks.add(flowerPack);
    }
}
