package encapsulation;

public class Urun {

    // Bu örnekteki tek fark tüm özelliklerin private ile encapsulation edilmiş ve her
    // birine get ve set metodu kullanılmış olmasıdır.

    private String id;
    private String marka;
    private String model;
    private String renk;

    public Urun(String id, String marka, String model, String renk) {
        this.id = id;
        this.marka = marka;
        this.model = model;
        this.renk = renk;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        //this.id = id;
        // set id gövdesini tanımlamış olduk.Yazı karakteri olarak verdiğim ıd'yi parçaladım.
        this.id = id.substring(0, 1) + id.substring(5, 6) + id.substring(2);
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }
}
