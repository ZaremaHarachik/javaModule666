package Practical.work2;

import java.util.Objects;

public class Guitar implements Instrument {
    private int numOfstrings;

    public Guitar() {
    }

    public Guitar(int numOfstrings) {
        this.numOfstrings = numOfstrings;
    }

    public int getNumOfstrings() {
        return numOfstrings;
    }

    public void setNumOfstrings(int numOfstrings) {
        this.numOfstrings = numOfstrings;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Guitar guitar = (Guitar) o;
        return numOfstrings == guitar.numOfstrings;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numOfstrings);
    }

    @Override
    public void play() {
   System.out.println("Plaing a guitar with"+getNumOfstrings());
    }


    @Override
    public String toString() {
        return "Guitar{" +
                "numOfstrings=" + numOfstrings +
                '}';
    }
}
