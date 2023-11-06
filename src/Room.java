public class Room {

    Lamp getLamp = new Lamp();

    Lamp skriveBordsLampe = new Lamp("skrivebordslampe");



    public void setSkriveBordsLampe(Lamp skriveBordsLampe) {
        this.skriveBordsLampe = skriveBordsLampe;
    }

    public Lamp getSkriveBordsLampe() {
        return skriveBordsLampe;
    }

    Lamp readingLampe = new Lamp("Læselampe");

    public Lamp getReadingLampe() {
        return readingLampe;
    }

    public Lamp getGetLamp() {
        return getLamp;
    }
}
