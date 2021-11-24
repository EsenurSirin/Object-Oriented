package inheritance;

public class AsgariUcret {

    public int maas;
    public int oran;

    public AsgariUcret() {
    }

    public AsgariUcret(int maas, int oran) {
        this.maas = maas;
        this.oran = oran;
    }

    public void UcretHesaplama() {
        this.maas = (this.maas * oran / 20);
        System.out.println(this.maas);
    }
}
