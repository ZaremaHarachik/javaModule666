package hw2.extands_papirus;

public class Main {
    public static void main (String[] args){


        Papirus papirus = new Papirus(1,"Maxim");
        Book book = new Book(2,"Lisa","paper");
        Magazine magazine = new Magazine(3,"Tinager","electron",100);
        Comics comics = new Comics(4,"ccc","aaa",50);

        System.out.println(papirus);
        System.out.println(comics);
    }
}
