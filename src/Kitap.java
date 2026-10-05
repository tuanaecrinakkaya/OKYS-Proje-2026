public class Kitap {
    private String ISBN;
    private String baslik;
    private String yazar;
    private int yayinYili;
    private String durum;

    public Kitap(String ISBN, String baslik, String yazar, int yayinYili, String durum) {
        this.ISBN = ISBN;
        this.baslik = baslik;
        this.yazar = yazar;
        this.yayinYili = yayinYili;
        this.durum = durum;
    }

    public String getISBN() { return ISBN; }
    public String getBaslik() { return baslik; }
    public String getYazar() { return yazar; }
    public int getYayinYili() { return yayinYili; }
    public String getDurum() { return durum; }
}