/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Biblioteka;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;
	

public class Citaonica extends Prostorija{

    public Citaonica(int sirina, int visina, int kvadratura, boolean iznajmljena) {
        super(sirina, visina, kvadratura, iznajmljena);
    }
    public Citaonica()
    {
        
    }

    public int getSirina() {
        return sirina;
    }

    public void setSirina(int sirina) {
        this.sirina = sirina;
    }

    public int getVisina() {
        return visina;
    }

    public void setVisina(int visina) {
        this.visina = visina;
    }

    public int getKvadratura() {
        return kvadratura;
    }

    public void setKvadratura(int kvadratura) {
        this.kvadratura = kvadratura;
    }

    public boolean isIznajmljena() {
        return iznajmljena;
    }

    public void setIznajmljena(boolean iznajmljena) {
        this.iznajmljena = iznajmljena;
    }

    @Override
    public String toString() {
        return super.toString();
    }
    public void dostupnost() throws ParseException
          
    {  SimpleDateFormat formatDatuma=new SimpleDateFormat("HH:mm");
        Date sada=new Date();
        System.out.println("Trenutno vreme je: "+formatDatuma.format(sada));
        
        if(formatDatuma.format(sada).startsWith("20"))
        {
            System.out.println("Čitaonica trenutno ne radi, pokušajte ujutru");
            return;
        }
       
        if(formatDatuma.format(sada).startsWith("21"))
        {
            System.out.println("Čitaonica trenutno ne radi, pokušajte ujutru");
            return;
        }

	if(formatDatuma.format(sada).startsWith("16"))
        {
            System.out.println("Trenutno je vreme pauze, dodjite za sat vremena");
            return;
        }
      else
        {
            System.out.println("Čitaonica je slobodna, hvala Vam što koristite naše usluge");
        }
      
            
       
       
       
        
    }
    
    
}
