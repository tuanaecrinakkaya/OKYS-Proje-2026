public class Kullanici {
    private String kullaniciID;
    private String ad;
    private String soyad;
    private String eposta;

    public Kullanici(String kullaniciID, String ad, String soyad, String eposta) {
        this.kullaniciID = kullaniciID;
        this.ad = ad;
        this.soyad = soyad;
        this.eposta = eposta;
    }

    public String getKullaniciID() { return kullaniciID; }
    public String getAd() { return ad; }
    public String getSoyad() { return soyad; }
    public String getEposta() { return eposta; }
}