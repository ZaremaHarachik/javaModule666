package Practical.work2;

public class Main {
    public static void main (String[] args){

        Guitar guitar = new Guitar(7);
        Drum drum = new Drum(55);
        Trumpet trumpet = new Trumpet(11);

        Instrument[] instruments = {guitar,drum,trumpet};
        for (Instrument instrument : instruments){
            instrument.play();
            
        }


    }
}
