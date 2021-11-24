package Interface;

public class Iyi extends Kisi {

    public Iyi(String isim, String soyisim, int yas, String kisiOzellikleri) {
        super(isim, soyisim, yas, kisiOzellikleri);
    }

    public void iyiDavranir() {
        System.out.println("iyi davrandı.");
    }


}
