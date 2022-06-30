package pl.kurs.zadanie1;

import static pl.kurs.zadanie1.Figura.counter;

public class FiguraRunner {
    public static void main(String[] args) {
        FiguraService figuraService = new FiguraService();
        Figura[] figury = {Figura.stworzKwadrat(10), Figura.stworzKolo(20), Figura.stworzProstokat(10, 20), Figura.stworzKwadrat(15)};
        for(Figura f : figury) {
            System.out.print("Figura nr "+counter+": ");
            System.out.println(f);
        }
        for(Figura f : figury) {
            if(f.equals(Figura.stworzProstokat(10,20))){
                System.out.println("tu powinno wejsc");
            }
        }
        System.out.println("Najwiekszy obwod: " +figuraService.biggestCircumference(figury));
        System.out.println("Najwieksze pole: " +figuraService.biggestArea(figury));

        }
    }


