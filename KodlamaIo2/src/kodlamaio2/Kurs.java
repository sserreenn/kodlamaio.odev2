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
public class Kurs {
    int id;
    String kursAdi;
    String egitmen;
    String detay;
    
    public Kurs(int id, String kursAdi, String egitmen,String detay){
        this.id=id;
        this.kursAdi=kursAdi;
        this.egitmen= egitmen;
        this.detay= detay;
    }
}
