package polymorphism;

public class VoleybolOyuncusu extends SporOyuncusu {

    public VoleybolOyuncusu(String name, int formaNumarasi, double performansi, String takiIsmi) {
        super(name, formaNumarasi, performansi, takiIsmi);
    }

    @Override
    public double performansHesaplama(double performans) {
        return performans = 50.99;
    }
}
