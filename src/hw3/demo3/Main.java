package hw3.demo3;

public class Main {
    public static void main (String[] args){

        Clothess clothess = new Clothess(1);
        Tshirt tshirt = new Tshirt(2,"white");
        Dress dress = new Dress(3,2000);
        Pants pants = new Pants(4,"cotton");
        Tie tie = new Tie(5,7575);


        ClothesMen clothesMen = tshirt;
        clothesMen.pull();
        ClothesMen clothesMen1 = pants;
        clothesMen1.pull();
        ClothesWomen clothesWomen = tshirt;
        clothesWomen.dress();
        ClothesWomen clothesWomen1 = pants;
        clothesWomen1.dress();
        ClothesWomen clothesWomen2 = dress;
        clothesWomen2.dress();
        ClothesMen clothesMen2 = tie;
        clothesMen2.pull();



    }
}
