package pl.kurs.zadanie1;

import java.util.Objects;

public class Prostokat extends Figura {
    private int a;
    private int b;
    public Prostokat(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public int getArea() {
        return a * b;
    }
    public int getCircumference() {
        return 2 * a + 2 * b;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Prostokat)) return false;
        Prostokat prostokat = (Prostokat) o;
        return a == prostokat.a && b == prostokat.b;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b);
    }

    @Override
    public String toString() {
        counter++;
        return "Prostokat o bokach "+a+"x"+b;
    }
}
