package Practical.work1;

public class Main {
    public static void main (String[] args){

        Book book1 = new Book("fantasy");
        Book book2 = new Book("history");
        Magazine magazine1 = new Magazine("Liza");
        Magazine magazine2 = new Magazine("Maxim");

        Printable[] printables = {book1,book2,magazine1,magazine2};
        for (Printable printable : printables){
            printable.print();
        }





    }
}
