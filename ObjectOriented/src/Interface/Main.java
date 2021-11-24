package Interface;

public class Main {
    public static void main(String[] args) {

        Iyi iyi = new Iyi("Eşenur", " şirin", 21, "mutlu eder.");
        iyi.iyiDavranir();
        Kotu kotu = new Kotu("ali", "ali", 22, "mutsuz eder.");
        kotu.kotuDavranir();


        Kisi iyi1 = new Iyi("Eşenur", "şirin", 21, "mutlu eder.");
        Kisi kotu1 = new Kotu("ali", "ali", 22, "mutsuz eder.");

        iyi.start();
        kotu.start();

    }
}