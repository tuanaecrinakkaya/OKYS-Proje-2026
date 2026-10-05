public class Uye extends Kullanici {
    private int cezaPuani;

    public Uye(String kullaniciID, String ad, String soyad, String eposta, int cezaPuani) {
        super(kullaniciID, ad, soyad, eposta);
        this.cezaPuani = cezaPuani;
    }

    public int getCezaPuani() { return cezaPuani; }
    public void setCezaPuani(int cezaPuani) { this.cezaPuani = cezaPuani; }
}