package encapsulation;

public class KisiTest {

    public static void main(String[] args) {

        Kisi kisi = new Kisi();
        kisi.isim = "Eşenur;";
        System.out.println("Kişi ismi: " + kisi.isim);
        kisi.soyisim = "Şirin";
        System.out.println("Kişinin Soyismi: " + kisi.soyisim);
        kisi.yas = 22;
        System.out.println("Kişinin yaşı: " + kisi.yas);


        // Encapsulation method
        kisi.setEmail("esnrsrn@icloud.com");
        System.out.println(kisi.getEmail());

        // kişi sınıfında yazdığımız if metodu sayesinde user hatalı mail girdiği için sistem user'ı uyarıyor.
        kisi.setEmail("esnrsrnicloud.com");
        System.out.println(kisi.getEmail());


    }

}
