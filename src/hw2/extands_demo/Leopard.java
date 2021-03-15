package hw2.extands_demo;

public class Leopard extends Cat {
    private int ears;

    public Leopard() {
    }

    public Leopard(int ears) {
        this.ears = ears;
    }

    public Leopard(int paws, int ears) {
        super(paws);
        this.ears = ears;
    }

    public Leopard(int id, String type, int paws, int ears) {
        super(id, type, paws);
        this.ears = ears;
    }

    public int getEars() {
        return ears;
    }

    public void setEars(int ears) {
        this.ears = ears;
    }


    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public String toString() {
        return "Leopard{" +
                "ears=" + ears +
                "} " + super.toString();
    }
}
