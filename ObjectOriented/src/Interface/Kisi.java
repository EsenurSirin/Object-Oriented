package Interface;

public class Kisi implements Davranis {

    private String isim;
    private String soyisim;
    private int yas;
    private String kisiOzellikleri;

    public void start() {
        System.out.println("Kişi davranış sergiledi.");

    }

    public Kisi(String isim, String soyisim, int yas, String kisiOzellikleri) {
        this.isim = isim;
        this.soyisim = soyisim;
        this.yas = yas;
        this.kisiOzellikleri = kisiOzellikleri;
    }

    @Override
    public void iyiDavranir() {

    }

    @Override
    public void kotuDavranir() {

    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyisim() {
        return soyisim;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public String getKisiOzellikleri() {
        return kisiOzellikleri;
    }

    public void setKisiOzellikleri(String kisiOzellikleri) {
        this.kisiOzellikleri = kisiOzellikleri;
    }
}
