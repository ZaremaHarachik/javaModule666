package hw3.demo1;

public class Clothes {

    private int price;
    private String color;
    private Size gauge;

    public Clothes() {
    }

    public Clothes(int price, String color, Size gauge) {
        this.price = price;
        this.color = color;
        this.gauge = gauge;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Size getGauge() {
        return gauge;
    }

    public void setGauge(Size gauge) {
        this.gauge = gauge;
    }


    @Override
    public String toString() {
        return "Clothes{" +
                "price=" + price +
                ", color='" + color + '\'' +
                ", gauge=" + gauge +
                '}';
    }
}
