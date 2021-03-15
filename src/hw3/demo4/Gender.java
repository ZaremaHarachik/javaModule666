package hw3.demo4;

public enum Gender {
    male(35,"kokos"),
    female(30,"kisa");

    int age;
    String alias;

    Gender(int age, String alias) {
        this.age = age;
        this.alias = alias;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }


    @Override
    public String toString() {
        return "Gender{" +
                "age=" + age +
                ", alias='" + alias + '\'' +
                "} " + super.toString();
    }
}
