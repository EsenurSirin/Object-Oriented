package abstraction;

public class Test {

    public static void main(String[] args) {

        OrtalamaYasamHesaplamasi insan = new InsanYasamiHesapla();
        insan.yasamHesaplama();
        insan.oldu();

        OrtalamaYasamHesaplamasi bitki = new BitkiYasamiHesapla();
        bitki.yasamHesaplama();
        bitki.oldu();

        OrtalamaYasamHesaplamasi hayvan = new HayvanYasamiHesapla();
        hayvan.yasamHesaplama();
        hayvan.oldu();

    }
}
