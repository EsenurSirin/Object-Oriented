package encapsulation;

public class UrunTest {

    public static void main(String[] args) {

        // private olan ürün özellikleri get metudu ile çağrıldı.
        Urun urun = new Urun("AHWSNDWK", "openmind", "FT-J", "Gri");
        System.out.println("Ürün id numarası: " + urun.getId());
        System.out.println("Marka Adı: " + urun.getMarka());
        System.out.println(" Model Adı: " + urun.getModel());
        System.out.println("Ürün Rengi: " + urun.getModel());

        // Ürün eklendi.
        UrunEkle urunEkle = new UrunEkle();
        urunEkle.add(urun);
    }

}
