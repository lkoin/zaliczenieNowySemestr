public class Zadanie5 {

    public static void main(String[] args) {
        int[] tablica = {1, 3, 5, 8, 10, 12, 14}; // Przykładowa posortowana tablica liczb całkowitych

        int indeksPierwszegoParzystego = znajdzPierwszyElementParzysty(tablica);

        System.out.println("Pierwszy element parzysty znajduje się na indeksie: " + indeksPierwszegoParzystego);
    }

    static int znajdzPierwszyElementParzysty(int[] tablica) {
        int lewy = 0;
        int prawy = tablica.length - 1;

        while (lewy <= prawy) {
            int srodek = (lewy + prawy) / 2;

            if (tablica[srodek] % 2 == 0) {
                // Jeśli środkowy element jest parzysty, sprawdzamy lewą połowę.
                prawy = srodek - 1;
            } else {
                // Jeśli środkowy element jest nieparzysty, sprawdzamy prawą połowę.
                lewy = srodek + 1;
            }
        }

        // Po wyjściu z pętli lewy wskaże pierwszy element parzysty.
        return lewy;
    }
}
