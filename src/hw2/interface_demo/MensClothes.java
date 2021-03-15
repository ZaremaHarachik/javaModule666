package hw2.interface_demo;

public class MensClothes implements DressMan {

    private int age;
    private String surname;

    public MensClothes() {
    }

    public MensClothes(int age, String surname) {
        this.age = age;
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public void doDress() {
        System.out.println("Man can get dressed !");
    }

    @Override
    public String toString() {
        return "MensClothes{" +
                "age=" + age +
                ", surname='" + surname + '\'' +
                '}';
    }
}
