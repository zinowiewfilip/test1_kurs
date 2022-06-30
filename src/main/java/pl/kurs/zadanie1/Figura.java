package pl.kurs.zadanie1;

public abstract class Figura {
    protected static int counter = 1;
    public static Figura stworzKwadrat(int a) {
        if(a<=0)
            throw new IllegalArgumentException();
        return new Kwadrat(a);
    }
    public static Figura stworzProstokat(int a, int b) {
        if(a<=0 || b<=0)
            throw new IllegalArgumentException();
        return new Prostokat(a,b);
    }
    public static Figura stworzKolo(int radius) {
        if(radius<=0)
            throw new IllegalArgumentException();
        return new Kolo(radius);
    }
    public abstract int getArea();
    public abstract int getCircumference();
    public abstract boolean equals(Object o);

}
