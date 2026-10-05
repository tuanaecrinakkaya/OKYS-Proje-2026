public class Main {
    public static void main(String[] args) {
        // 1. Kitap oluşturma
        Kitap kitap1 = new Kitap("975-07", "Kürk Mantolu Madonna", "Sabahattin Ali", 2016, "Mevcut");
        
        // 2. Kitap kopyası oluşturma
        KitapKopyasi kopya1 = new KitapKopyasi("K001", "Raf-A3", kitap1, "Rafta");
        
        // 3. Üye oluşturma
        Uye uye1 = new Uye("U100", "Ayşe", "Yılmaz", "ayse@mail.com", 0);
        
        // 4. Ödünç kaydı oluşturma
        OduncKaydi kayit1 = new OduncKaydi("ISL01", kopya1, uye1, "05-10-2026", "15-10-2026");
        
        // Konsola yazdırma kontrolü
        System.out.println("--- OKYS Sistem Testi ---");
        System.out.println("Kitap: " + kayit1.getKopya().getKitap().getBaslik());
        System.out.println("Yazar: " + kayit1.getKopya().getKitap().getYazar());
        System.out.println("Alan Üye: " + kayit1.getUye().getAd() + " " + kayit1.getUye().getSoyad());
        System.out.println("Teslim Tarihi: " + kayit1.getTeslimTarihi());
    }
}