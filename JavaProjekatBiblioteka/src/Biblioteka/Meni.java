//Glavni program//
package Biblioteka;
import java.util.Scanner;
import java.io.IOException;
import java.text.ParseException;


public class Meni {
    public static void main(String[] args) throws IOException, ParseException {
        
        System.out.println("Dobro došli na aplikaciju biblioteke grada Beograda");
        System.out.println("Izaberite opciju prijavljivanja: 1-korisnik, 2-zaposleni");
        Scanner s=new Scanner(System.in);
        int unos=s.nextInt();
        if(unos!=1 && unos!=2)
        {
            System.out.println("Greška, možete da birate između broja 1 i 2");
        }
       if(unos==1)
        {
        {
         System.out.println("Izaberite jednu od sledećih opcija:");
         System.out.println("1-pogledaj spisak svih knjiga u biblioteci");
         System.out.println("2-rezerviši knjigu");
         System.out.println("3-proveri da li je slobodna čitaonica");
         System.out.println("4-proveri da li je knjiga dostupna za iznajmljivanje");
         System.out.println("5-proveri kada ti ističe članarina");
         
         Scanner scan=new Scanner(System.in);
        int unoskorisnika=scan.nextInt();
        switch(unoskorisnika)
        {
            case 1: try
                {Korisnik k=new Korisnik();
                k.PogledajDostupneKnjige();
                 }catch(Exception ex)
                 {
                System.out.println(ex.getMessage());
                 }
                  break;
            case 2:
                Rezervacija r=new Rezervacija();
                r.Rezervisi();
                break;
            case 3:
                Citaonica citaonica=new Citaonica();
                citaonica.dostupnost();
                break;
                
            case 4:
                Knjiga ka=new Knjiga();
                ka.iznajmljena();
                break;
            case 5:
                Korisnik k=new Korisnik();
                k.ProveriTrajanjeClanarine();
                break;
        }
        }
        }
            
        if(unos==2)
        {   Zaposleni z=new Zaposleni("Nikola","Stanković",7011,"Mileve Maric Ajnstajn 50","0643830337");
            Zaposleni m=new Zaposleni("Maša","Stojčić",7077,"Ohridska 8","0653413834");
            System.out.println("Molimo vas unesite broj lične karte, kako bi vas identifikovali");
            Scanner sken=new Scanner(System.in);
            int brlk=sken.nextInt();
            if(z.broj_licne_karte==brlk || m.broj_licne_karte==brlk)
            {
                System.out.println("Uspešno ste se ulogovali,izaberite sledeće:");
                 System.out.println("1-dodaj knjigu");
                 System.out.println("2-pogledaj dostupne knjige");
                 System.out.println("3-naplati članarinu");
                 System.out.println("4-učlani novog korisnika");
                 System.out.println("5-spisak korisnika biblioteke");
                 System.out.println("6-naplati kaznu za prekoračenje");
                
                int broj=sken.nextInt();
                if(broj==1 && z.broj_licne_karte==brlk)
                {
                    z.dodajKnjigu(); 
                    
                }
                if(broj==1 && m.broj_licne_karte==brlk)
                {
                    m.dodajKnjigu();
                   
                }
                if(broj==2 && z.broj_licne_karte==brlk)
                { System.out.println("Lista trenutno dostupnih knjiga: ");
                    try
                    {
                        z.PregledajKnjige();
                    }
                    catch(Exception ex)
                    {
                        System.out.println(ex.getMessage());  
                    }
                }
                 if(broj==2 && m.broj_licne_karte==brlk)
                {System.out.println("Lista trenutno dostupnih knjiga: ");
                    try
                    {
                        m.PregledajKnjige();
                    }
                    catch(Exception ex)
                    {
                        System.out.println(ex.getMessage());  
                    }
                }
                 if(broj==3 &&  z.broj_licne_karte==brlk)
                 {
                     z.NaplatiClanarinu();
                    
                 }
                 if(broj==3 && m.broj_licne_karte==brlk)
                 {
                     m.NaplatiClanarinu();
                 }
                 if(broj==4 && z.broj_licne_karte==brlk)
                 {
                     z.IzvrsiUclanjenje();
                 }
                 if(broj==4 && m.broj_licne_karte==brlk)
                 {
                     m.IzvrsiUclanjenje();
                     
                 }
                    if(broj==5 && z.broj_licne_karte==brlk)
                 {  System.out.println("Spisak trenutnih korisnika:");
                     z.SpisakSvihKorisnika();
                 }
                 if(broj==5 && m.broj_licne_karte==brlk)
                 {System.out.println("Spisak trenutnih korisnika:");
                     m.SpisakSvihKorisnika();
                     
                 }
                       if(broj==6 && z.broj_licne_karte==brlk)
                 {  
                     z.naplatiprekoracenje();
                 }
                 if(broj==6 && m.broj_licne_karte==brlk)
                 {
                     m.naplatiprekoracenje();
                     
                 }
                 
                 }
                 
                
            }
            
          
          
                    
            
        }
       
    }
