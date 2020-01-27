package chapter02;

public class DogDoorSimulator {
    public static void main(String[] args) {
        DogDoor dogDoor = new DogDoor();
        Remote remote = new Remote(dogDoor);

        System.out.println("Fido barks to go outside...");
        remote.pressButton();
        System.out.println("Fido has gone outside...");
        remote.pressButton();
        System.out.println("Fido's all done...");
        remote.pressButton();
        System.out.println("Fido's back inside...");
        remote.pressButton();
    }
}
