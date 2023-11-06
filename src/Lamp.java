import java.util.Random;

public class Lamp {
    Random random = new Random();
    boolean lampLightsOff = random.nextBoolean();

    private String name;
    Lamp(String name) {
    }

    Lamp () {

    }

    public void pushSwitch() {

        if (!lampLightsOff) {
            System.out.println("Lights on");
        } else {
            System.out.println("Lights off");
        }
    }

}


