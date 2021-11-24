package encapsulation;

public class Kisi {

    public String isim;
    public String soyisim;
    public int yas;

    // Encapsulation method
    // Encapsulation yapmak istediğiniz nesneyi get set metodu ile başka bir sınıfta erişimine izin verebilirsiniz.
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        // this.email = email;

        // eğer kullanıcı hatalı bir mail girerse aşağıdaki mesajı döndür.
        if (email.contains("@")) {
            this.email = email;
        } else
            System.out.println("Hatalı email girdiniz. Lütfen yeniden deneyiniz.");
    }
}