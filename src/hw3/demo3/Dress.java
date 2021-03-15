package hw3.demo3;

public class Dress extends Clothess implements ClothesWomen {
    private int price;

    public Dress() {
    }

    public Dress(int price) {
        this.price = price;
    }

    public Dress(int id, int price) {
        super(id);
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    @Override
    public String toString() {
        return "Dress{" +
                "price=" + price +
                "} " + super.toString();
    }

    @Override
    public void dress() {
        System.out.println("dress is very expensive");
    }
}
