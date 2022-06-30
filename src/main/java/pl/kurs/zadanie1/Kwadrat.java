package pl.kurs.zadanie1;

import java.util.Objects;

public class Kwadrat extends Figura {
    private int a;
    public Kwadrat(int a) {
        this.a = a;

    }
    public int getArea() {
        return (int) Math.pow(a, 2);
    }
    public int getCircumference() {
        return 4 * a;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Kwadrat)) return false;
        Kwadrat kwadrat = (Kwadrat) o;
        return a == kwadrat.a;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a);
    }

    @Override
    public String toString() {
        counter++;
        return "Kwadrat o boku "+a;
    }
}
