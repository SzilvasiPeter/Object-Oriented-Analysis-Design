package chapter04;

import java.util.LinkedList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class DogDoor {
    private boolean open;
    private List<Bark> allowedBarks;

    public DogDoor()
    {
        this.open = false;
        this.allowedBarks = new LinkedList<Bark>();
    }

    public void open() {
        System.out.println("The dog door is open");
        open = true;

        final Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                close();
                timer.cancel();
            }
        }, 5000);
    }

    public void close(){
        System.out.println("The dog door is close");
        open = false;
    }

    public boolean isOpen(){
        return open;
    }

    public List<Bark> getAllowedBark() {
        return allowedBarks;
    }

    public void setAllowedBark(List<Bark> allowedBark) {
        this.allowedBarks = allowedBark;
    }

    public void addAllowedBark(Bark bark) {
        allowedBarks.add(bark);
    }
}
