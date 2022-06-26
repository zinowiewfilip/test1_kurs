package pl.kurs;

public class FiguraRunner {
    public static void main(String[] args) {
        Figura[] figury = {Figura.stworzKwadrat(10), Figura.stworzKolo(20), Figura.stworzProstokat(10,20), Figura.stworzKwadrat(15)};
        int i = 1;
        for(Figura f : figury) {
            System.out.println(f);
        }
    }
}
