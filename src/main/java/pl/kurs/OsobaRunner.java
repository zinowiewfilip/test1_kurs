package pl.kurs;

public class OsobaRunner {
    public static void main(String[] args) {

        Pracownik pracownik1 = new Pracownik("Kamil", "Kowalski", 81020323237l, "Warszawa", "programista", 2500.00);
        Pracownik pracownik2 = new Pracownik("Kamila", "Kowalska", 76115323261l, "Gliwice", "ksiegowy", 3500.40);
        Student student1 = new Student("Filip", "Ponizy",  14011215332l, "Poznan", "5b", 1000.00);
        Student student2 = new Student("Patrycja", "Ponizy",  14011215382l, "Krakow", "2b", 800.50);
        Osoba[] osoby = {pracownik1, student1, pracownik2, student2};
        double maxDochod = osoby[0].getDochod();
        for (int i = 1; i < osoby.length; i++) {
            if(osoby[i].getDochod() > maxDochod) {
                maxDochod = osoby[i].getDochod();
            }
        }
        System.out.println(maxDochod);

        int ileKobiet = 0;
        for (int i = 0; i < osoby.length; i++) {
            if(osoby[i].getPlec(osoby[i].getPesel()) == 1){
                ileKobiet += 1;
            }
        }
        System.out.println(ileKobiet);
    }
}
