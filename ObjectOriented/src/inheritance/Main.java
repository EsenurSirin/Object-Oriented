package inheritance;

public class Main {

    public static void main(String[] args) {

        MuhendisMaasi muhendisMaasi = new MuhendisMaasi(1000, 200);
        muhendisMaasi.UcretHesaplama();

        MudurMaasi mudurMaasi = new MudurMaasi(2000, 200);
        mudurMaasi.UcretHesaplama();

        Stajyer stajyer = new Stajyer(500, 200);
        stajyer.UcretHesaplama();

        // Bir diğer maaş yazdırma metodudur.
        AsgariUcret asgariUcret = new MudurMaasi(2000, 200);
        asgariUcret.UcretHesaplama();
    }
}
