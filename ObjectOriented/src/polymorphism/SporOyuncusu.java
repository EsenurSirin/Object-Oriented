package polymorphism;

public class SporOyuncusu {

    public String name;
    public String takimIsmi;
    public int formaNumarasi;
    public double performansi;

    public SporOyuncusu(String name, int formaNumarasi, double performansi, String takimIsmi) {
        this.name = name;
        this.formaNumarasi = formaNumarasi;
        this.performansi = performansi;
        this.takimIsmi = takimIsmi;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFormaNumarasi() {
        return formaNumarasi;
    }

    public void setFormaNumarasi(int formaNumarasi) {
        this.formaNumarasi = formaNumarasi;
    }

    public double getPerformansi(double v) {
        return performansi;
    }

    public void setPerformansi(double performansi) {
        this.performansi = performansi;
    }

    public String getTakimIsmi() {
        return takimIsmi;
    }

    public void setTakimIsmi(String takimIsmi) {
        this.takimIsmi = takimIsmi;
    }

    public double performansHesaplama(double performans) {
        return performans = 100.00;

    }
}
