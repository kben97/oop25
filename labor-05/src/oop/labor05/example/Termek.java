package oop.labor05.example;

public class Termek {
    private int azonosito;
    private String elnevezes;
    private float beszerzesiAr;
    private float fogyasztoiAr;

    public Termek(int azonosito,String elnevezes,float beszerzesiAr) {
        this.azonosito=azonosito;
        this.elnevezes=elnevezes;
        this.beszerzesiAr=beszerzesiAr;
        fogyasztoiAr=beszerzesiAr;
    }

    public String getElnevezes() {
        return elnevezes;
    }

    public int getAzonosito() {
        return azonosito;
    }

    public float getBeszerzesiAr() {
        return beszerzesiAr;
    }

    public float getFogyasztoiAr() {
        return fogyasztoiAr;
    }

    public void setArres(float szazalek) {
        fogyasztoiAr+=beszerzesiAr*(szazalek/100);
    }

    @Override
    public String toString() {
        return "Nev: " + getElnevezes() + " Azonosito: " + getAzonosito() + " Beszerzesi ar: " + getBeszerzesiAr() + " Fogyasztoi ar: " + getFogyasztoiAr();
    }
}
