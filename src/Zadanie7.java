public class Zadanie7 {

    public static void main(String[] args) {
        int liczba = 25; // Przykładowa liczba całkowita dodatnia

        int pierwiastek = znajdzPierwiastekDyskretny(liczba);

        System.out.println("Pierwiastek kwadratowy dyskretny z liczby " + liczba + " to: " + pierwiastek);
    }

    public static int znajdzPierwiastekDyskretny(int liczba) {
        if (liczba < 0) {
            throw new IllegalArgumentException("Liczba musi być dodatnia.");
        }

        if (liczba == 0 || liczba == 1) {
            return liczba; // Pierwiastek z 0 i 1 to sama liczba.
        }

        int lewy = 1;
        int prawy = liczba;

        while (lewy <= prawy) {
            int srodek = (lewy + prawy) / 2;

            if (srodek * srodek == liczba) {
                return srodek; // Znaleziono dokładny pierwiastek.
            } else if (srodek * srodek < liczba) {
                lewy = srodek + 1;
            } else {
                prawy = srodek - 1;
            }
        }

        // Po wyjściu z pętli, prawy wskaże największą liczbę całkowitą mniejszą lub równą pierwiastkowi.
        return prawy;
    }
}