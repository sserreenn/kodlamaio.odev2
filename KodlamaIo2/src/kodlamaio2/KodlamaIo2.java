
package kodlamaio2;

/**
 *
 * @author seren
 */
public class KodlamaIo2 {
    
    public static void main(String[] args) {
        Kurs kurs1 = new Kurs(1,"Java+React","Engin DEMİROĞ","16 Ders, 55 ödev");
        Kurs kurs2 = new Kurs(2,"C#","Engin DEMİROĞ","20 Ders, 95 ödev");
        Kurs[] kurslar ={kurs1,kurs2};
        for(Kurs kurs : kurslar){
            System.out.println("Kurs Adı: " +kurs.kursAdi);
            System.out.println("Eğitmen: "+kurs.egitmen);
            System.out.println("Kursun Detayı: "+kurs.detay);
        }
        KursMenager kursMenager = new KursMenager();
        kursMenager.Kayit(kurs1);
        kursMenager.Giris(kurs1);
        kursMenager.Silme(kurs2);
    }
    
}
