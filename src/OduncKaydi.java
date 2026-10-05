public class OduncKaydi {
    private String islemID;
    private KitapKopyasi kopya;
    private Uye uye;
    private String alisTarihi;
    private String teslimTarihi;

    public OduncKaydi(String islemID, KitapKopyasi kopya, Uye uye, String alisTarihi, String teslimTarihi) {
        this.islemID = islemID;
        this.kopya = kopya;
        this.uye = uye;
        this.alisTarihi = alisTarihi;
        this.teslimTarihi = teslimTarihi;
    }

    public String getIslemID() { return islemID; }
    public KitapKopyasi getKopya() { return kopya; }
    public Uye getUye() { return uye; }
    public String getAlisTarihi() { return alisTarihi; }
    public String getTeslimTarihi() { return teslimTarihi; }
}