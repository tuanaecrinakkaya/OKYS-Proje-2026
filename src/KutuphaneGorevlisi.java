public class KutuphaneGorevlisi extends Kullanici {
    private String unvan;

    public KutuphaneGorevlisi(String kullaniciID, String ad, String soyad, String eposta, String unvan) {
        super(kullaniciID, ad, soyad, eposta);
        this.unvan = unvan;
    }

    public String getUnvan() { return unvan; }
    public void setUnvan(String unvan) { this.unvan = unvan; }
}