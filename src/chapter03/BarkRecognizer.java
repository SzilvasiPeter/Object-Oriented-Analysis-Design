package chapter03;

public class BarkRecognizer {
    private DogDoor dogDoor;

    public BarkRecognizer(DogDoor dogDoor) {
        this.dogDoor = dogDoor;
    }

    public void recognize(String bark){
        System.out.println(" BarkRecognizer heard a '" + bark + "'");
        dogDoor.open();
    }
}
