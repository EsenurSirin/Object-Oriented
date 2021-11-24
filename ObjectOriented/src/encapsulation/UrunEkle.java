package encapsulation;

public class UrunEkle {

    public void add(Urun urun) {
        System.out.println("Ürün eklendi.");

        urun.setId("AHWSNDWK");
        urun.setMarka("openmind");
        urun.setModel("FT-J");
        urun.setRenk("Gri");
    }

    // dilersek ürünü silme komutu ile silebiliriz.
    public void remove(Urun urun) {

    }
}
