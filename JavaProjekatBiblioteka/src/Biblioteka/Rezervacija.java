/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Biblioteka;

import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Rezervacija  {
 private int brojrezervacije=1;

 private int idkorisnika;
 private int brojdana;//na koji se knjiga iznajmljuje//
 private int cena=50;
Date datum=new Date();

    public Rezervacija(int brojrezervacije,String naslov, int idkorisnika, int brojdana) {
         brojrezervacije++;
        this.idkorisnika = idkorisnika;
        this.naslov=naslov;
        this.brojdana = brojdana;
        this.cena=brojdana*50;
         
         datum.toString();
    }

   
    public Rezervacija()
    {
        
    }

    public int getBrojrezervacije() {
        return brojrezervacije;
    }

    public void setBrojrezervacije(int brojrezervacije) {
        this.brojrezervacije = brojrezervacije;
    }

  

    public int getBrojdana() {
        return brojdana;
    }

    public void setBrojdana(int brojdana) {
        this.brojdana = brojdana;
    }

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

    @Override
    public String toString() {
        return "Rezervacija{" + "brojrezervacije=" + brojrezervacije + ", naslov=" + naslov + ", idkorisnika=" + idkorisnika + ", brojdana=" + brojdana + ", cena=" + cena + '}';
    }

  


  
  


  /*
    public static ArrayList<Knjiga> izlistajKnjige() throws FileNotFoundException
    {
        ArrayList<Knjiga> lista=new ArrayList<>();
        String datoteka="listaknjiga.json";
        try
        {
            Knjiga k;
            FileReader fr=new FileReader(datoteka);
            BufferedReader br=new BufferedReader(fr);
            String linija="";
            while((linija=br.readLine())!=null)
            {
                String[] podela=linija.split(",");
                boolean zauzetost=false;
                if(podela[3]=="false")
                {   Knjiga ka=new Knjiga();
                    zauzetost=false;
                    Boolean b=Boolean.parseBoolean(ka.zauzeto);
                    k=new Knjiga(podela[0],podela[1],podela[2],ka.zauzeto);
                    lista.add(k);
                    br.close();
                    fr.close();
                if(podela[3]=="true")
                {   Knjiga ke=new Knjiga();
                    zauzetost=true;
                    Boolean bo=Boolean.parseBoolean(ka.zauzeto);
                    ke=new Knjiga(podela[0],podela[1],podela[2],ka.zauzeto);
                    lista.add(k);
                    br.close();
                    fr.close();
                }
               
                
            }
        }
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }
        return lista;
    }

    public void rezervisi() throws FileNotFoundException, IOException
    {
         ArrayList<Rezervacija> lista=new ArrayList<>();
        String datoteka="listaknjiga.json";
        String datoteka2="listarezervacija.json";
        try
        {
            Knjiga k;
            FileReader fr=new FileReader(datoteka);
            BufferedReader br=new BufferedReader(fr);
            String linija="";
            while((linija=br.readLine())!=null)
            {
                String[] podela=linija.split(",");
                boolean zauzetost=false;
                if(podela[3]=="false")
                {   
                    Knjiga ke=new Knjiga();
                  
                    Boolean bo=Boolean.parseBoolean(ke.zauzeto);
                    boolean zauzeto=bo;
                    if(zauzeto==false)
                    { int brojrezervacije=1;
                    Scanner s=new Scanner(System.in);
                    System.out.println("Unesite vaše ime");
                    String ime=s.nextLine();
                    System.out.println("Unesite broj dana na koliko želite da rezervišete knjigu");
                    Scanner broj=new Scanner(System.in);
                    int brojdana1=broj.nextInt();
                    
                    Rezervacija rez=new Rezervacija(brojrezervacije++,ime,brojdana1);
                    lista.add(rez);
                    br.close();
                    fr.close();
                    FileWriter fw;
                    Gson gson=new Gson();
                    fw = new FileWriter(datoteka2);
                    gson.toJson(rez,fw);
                    fw.close();
                    fw.flush();
                    
                  
                    }
                   
                }
                if(podela[3]=="true")
                {   Knjiga ka=new Knjiga();
                    Boolean bm=Boolean.parseBoolean(ka.zauzeto);
                    boolean zauzeto2=bm;
                    if(zauzeto2==true)
                    {
                        System.out.println("Nije moguce izvršiti rezervaciju, knjiga je zauzeta");
                     }
                   
               
       
                 }
                 }
                 }
                catch(Exception ex)
                 {
                    System.out.println(ex.getMessage());
                  }
 
                    }
                    }
   
*/
      String naslov;
    public void Rezervisi() throws FileNotFoundException, IOException
    {  
        try
        {   String putanja="listaknjiga.json";
            System.out.println("Unesite ime naslova koji želite da rezervišete");
            Scanner scan=new Scanner(System.in);
             naslov=scan.nextLine();
            
            String data="";
             data=new String(Files.readAllBytes(Paths.get(putanja)));
             if(data.contains(naslov))
             {      
                 System.out.println("Knjiga postoji u našem sistemu, prosleđujemo vas na sledeći korak");
                 
             }
             if(!data.contains(naslov))
             {
                 System.out.println("Knjiga ne postoji u našem sistemu, probajte sa nekom drugom knjigom");
                 return;
             }
           }catch(Exception ex)
           {
               System.out.println(ex.getMessage());
           }

            System.out.println("Unesite vaš broj licne karte za rezervaciju");
            Scanner s=new Scanner(System.in);
            int idkorisnika=s.nextInt();
            System.out.println("Unesite broj dana na koji želite da rezervišete knjigu");
            int brojdana=s.nextInt();
            
            ArrayList<Rezervacija> rez=new ArrayList<Rezervacija>();
            Rezervacija r=new Rezervacija(brojrezervacije,naslov,idkorisnika,brojdana);
            
            rez.add(r);
            
            
            String putanja2="rezervacija.json";
            Gson gson=new Gson();
            FileWriter fw=new FileWriter(putanja2);
            gson.toJson(rez,fw);
           
            System.out.println("Rezervacija je uspešna, hvala Vam!");
            fw.flush();
            fw.close();
    }
            
            
          
           
        
             
           
            
        }
        
       
 
