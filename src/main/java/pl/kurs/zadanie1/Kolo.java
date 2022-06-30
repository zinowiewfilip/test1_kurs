package pl.kurs.zadanie1;

import java.util.Objects;

public class Kolo extends Figura {
    private int radius;
    public Kolo(int radius) {
        this.radius = radius;
    }
    public int getArea() {
        return (int) (Math.PI * Math.pow(radius, 2));
    }
    public int getCircumference() {
        return (int) (2 * Math.PI * radius);
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Kolo)) return false;
        Kolo kolo = (Kolo) o;
        return radius == kolo.radius;
    }
    @Override
    public int hashCode() {
        return Objects.hash(radius);
    }
    @Override
    public String toString() {
        counter++;
        return "Kolo o promieniu "+radius;
    }
}
