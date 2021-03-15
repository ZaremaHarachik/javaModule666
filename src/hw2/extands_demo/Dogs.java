package hw2.extands_demo;

public class Dogs extends Animals {

    private String place;

    public Dogs() {
    }

    public Dogs(String place) {
        this.place = place;
    }

    public Dogs(int id, String type, String place) {
        super(id, type);
        this.place = place;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public String toString() {
        return "Dogs{" +
                "place='" + place + '\'' +
                "} " + super.toString();
    }
}
