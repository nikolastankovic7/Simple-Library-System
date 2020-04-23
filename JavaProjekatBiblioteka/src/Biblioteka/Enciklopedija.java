/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Biblioteka;

public abstract class Enciklopedija extends Knjiga {
    
    public Enciklopedija(int idbr, String naziv, String autor) {
       super.idbr=idbr;
       super.naziv=naziv;
       super.autor=autor;
    }

    public Enciklopedija() {
    }

    public int getIdbr() {
        return idbr;
    }

    public void setIdbr(int idbr) {
        this.idbr = idbr;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getZanr() {
        return zanr;
    }

    public void setZanr(String zanr) {
        this.zanr = zanr;
    }

    @Override
    public String toString() {
        return super.toString(); 
    }
    
    
}
