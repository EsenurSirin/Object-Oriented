package inheritance;

public class MudurMaasi extends AsgariUcret {

    public MudurMaasi(int maas, int oran) {
        super(2000, 200);
    }

    @Override
    public void UcretHesaplama() {
        this.maas = (this.maas * oran / 20);
        System.out.println("Müdür Maaşı: " + this.maas);
    }
}
