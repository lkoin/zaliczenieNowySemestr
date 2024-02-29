import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class zadanie3test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Podaj rozmiar tablicy: ");
        int n = scanner.nextInt();

        int[] tablica = new int[n];

        System.out.println("Automatycznie generowane elementy tablicy:");
        for (int i = 0; i < n; i++) {
            tablica[i] = random.nextInt(10000000); // Zakres losowanych liczb od 0 do 99 (możesz dostosować zakres według potrzeb)
            System.out.print(tablica[i] + " ");
        }
        System.out.println();
        long start = System.currentTimeMillis();
// ...
        long finish = System.currentTimeMillis();
        long timeElapsed = finish - start;

        System.out.println(timeElapsed);

        Arrays.sort(tablica);
        System.out.println();
//        System.out.println(Arrays.toString(tablica));
        System.out.println();
        System.out.println("Wartosc minimalna: " + tablica[0]);
        System.out.println("Wartosc maksymalna: "+ tablica[tablica.length-1]);
    }
}
