package hw3.demo3;

public class Pants extends Clothess implements ClothesMen,ClothesWomen {
    private String type;

    public Pants() {
    }

    public Pants(String type) {
        this.type = type;
    }

    public Pants(int id, String type) {
        super(id);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    @Override
    public String toString() {
        return "Pants{" +
                "type='" + type + '\'' +
                "} " + super.toString();
    }

    @Override
    public void pull() {
        System.out.println("pull cotton pants");
    }

    @Override
    public void dress() {
        System.out.println("dress leather pants");
    }
}
