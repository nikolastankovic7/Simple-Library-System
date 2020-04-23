
package Biblioteka;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public  class Korisnik implements KorisnickeOpcije {
     protected String ime;
    protected String prezime;
    protected String zanimanje;
    protected int broj_licne_karte;
    protected String adresa;
    protected String telefon;
    
    
    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getZanimanje() {
        return zanimanje;
    }

    public void setZanimanje(String zanimanje) {
        this.zanimanje = zanimanje;
    }

    public int getBroj_licne_karte() {
        return broj_licne_karte;
    }

    public void setBroj_licne_karte(int broj_licne_karte) {
        this.broj_licne_karte = broj_licne_karte;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }
 
    
    
    public Korisnik()
    {
        
    }
    
    public Korisnik(String ime, String prezime, String zanimanje, int broj_licne_karte, String adresa, String telefon) {
        this.ime = ime;
        this.prezime = prezime;
        this.zanimanje = zanimanje;
        this.broj_licne_karte = broj_licne_karte;
        this.adresa = adresa;
        this.telefon = telefon;
    }

    @Override
    public String toString() {
        return this.ime+" "+this.prezime+" "+this.zanimanje+" "+this.broj_licne_karte+" "+this.adresa+" "+this.telefon+" ";
    }
     @Override
    public void PogledajDostupneKnjige()
    {   String putanja2="listaknjiga.json";
          try {
             String data="";
             data=new String(Files.readAllBytes(Paths.get(putanja2)));
             System.out.println(data);
             
         } catch (IOException ex) {
             System.out.println(ex.getMessage());
         }
    }
    @Override
    public void ProveriTrajanjeClanarine()
    {  
        LocalDate danasnjidan=LocalDate.now();
        
        System.out.println("Unesite datum kada vam ističe članarina(u formatu: yyyy-MM-dd)");
        Scanner scan=new Scanner(System.in);
        String datum=scan.nextLine();
        DateTimeFormatter formatter;
        formatter=DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate korisnikovunos=LocalDate.parse(datum,formatter);
        long daniizmedju=ChronoUnit.DAYS.between(danasnjidan,korisnikovunos);
        if(daniizmedju>0)
        {
            System.out.println("Članarina vam ističe za "+daniizmedju+" dana");
        }
        else
        {
            System.out.println("Greška, unesite ispravno podatke i pokušajte ponovo!");
        }
        
        
      
    }   
   
  
    
}
