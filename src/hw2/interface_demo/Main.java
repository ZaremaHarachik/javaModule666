package hw2.interface_demo;

public class Main {
    public static void main (String[] args){

      WomensClothes womensClothes = new WomensClothes();
      MensClothes mensClothes = new MensClothes();

      checkDressWomans(womensClothes);
      checkDressMans(mensClothes);
    }

public static void checkDressWomans(DressWoman dressWoman){
        dressWoman.doDress();
}

public static void checkDressMans(DressMan dressMan){

}

}
