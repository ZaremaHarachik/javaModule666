package Practical.map;

public class Product<K,V> {
    private K age;
    private V size;

    public Product() {
    }

    public Product(K age, V size) {
        this.age = age;
        this.size = size;
    }

    public K getAge() {
        return age;
    }

    public void setAge(K age) {
        this.age = age;
    }

    public V getSize() {
        return size;
    }

    public void setSize(V size) {
        this.size = size;
    }


    @Override
    public String toString() {
        return "Product{" +
                "age=" + age +
                ", size=" + size +
                '}';
    }
}
