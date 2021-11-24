package Interface;

public class Kotu extends Kisi {

    public Kotu(String isim, String soyisim, int yas, String kisiOzellikleri) {
        super(isim, soyisim, yas, kisiOzellikleri);
    }

    public void kotuDavranir() {
        System.out.println("Kötü davrandı.");
    }
}
