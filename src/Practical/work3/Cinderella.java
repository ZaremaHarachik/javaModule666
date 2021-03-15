package Practical.work3;

public class Cinderella extends Human{
    private String footSize;

    public Cinderella(String footSize) {
        this.footSize = footSize;
    }

    public Cinderella(int id, String footSize) {
        super(id);
        this.footSize = footSize;
    }

    public String getFootSize() {
        return footSize;
    }

    public void setFootSize(String footSize) {
        this.footSize = footSize;
    }


    @Override
    public String toString() {
        return "Cinderella{" +
                "footSize='" + footSize + '\'' +
                "} " + super.toString();
    }
}
