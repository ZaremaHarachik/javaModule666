package hw3.demo3;

import hw3.demo3.Clothess;

public class Tshirt extends Clothess implements ClothesMen,ClothesWomen {
    private String color;

    public Tshirt() {
    }

    public Tshirt(String color) {
        this.color = color;
    }

    public Tshirt(int id, String color) {
        super(id);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    @Override
    public String toString() {
        return "Tshirt{" +
                "color='" + color + '\'' +
                "} " + super.toString();
    }


    @Override
    public void pull() {
System.out.println("pull me");
    }

    @Override
    public void dress() {
        System.out.println("pull white T-shirt");
    }
}
