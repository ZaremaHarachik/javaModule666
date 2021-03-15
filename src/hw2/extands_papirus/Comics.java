package hw2.extands_papirus;

public class Comics extends Book{

    private int price;

    public Comics() {
    }

    public Comics(int price) {
        this.price = price;
    }

    public Comics(String type, int price) {
        super(type);
        this.price = price;
    }

    public Comics(int id, String name, String type, int price) {
        super(id, name, type);
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
        return "Comics{" +
                "price=" + price +
                "} " + super.toString();
    }
}
