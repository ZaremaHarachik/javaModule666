package hw2.interface_demo;

public class WomensClothes implements DressWoman {

    private int id;
    private String name;

    public WomensClothes() {
    }

    public WomensClothes(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public void doDress() {
    System.out.println("Woman can get dressed !");
    }

    @Override
    public String toString() {
        return "WomensClothes{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
