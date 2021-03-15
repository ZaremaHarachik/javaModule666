package hw2.extands_demo;

public class Cat extends Animals {
    private int paws;

    public Cat() {
    }

    public Cat(int paws) {
        this.paws = paws;
    }

    public Cat(int id, String type, int paws) {
        super(id, type);
        this.paws = paws;
    }

    public int getPaws() {
        return paws;
    }

    public void setPaws(int paws) {
        this.paws = paws;
    }


    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public String toString() {
        return "Cat{" +
                "paws=" + paws +
                "} " + super.toString();
    }
}
