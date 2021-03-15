package hw3.demo4;

public class User {
    private int id;
    private String name;
    private int age;
    private Gender person;

    public User(int id, String name, int age, Gender person) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.person = person;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getPerson() {
        return person;
    }

    public void setPerson(Gender person) {
        this.person = person;
    }


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", person=" + person +
                '}';
    }
}
