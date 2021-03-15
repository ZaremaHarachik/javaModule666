package Practical.work3;

public class Prince extends Human{
    private String shoeFound;

    public Prince() {
    }

    public Prince(String shoeFound) {
        this.shoeFound = shoeFound;
    }

    public Prince(int id, String shoeFound) {
        super(id);
        this.shoeFound = shoeFound;
    }

    public String getShoeFound() {
        return shoeFound;
    }

    public void setShoeFound(String shoeFound) {
        this.shoeFound = shoeFound;
    }



    public void found() {
System.out.println( getShoeFound());
    }

    @Override
    public String toString() {
        return "Prince{" +
                "shoeFound='" + shoeFound + '\'' +
                "} " + super.toString();

}
}
