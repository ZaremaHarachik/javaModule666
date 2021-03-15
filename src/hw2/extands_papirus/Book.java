package hw2.extands_papirus;

public class Book extends Papirus{

    private String type;


    public Book() {
    }

    public Book(String type) {
        this.type = type;
    }

    public Book(int id, String name, String type) {
        super(id, name);
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
        return "Book{" +
                "type='" + type + '\'' +
                "} " + super.toString();
    }
}

