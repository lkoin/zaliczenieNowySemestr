import java.util.Random;
import java.util.Scanner;

public class Zadanie1_PrzeszukiwanieLiniowe {

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

        System.out.println(); // Nowa linia dla czytelności

        System.out.print("Podaj szukaną liczbę: ");
        int szukanaLiczba = scanner.nextInt();

        int wynik = szukanieLiniowe(tablica, szukanaLiczba);

        if (wynik == n) {
            System.out.println("Element nie został znaleziony w tablicy.");
        } else {
            System.out.println("Element znajduje się na pozycji: " + wynik);
        }
    }

    static int szukanieLiniowe(int[] tablica, int szukana) {
        int n = tablica.length;

        for (int i = 0; i < n; i++) {
            if (tablica[i] == szukana) {
                return i; // Zwraca pozycję, na której znajduje się szukana liczba.
            }
        }

        return n; // Zwraca n, gdy element nie został znaleziony w tablicy.
    }
}
