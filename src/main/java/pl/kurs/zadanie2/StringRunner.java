package pl.kurs.zadanie2;

public class StringRunner {
    public static void main(String[] args) {
        long start1 = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1000; i++) {
            sb.append(i);
            sb.append(" ");
            //tworzymy jeden obiekt typu StringBuilder, a następnie dodajemy do niego liczbę
        }

        String numbers1 = sb.toString();
        long stop1 = System.nanoTime();
        System.out.println(numbers1);

        long start2 = System.nanoTime();
        String numbers2 = "";
        for (int i = 0; i < 1000; i++) {
            numbers2 = numbers2 + i + " ";
            //StringBuilder numbers2 = new StringBuilder(numbers2).append(i).toString(); przy każdym wykonaniu pętli tworzony jest obiekt typu StringBuilder
            //następnie do tego obiektu dodawane jest i oraz " ". Przez to tworzone jest w tym wypadku 1000 obiektów typu StringBuilder zamiast jednego
            //do którego dodawane są kolejne argumenty

        }
        long stop2 = System.nanoTime();
        System.out.println(numbers2);
        long result1 = stop1 - start1;
        long result2 = stop2 - start2; //czas wykonania sie kontatenacji string
        System.out.println((double) result1); //czas wykonania się konkatenacji stringbuilder
        System.out.println((double) result2); //czas wykonania sie kontatenacji string
        System.out.println((double) result2 / result1 ); //w tym wypadku wykonanie się kontatenacji string jest około 20x dłuższe
        //Konkatenacja StringBuilder jest szybsza ze względu na to, że zamiast tworzyć 1000 obiektów typu StringBuilder tworzymy jeden, do którego dodajemy liczbę.

    }
}
