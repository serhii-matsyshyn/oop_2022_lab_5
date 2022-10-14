package flower.store;

import lombok.Getter;
import lombok.Setter;



@Setter
public class Flower {
    @Getter
    private double sepalLength;
    private FlowerColor color;
    @Getter
    private double price;
    @Getter
    private FlowerType flowerType;

    public Flower() {
    }

public Flower(FlowerType flowerType) {
        this.flowerType = flowerType;
    }

    public String getColor() {
        return color.toString();
    }
}
