package hw2.extands_demo;

public class Animals {
    private int id;
    private String type;

    public Animals() {
    }

    public Animals(int id, String type) {
        this.id = id;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    public  void eat(){
        System.out.println("hungry");
    }


    @Override
    public String toString() {
        return "Animals{" +
                "id=" + id +
                ", type='" + type + '\'' +
                '}';
    }
}
