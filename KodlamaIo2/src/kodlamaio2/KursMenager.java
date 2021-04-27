/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kodlamaio2;

/**
 *
 * @author seren
 */
public class KursMenager {
    public void Kayit(Kurs kurs){
        System.out.println(""+kurs.kursAdi+" kursuna Kaydınız başarı ile yapılmıştır..");
    }
    public  void Giris(Kurs kurs){
        System.out.println(""+kurs.kursAdi+" adlı kursa giriş yaptınız.");
    }
    public  void Silme(Kurs kurs){
        System.out.println(""+kurs.kursAdi+" adlı kurstan kaydınız silinmiştir.");
    }
}
