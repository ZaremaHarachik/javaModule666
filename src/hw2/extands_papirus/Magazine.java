package hw2.extands_papirus;

public class Magazine extends Book{

    private int num;

    public Magazine() {
    }

    public Magazine(int num) {
        this.num = num;
    }

    public Magazine(String type, int num) {
        super(type);
        this.num = num;
    }

    public Magazine(int id, String name, String type, int num) {
        super(id, name, type);
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }


    @Override
    public String toString() {
        return "Magazine{" +
                "num=" + num +
                "} " + super.toString();
    }
}
