import java.util.Random;

public class Lamp {
    Random random = new Random();
    boolean lampLightsOn = random.nextBoolean();

    private String name;
    Lamp(String name) {
    }

    Lamp () {

    }

    public void pushSwitch() {

        if (!lampLightsOn) {
            System.out.println("Lights on");
        } else {
            System.out.println("Lights off");
        }
    }

}


