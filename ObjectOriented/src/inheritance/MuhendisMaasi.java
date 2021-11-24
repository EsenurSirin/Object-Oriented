package inheritance;

public class MuhendisMaasi extends AsgariUcret {

    public MuhendisMaasi(int maas, int oran) {
        super(1000, 200);
    }

    @Override
    public void UcretHesaplama() {
        this.maas = (this.maas * oran / 20);
        System.out.println("Mühendis Maaşı: " + this.maas);
    }
}

