package pl.kurs;
public class Figura {
    private int a;
    private int b;
    private double radius;

    public Figura(int a) {
        System.out.println("Kwadrat o boku " +a);
        this.a = a;
    }
    public Figura(double radius) {
        System.out.println("Kolo o promieniu " +radius);
        this.radius = radius;
    }
    public Figura(int a, int b) {
        System.out.println("Prostokat o bokach " +a+"x"+b);
        this.a = a;
        this.b = b;
    }

    public static Figura stworzKwadrat(int a) {
        return new Figura(a);
    }

    public static Figura stworzKolo(int radius) {

        return new Figura(radius);
    }

    public static Figura stworzProstokat(int a, int b) {
        return new Figura(a,b);
    }

}
