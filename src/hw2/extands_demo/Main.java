package hw2.extands_demo;

public class Main {

    public static void main (String[] args) {

        Animals animals = new Animals(1, "predators");
        Dogs dogs = new Dogs(2, "doglike", "forest");
        Fox fox = new Fox(3, "wild", "Ukraine", 40);
        Wolf wolf = new Wolf(4, "wild", "Ukraine", 50);

        Animals[] animals1 = new Animals[4];
        animals1[0] = animals;
        animals1[1] = dogs;
        animals1[2] = fox;
        animals1[3] = wolf;


        Dogs[] dogs1 = new Dogs[3];
        dogs1[0] = dogs;
        dogs1[1] = fox;
        dogs1[2] = wolf;


        Cat cat = new Cat(5, "meat-eater", 4);
        Tiger tiger = new Tiger(6, "eating deer", 4, 1);
        Leopard leopard = new Leopard(7,"xxxx",4,2);

        Animals[] animals2 = new Animals[4];
        animals2[0] = animals;
        animals2[1] = cat;
        animals2[2] = tiger;
        animals2[3] = leopard;


        Cat[] cats1 = new Cat[3];
        cats1[0] = cat;
        cats1[1] = tiger;
        cats1[2] = leopard;

     Animals[] animals3 = new Animals[7];
        animals3[0] = animals;
        animals3[1] = dogs;
        animals3[2] = fox;
        animals3[3] = wolf;
        animals3[4] = cat;
        animals3[5] = tiger;
        animals3[6] = leopard;

        checkAnimals(cat);
    }

    public static void checkAnimals(Animals animals){
        animals.eat();
    }

    }

