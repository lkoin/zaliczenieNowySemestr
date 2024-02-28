import java.util.Random;
import java.util.Scanner;

public class Zadanie4_Trudne {
    public static void main(String[] args) {


        System.out.print("Podaj rozmiar tablicy: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] tablica = new int[n];

        for (int i = 0; i < n; i++) {
            Random random = new Random();
            tablica[i] = random.nextInt(100000000); // Zakres losowanych liczb od 0 do 99 (możesz dostosować zakres według potrzeb)
            System.out.print(tablica[i] + " ");
        }
        System.out.println();
        System.out.println(znajdzLiczbeZNajwiekszaSuma(tablica));
    }
    public static int znajdzLiczbeZNajwiekszaSuma(int[] tablica) {
        if (tablica.length == 0) {
            throw new IllegalArgumentException("Tablica jest pusta.");
        }

        int maksymalnaSuma = -1; // Zaczynamy od ujemnej wartości, aby zawsze znaleźć liczbę o dodatniej sumie.
        int liczbaZNajwiekszaSuma = -1;

        for (int liczba : tablica) {
            int sumaCyfr = obliczSumeCyfr(liczba);

            if (sumaCyfr > maksymalnaSuma) {
                maksymalnaSuma = sumaCyfr;
                liczbaZNajwiekszaSuma = liczba;
            }
        }

        return liczbaZNajwiekszaSuma;
    }

    public static int obliczSumeCyfr(int liczba) {
        int suma = 0;

        while (liczba > 0) {
            suma += liczba % 10; // Pobieramy ostatnią cyfrę i dodajemy do sumy.
            liczba /= 10; // Usuwamy ostatnią cyfrę.
        }

        return suma;
    }


}
