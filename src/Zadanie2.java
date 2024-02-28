import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Zadanie2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Podaj rozmiar tablicy: ");
        int n = scanner.nextInt();

        int[] tablica = new int[n];

        System.out.println("Automatycznie generowane elementy tablicy:");

        for (int i = 0; i < n; i++) {
            tablica[i] = random.nextInt(100); // Zakres losowanych liczb od 0 do 99 (możesz dostosować zakres według potrzeb)
            System.out.print(tablica[i] + " ");
        }

        Arrays.sort(tablica);

        System.out.println(); // Nowa linia dla czytelności

        System.out.print("Podaj szukaną liczbę: ");
        int szukanaLiczba = scanner.nextInt();

        int wynik = szukanieBinarne(tablica, szukanaLiczba);

        if (wynik == n) {
            System.out.println("Element nie został znaleziony w tablicy.");
        } else {
            System.out.println("Element znajduje się na pozycji: " + wynik);
        }
    }


    // ...
    public static int szukanieBinarne(int[] tablica, int szukana) {
        int lewy = 0;
        int prawy = tablica.length - 1;

        while (lewy <= prawy) {
            int srodek = (prawy - lewy) / 2;

            if (tablica[srodek] == szukana) {
                return srodek; // Zwraca pozycję, na której znajduje się szukana liczba.
            } else if (tablica[srodek] < szukana) {
                lewy = srodek + 1;
            } else {
                prawy = srodek - 1;
            }
        }

        return tablica.length; // Zwraca n, gdy element nie został znaleziony w tablicy.
    }
// ...

}
