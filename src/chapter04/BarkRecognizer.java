package chapter04;

public class BarkRecognizer {
    private DogDoor dogDoor;

    public BarkRecognizer(DogDoor dogDoor) {
        this.dogDoor = dogDoor;
    }

    public void recognize(Bark bark){
        System.out.println(" BarkRecognizer heard a '" + bark.getSound() + "'");
        for(Object b : dogDoor.getAllowedBark()){
            if(b.equals(bark)){
                dogDoor.open();
            } else {
                System.out.println("This dog is not allowed.");
            }
        }

    }
}
