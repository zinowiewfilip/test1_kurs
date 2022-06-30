package pl.kurs.zadanie3;

import pl.kurs.zadanie3.Osoba;

public class Pracownik extends Osoba {
    private String stanowisko;
    private double pensja;

    public Pracownik(String imie, String nazwisko, long pesel, String miasto, String stanowisko, double pensja) {
        super(imie, nazwisko, pesel, miasto);
        this.stanowisko = stanowisko;
        this.pensja = pensja;
    }

    @Override
    public double getDochod() {
        if(pensja>=0) {
            return pensja;
        }
        else{
            throw new IllegalArgumentException();
        }
    }


}
