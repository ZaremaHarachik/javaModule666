package hw3.demo3;

public class Clothess {

    private int id;

    public Clothess() {
    }

    public Clothess(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    @Override
    public String toString() {
        return "Clothes{" +
                "id=" + id +
                '}';
    }
}
