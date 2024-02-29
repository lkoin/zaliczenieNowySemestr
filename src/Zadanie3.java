import java.util.Arrays;

public class Zadanie3 {

    public static void main(String[] args) {
        int[] tablica = {3, 10, 5, 2, 8}; // Przykładowa tablica liczb całkowitych

        int rozpietosc = wyznaczRozpietosc(tablica);

        System.out.println("Rozpiętość zbioru danych: " + rozpietosc);

        long start = System.currentTimeMillis();
// ...
        long finish = System.currentTimeMillis();
        long timeElapsed = finish - start;

        System.out.println(timeElapsed);
    }

    static int wyznaczRozpietosc(int[] tablica) {
        if (tablica.length == 0) {
            throw new IllegalArgumentException("Tablica jest pusta.");
        }

        // Inicjalizujemy min i max wartościami pierwszego elementu tablicy.
        int minWartosc = tablica[0];
        int maxWartosc = tablica[0];

        int min = Arrays.stream(tablica).min().getAsInt();
        int max = Arrays.stream(tablica).max().getAsInt();


        for (int i = 1; i < tablica.length; i++) {
            if (tablica[i] < minWartosc) {
                minWartosc = tablica[i];
            } else if (tablica[i] > maxWartosc) {
                maxWartosc = tablica[i];
            }
        }

        // Rozpiętość to różnica między największą a najmniejszą wartością.
        return maxWartosc - minWartosc;
    }
}
