package hw2.extands_demo;

public class Fox extends Dogs {

    private int weight;

    public Fox() {
    }

    public Fox(int weight) {
        this.weight = weight;
    }

    public Fox(String place, int weight) {
        super(place);
        this.weight = weight;
    }

    public Fox(int id, String type, String place, int weight) {
        super(id, type, place);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }


    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public String toString() {
        return "Fox{" +
                "weight=" + weight +
                "} " + super.toString();
    }
}
