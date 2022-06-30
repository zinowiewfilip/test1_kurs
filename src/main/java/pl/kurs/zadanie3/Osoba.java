package pl.kurs.zadanie3;

public abstract class Osoba {
    private String imie;
    private String nazwisko;
    private long pesel;
    private String miasto;

    public Osoba(String imie, String nazwisko, long pesel, String miasto) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.pesel = pesel;
        this.miasto = miasto;
    }
    public abstract double getDochod();
    public long getPesel(){
        return pesel;
    }
    public int getPlec() {
        int i = 0; // 0 = mezczyzna, 1 = kobieta
        if (pesel / 10 % 2 != 0) {
            i = 0;
        } else {
            i = 1;
        }
        return i;
    }
}
