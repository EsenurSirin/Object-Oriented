package inheritance;

public class Stajyer extends AsgariUcret {

    public Stajyer(int maas, int oran) {
        super(500, 200);
    }

    @Override
    public void UcretHesaplama() {
        this.maas = (this.maas * oran / 20 + 100);
        System.out.println("Stajyer Maaşı: " + this.maas);
    }
}
