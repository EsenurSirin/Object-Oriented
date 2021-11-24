package polymorphism;

public class BasketbolOyuncusu extends SporOyuncusu {

    public BasketbolOyuncusu(String name, int formaNumarasi, double performansi, String takimIsmi) {
        super(name, formaNumarasi, performansi, takimIsmi);
    }

    @Override
    public double performansHesaplama(double performans) {
        return performans = 54.99;
    }
}
