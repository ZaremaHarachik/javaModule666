package hw3.demo1;

public enum Size {

    XXS(2),XS(2),S(4),M(6),L(8);
    int euroSize;

    Size(int euroSize) {
        this.euroSize = euroSize;
    }

    public int getEuroSize() {
        return euroSize;
    }

    public void setEuroSize(int euroSize) {
        this.euroSize = euroSize;
    }

String getDescription(){
        return "euroSize";

}

    @Override
    public String toString() {
        return "Size{" +
                "euroSize=" + euroSize +
                "} " + super.toString();

    }
}
