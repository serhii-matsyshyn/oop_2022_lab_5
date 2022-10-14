package flower.store;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private final List<Flower> flowersList;

    public Store() {
        this.flowersList = new ArrayList<>();
    }

    public Store(List<Flower> flowersList) {
        this.flowersList = flowersList;
    }

    // search flowers
    public List<Flower> search(Flower flower) {
        List<Flower> result = new java.util.ArrayList<>();
        for (Flower flower1 : flowersList) {
            if (flower1.almostEquals(flower)) {
                result.add(flower1);
            }
        }
        return result;
    }

    // add flower
    public void add(Flower flower) {
        flowersList.add(flower);
    }

    // example of using
    public static void main(String[] args) {
        Store store = new Store();

        // add flowers to store
        Flower flower = new Flower(FlowerType.ROSE);
        flower.setColor(FlowerColor.RED);
        flower.setPrice(10);
        store.add(flower);
        store.add(new Flower(FlowerType.ROSE, FlowerColor.BLUE, 20, 20));
        store.add(new Flower(FlowerType.CHAMOMILE, FlowerColor.RED, 0, 99));
        store.add(new Flower(FlowerType.TULIP, FlowerColor.RED, 0, 99));

        // search flowers
        Flower desiredFlower = new Flower(FlowerType.ANY, FlowerColor.RED, 0);
        List<Flower> result = store.search(desiredFlower);
        System.out.println("I want to buy " + desiredFlower);
        System.out.println(result);

        // search flowers
        desiredFlower = new Flower(FlowerType.ANY, FlowerColor.ANY, 0);
        result = store.search(desiredFlower);
        System.out.println("I want to buy " + desiredFlower);
        System.out.println(result);

        // search flowers
        desiredFlower = new Flower(FlowerType.TULIP, FlowerColor.BLUE, 0);
        result = store.search(desiredFlower);
        System.out.println("I want to buy " + desiredFlower);
        System.out.println(result);

    }
}
