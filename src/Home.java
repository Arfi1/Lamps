public class Home {
    public static void main(String[] args) {
        new Home().run();
    }

    private void run() {
        Room room = new Room();

        room.skriveBordsLampe.setName("Skrivebordslampe: ");
        System.out.print(room.skriveBordsLampe.getName());
        room.skriveBordsLampe.pushSwitch();

        room.readingLampe.setName("Læselampe: ");
        System.out.print(room.readingLampe.getName());
        room.readingLampe.pushSwitch();
    }
}
