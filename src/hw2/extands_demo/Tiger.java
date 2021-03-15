package hw2.extands_demo;

public class Tiger extends Cat {

    private int tail;

    public Tiger() {
    }

    public Tiger(int tail) {
        this.tail = tail;
    }

    public Tiger(int paws, int tail) {
        super(paws);
        this.tail = tail;
    }

    public Tiger(int id, String type, int paws, int tail) {
        super(id, type, paws);
        this.tail = tail;
    }

    public int getTail() {
        return tail;
    }

    public void setTail(int tail) {
        this.tail = tail;
    }


    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public String toString() {
        return "Tiger{" +
                "tail=" + tail +
                "} " + super.toString();
    }
}
