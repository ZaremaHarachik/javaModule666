package hw2.extands_demo;

public class Wolf extends Dogs {
    private int height;

    public Wolf() {
    }

    public Wolf(int height) {
        this.height = height;
    }

    public Wolf(String place, int height) {
        super(place);
        this.height = height;
    }

    public Wolf(int id, String type, String place, int height) {
        super(id, type, place);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }


    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public String toString() {
        return "Wolf{" +
                "height=" + height +
                "} " + super.toString();
    }
}
