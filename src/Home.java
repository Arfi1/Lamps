public class Home {
    public static void main(String[] args) {
        new Home().run();
    }

    private void run() {
        Room room = new Room();
        room.skriveBordsLampe.pushSwitch();
        room.readingLampe.pushSwitch();
    }
}
