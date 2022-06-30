package pl.kurs.zadanie1;

import pl.kurs.zadanie1.Figura;

public class FiguraService  {
    public Figura biggestArea(Figura[] figury){
        Figura objectWithBiggestArea = figury[0];
        for (int i = 0; i < figury.length; i++) {
            if(objectWithBiggestArea.getArea() < figury[i].getArea()){
                objectWithBiggestArea = figury[i];
            }
        }
        return objectWithBiggestArea;
    }
    public Figura biggestCircumference(Figura[] figury){
        Figura objectWithBiggestCircumference = figury[0];
        for (int i = 0; i < figury.length; i++) {
            if(objectWithBiggestCircumference.getCircumference() < figury[i].getCircumference()){
                objectWithBiggestCircumference = figury[i];
            }
        }
        return objectWithBiggestCircumference;
    }
}
