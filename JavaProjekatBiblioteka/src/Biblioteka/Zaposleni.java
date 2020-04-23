
package Biblioteka;
import com.google.gson.Gson;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Zaposleni extends Korisnik implements Opcije{
     String putanja="listaknjiga.json";
     String putanja2="korisnici.json";
     String linija;
   public ArrayList<String> knjiga=new ArrayList<String>();
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
   
    public Zaposleni(String ime, String prezime, int broj_licne_karte, String adresa, String telefon) {
        super.ime=ime;
        super.prezime=prezime;
        super.broj_licne_karte=broj_licne_karte;
        super.adresa=adresa;
        super.telefon=telefon;
        
    }
    public Zaposleni()
    {
        
    }
     @Override
   public void dodajKnjigu()
   {     FileWriter fw;
         try {
             ArrayList<String> knjiga=new ArrayList<String>();
             System.out.println("Molimo vas unesite podatke za novu knjigu");
             Scanner citac=new Scanner(System.in);
             String knjiga12= citac.nextLine();
             knjiga.add(0,"Bogati otac siromasni otac,Robert Kiosaki,Biznis,false");
             knjiga.add(1,"Programiranje na jeziku C,Laslo Kraus,Programiranje,false");
             knjiga.add(2,"Principi objektno orijentisanog programiranja,Slobodan Obradovic,Programiranje,false");
             knjiga.add(3,"Uspesno investiranje,Robert Kiosaki,Biznis,false");
             knjiga.add(4,"Prica o kaludjeru koji je prodao svoj ferrari,Robin Sharma,Psihologija,false");
             knjiga.add(5,"Budni u 5 i vas je citav svet,Robin Sharma,Psihologija,false");
             knjiga.add(6,"Zdravi za ceo zivot,Harvey Diamond,Ishrana,false");
             knjiga.add(7,"Zivot kao film,Mihajlo Popovic,Biografija,false");
               String[] podeljeno =knjiga12.split(",");
             if(podeljeno.length==4)
             {
                knjiga.add(8,knjiga12);
             Gson gson=new Gson();
             fw = new FileWriter(putanja);
             gson.toJson(knjiga,fw);
             fw.flush();
             fw.close();
             System.out.println("Uspešno ste dodali knjigu!");
             }
             else
             {
                 System.out.println("Proverite da li ste uneli sve podatke");
             }
            
             
             
            
         } catch (IOException ex) {
             //System.out.println(ex.getMessage());
       
         }
   }
     @Override
   public void PregledajKnjige() 
   {
         try {
             String data="";
             data=new String(Files.readAllBytes(Paths.get(putanja)));
             System.out.println(data);
             
         } catch (IOException ex) {
             System.out.println(ex.getMessage());
         }
      
       
   }
     @Override
   public void NaplatiClanarinu()
   {
       System.out.println("Unesite godinu rodjenja korisnika");
       Scanner citac=new Scanner(System.in);
       int godina=citac.nextInt();
       int brojgodina=2019-godina;
       System.out.println("Korisnik ima: "+brojgodina+" godina");
       if(brojgodina<18)
       {
           System.out.println("Cena članarine je 400 dinara");
       }
       if(brojgodina>=18 && brojgodina<=26)
       {
           System.out.println("Cena članarine je 800 dinara");
       }
       if(brojgodina<=10 && brojgodina!=0)
       {
           System.out.println("Članarina se ne naplaćuje");
       }
       if(brojgodina==0)
       {
           System.out.println("Greška, pokušajte ponovo");
       }
       if(brojgodina>10 && brojgodina<18)
       {
           System.out.println("Cena članarine je 200 dinara");
       }
       if(brojgodina>26 && brojgodina<=65)
       {
           System.out.println("Cena članarine je 1500 dinara");
       }
       if(brojgodina>65)
       {
           System.out.println("Članarina se ne naplaćuje");
       }
       if(brojgodina>100)
       {
           System.out.println("Greška, pokušajte ponovo");
       }
       
       
       
   }
     @Override
   public void IzvrsiUclanjenje()
   {
   
         try {
             ArrayList<String> korisnici=new ArrayList<String>();
             FileWriter fw;
             System.out.println("Molimo vas unesite podatke za novog korisnika");
             Scanner scan=new Scanner(System.in);
             String korisnik=scan.nextLine();
             korisnici.add(0,"Ana Dragicevic,student,3107,Rumenacka 8,0645412395");
             korisnici.add(1,"Tamara Jovic,student,2010,Topolska 25,063299932");
             korisnici.add(2,"Andrea Knezevic,ekonomista,2207,Mileve Maric Ajnstajn 70,069223113");
             korisnici.add(3,"Emilija Labus,pravnik,7034,Mileve Maric Ajnstajn 50,0642313343");
             String[] podeljeno1 =korisnik.split(",");
             if(podeljeno1.length==5)
             {
             korisnici.add(4,korisnik);
             Gson gson2=new Gson();
             fw=new FileWriter(putanja2);
             gson2.toJson(korisnici,fw);
             System.out.println("Uspesno ste dodali novog korisnika!");
             fw.flush();
             fw.close();
             }
            else
             {
                 System.out.println("Proverite da li ste uneli sve podatke.");
             }
            
         } catch (IOException ex) {
             ex.getMessage();
         }
       
   }
     @Override
   public void SpisakSvihKorisnika()
   {
         try {
             String data="";
             data=new String(Files.readAllBytes(Paths.get(putanja2)));
             System.out.println(data);
             
         } catch (IOException ex) {
             System.out.println(ex.getMessage());
         }
      
   }
     @Override
   public void naplatiprekoracenje()
   {System.out.println("Cena po danu za prekoračenje iznosi 10 dinara");
       System.out.println("Unesite broj dana koliko je korisnik prekoračio");
    Scanner scan=new Scanner(System.in);
    int brojdana=scan.nextInt();
    if(brojdana==0)
    {
       System.err.println("Broj dana ne može da bude 0!");
    }
    int prekoracenje=brojdana*10;
       System.out.println("Ukupno za naplatu "+prekoracenje+" dinara");
    
       
   }
 
  
    
    
}
