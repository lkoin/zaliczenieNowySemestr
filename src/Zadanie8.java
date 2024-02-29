public class Zadanie8 {

    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int[] tablica = {2, 4, 7, 8, 10, 12, 15, 20};

        int liczbaElementow = liczbaElementowWPrzedziale(tablica, a, b);

        System.out.println("Liczba elementów w przedziale [" + a + ", " + b + "]: " + liczbaElementow);
    }

    public static int liczbaElementowWPrzedziale(int[] tablica, int a, int b) {
        if (a > b) {
            throw new IllegalArgumentException("Liczba a musi być mniejsza lub równa liczbie b.");
        }

        int liczbaElementow = 0;

        for (int liczba : tablica) {
            if (liczba >= a && liczba <= b) {
                liczbaElementow++;
            }
        }

        return liczbaElementow;
    }
}