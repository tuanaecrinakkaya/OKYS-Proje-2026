public class KitapKopyasi {
    private String kopyaID;
    private String rafKodu;
    private Kitap kitap;
    private String durum;

    public KitapKopyasi(String kopyaID, String rafKodu, Kitap kitap, String durum) {
        this.kopyaID = kopyaID;
        this.rafKodu = rafKodu;
        this.kitap = kitap;
        this.durum = durum;
    }

    public String getKopyaID() { return kopyaID; }
    public String getRafKodu() { return rafKodu; }
    public Kitap getKitap() { return kitap; }
    public String getDurum() { return durum; }
}