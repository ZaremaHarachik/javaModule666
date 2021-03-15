package hw3.demo3;

public class Tie extends Clothess implements ClothesMen{
    private int code;

    public Tie() {
    }

    public Tie(int code) {
        this.code = code;
    }

    public Tie(int id, int code) {
        super(id);
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }


    @Override
    public String toString() {
        return "Tie{" +
                "code=" + code +
                "} " + super.toString();
    }

    @Override
    public void pull() {
        System.out.println("pull a tie with code 1234");

    }
}
