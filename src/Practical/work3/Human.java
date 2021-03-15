package Practical.work3;

public class Human {
    private int id;

    public Human() {
    }

    public Human(int id) {
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
        return "Human{" +
                "id=" + id +
                '}';
    }
}
