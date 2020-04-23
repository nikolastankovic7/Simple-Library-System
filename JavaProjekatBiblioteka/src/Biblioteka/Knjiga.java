
package Biblioteka;

import com.google.gson.Gson;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Knjiga {
 protected int idbr;
 protected String naziv;
 protected String autor;
 protected String zanr;
 protected String zauzeto;
 FileWriter fw;
 public List<Knjiga> kolekcija;
 boolean stanje;
 
    public Knjiga(String naziv,String autor,String zanr,String zauzeto)
    {
        this.naziv=naziv;
        this.autor=autor;
        this.zanr=zanr;
        this.zauzeto=zauzeto;
    }
    public Knjiga(int idbr,String naziv, String autor, String zanr) {
        this.idbr = idbr;
        this.naziv = naziv;
        this.autor = autor;
        this.zanr = zanr;
    }
    public Knjiga()
    {
      List<Knjiga>  kolekcija=new ArrayList<Knjiga>();
    }
    public void dodajKnjigu(Knjiga k) throws IOException
    {
      kolekcija.add(k);
    }
    @Override
    public String toString()
    {
        String total="\n";
        /*
        for(int i=0;i<kolekcija.size();i++)
        {
            Knjiga k=kolekcija.get(i);
            total=total+k.toString();
        }
*/
        Iterator<Knjiga> i=kolekcija.iterator();
        while(i.hasNext())
        {
             Knjiga k=(Knjiga)i.next();
            total=total+k.toString();
        }
        return total;
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

    public int getIdbr() {
        return idbr;
    }

    public void setIdbr(int idbr) {
        this.idbr = idbr;
    }

    public String getZanr() {
        return zanr;
    }

    public void setZanr(String zanr) {
        this.zanr = zanr;
    }
    public void iznajmljena() throws IOException
    {
    
         System.out.println("Unesite naslov knjige koju želite da iznajmite");
         Scanner scan=new Scanner(System.in);
         String naslov=scan.nextLine();
         String putanja2="listaknjiga.json";
         
       String data="";
         data=new String(Files.readAllBytes(Paths.get(putanja2)));
         String[] pomocnid=data.split(",");
         if(data.contains(naslov))
                 
         { 
             if(pomocnid[3].contains("false") || pomocnid[7].contains("false") || pomocnid[11].contains("false") || pomocnid[15].contains("false") || pomocnid[19].contains("false")||pomocnid[23].contains("false")||pomocnid[27].contains("false") || pomocnid[31].contains("false") || pomocnid[35].contains("false"))
             {
                 System.out.println("Knjiga je dostupna za iznajmljivanje");
             }
             else
             {
                 System.out.println("Knjiga je trenutno zauzeta");
             }
             
         }
         if(!data.contains(naslov))
         {
             System.out.println("Knjiga ne postoji u našem sistemu");
         }
         
                 
    
             
             
       
    }
    
   
   
 
}
