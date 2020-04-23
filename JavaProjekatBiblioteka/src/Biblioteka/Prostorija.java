/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Biblioteka;

public abstract  class Prostorija {
    protected int sirina;
    protected int visina;
    protected int kvadratura;
    protected boolean iznajmljena;

    public Prostorija(int sirina, int visina, int kvadratura, boolean iznajmljena) {
        this.sirina = sirina;
        this.visina = visina;
        this.kvadratura = kvadratura;
        this.iznajmljena = iznajmljena;
    }
    public Prostorija()
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
        return "Prostorija{" + "sirina=" + sirina + ", visina=" + visina + ", kvadratura=" + kvadratura + ", iznajmljena=" + iznajmljena + '}';
    }
    
    
    
}
