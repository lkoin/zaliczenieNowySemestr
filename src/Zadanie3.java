import java.util.Arrays;

public class Zadanie3 {


        public static void main(String[] args) {
            int[] tablica = {3, 10, 5, 2, 8}; // Przykładowa tablica liczb całkowitych

            int rozpietosc = wyznaczRozpietosc(tablica);

            System.out.println("Rozpiętość zbioru danych: " + rozpietosc);
        }

        public static int wyznaczRozpietosc(int[] tablica) {
            if (tablica.length == 0) {
                throw new IllegalArgumentException("Tablica jest pusta.");
            }

            // Sortujemy tablicę, aby łatwo znaleźć największą i najmniejszą wartość.
            Arrays.sort(tablica);

            // Największa wartość znajduje się na ostatniej pozycji.
            int maxWartosc = tablica[tablica.length - 1];

            // Najmniejsza wartość znajduje się na pierwszej pozycji.
            int minWartosc = tablica[0];

            // Rozpiętość to różnica między największą a najmniejszą wartością.
            return maxWartosc - minWartosc;
        }
    }


