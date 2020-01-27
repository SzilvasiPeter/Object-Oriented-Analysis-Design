package chapter02;

public class DogDoorSimulator {
    public static void main(String[] args) {
        DogDoor dogDoor = new DogDoor();
        Remote remote = new Remote(dogDoor);

        System.out.println("Fido barks to go outside...");
        remote.pressButton();
        System.out.println("Fido has gone outside...");
        System.out.println("Fido's all done...");

        try{
            Thread.sleep(10000);
        } catch (InterruptedException e){ }
        System.out.println("... but he is stuck outside");
        System.out.println("Fido scratches at the door");
        System.out.println("Fido starts barking");
        System.out.println("... so Todd grabs the remote control");
        remote.pressButton();
        System.out.println("Fido's back inside...");
    }
}
