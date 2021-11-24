package polymorphism;

public class Test {

    public static void main(String[] args) {

        /* Bu örnekte Voleybol oyuncusunun ve Basketbol oyuncusunun hem voleybol ve basketbol oyuncusu hem de spor oyuncusu olduğunu görmekteyiz.
        bu duruma polymorphism denir. Siz de bu şekil de örnekler vererek bir nesnenin birden fazla eyleme dönüşmesini sağlayabilirsiniz.*/


        // voleybol oyuncusu voleybol oyuncusudur.
        //basketbol oyuncusu basketbol oyuncusudur.
        VoleybolOyuncusu voleybolOyuncusu = new VoleybolOyuncusu("Aslı", 10, 50.99, "EFES");
        BasketbolOyuncusu basketbolOyuncusu = new BasketbolOyuncusu("Ceren", 28, 54.99, "Eczası Başı");

        // voleybol oyuncusu aynı zaman da spor oyuncusudur.
        SporOyuncusu performansHesaplama = new VoleybolOyuncusu("Aslı", 10, 50.99, "EFES");
        System.out.println("Voleybol Oyuncusunun İsmi: " + performansHesaplama.getName());
        System.out.println("Forma Numarası: " + performansHesaplama.formaNumarasi);
        System.out.println("Voleybol Takım İsmi: " + performansHesaplama.takimIsmi);
        System.out.println("Performansı: " + performansHesaplama.performansi);

        //basketbol oyuncusu aynı zaman da spor oyuncusudur.
        SporOyuncusu performansHesaplama1 = new BasketbolOyuncusu("Ceren", 28, 54.99, "Eczacı Başı");
        System.out.println("Basketbol Oyuncusunun İsmi: " + performansHesaplama1.getName());
        System.out.println("Forma Numarası: " + performansHesaplama1.formaNumarasi);
        System.out.println("Basketbol Takım İsmi: " + performansHesaplama1.takimIsmi);
        System.out.println("Performansı: " + performansHesaplama1.performansi);


        // Arrys metodu ile iki takımı liste içerisinde yazabiliyoruz. ve for döngüsü ile performanslarını yazdırabiliyoruz.
        SporOyuncusu[] sporOyuncusu = new SporOyuncusu[]{
                new VoleybolOyuncusu("Aslı", 10, 50.99, "EFES"),
                new BasketbolOyuncusu("Ceren", 28, 54.99, "Eczacı Başı"),
        };

        for (SporOyuncusu performans : sporOyuncusu) ;
        System.out.println(performansHesaplama.performansi);
        System.out.println(performansHesaplama1.performansi);


    }
}
