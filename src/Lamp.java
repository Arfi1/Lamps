import java.util.Random;

public class Lamp {
    Random random = new Random();
    boolean lampLightsOn = random.nextBoolean();

    private String name;


    Lamp () {

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public void pushSwitch() {

        if (!lampLightsOn) {
            System.out.println("Lights on");
        } else {
            System.out.println("Lights off");
        }
    }

}


