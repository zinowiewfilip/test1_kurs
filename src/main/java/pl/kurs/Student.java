package pl.kurs;

public class Student extends Osoba{
    private String grupa;
    private double stypendium;

    public Student(String imie, String nazwisko, long pesel, String miasto, String grupa, double stypendium) {
        super(imie, nazwisko, pesel, miasto);
        this.grupa = grupa;
        this.stypendium = stypendium;
    }

    @Override
    public double getDochod() {
        if(stypendium>=0) {
            return stypendium;
        }
        else{
            throw new IllegalArgumentException();
        }
    }
}
