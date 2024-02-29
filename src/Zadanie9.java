import java.util.Scanner;

public class Zadanie9 {

    public static void main(String[] args) {
        int dolnyZakres = 0;
        int gornyZakres = 5000000;
        int liczbaDoZgadniecia = losujLiczbe(dolnyZakres, gornyZakres);
        int iloscPytan = 20;
        int szanse = 1;

        System.out.println("Zgadnij liczbę z zakresu od " + dolnyZakres + " do " + gornyZakres + ".");
        System.out.println("Masz " + iloscPytan + " pytań. Pamiętaj, że możesz się pomylić raz.");

        while (iloscPytan > 0) {
            System.out.print("Czy szukana liczba jest mniejsza od ");
            int propozycja = (dolnyZakres + gornyZakres) / 2;
            System.out.print(propozycja + "? (Tak/Nie): ");

            Scanner scanner = new Scanner(System.in);
            String odpowiedz = scanner.nextLine().trim().toLowerCase();

            if (odpowiedz.equals("tak")) {
                gornyZakres = propozycja - 1;
            } else if (odpowiedz.equals("nie")) {
                dolnyZakres = propozycja + 1;
            } else {
                System.out.println("Błędna odpowiedź. Wprowadź Tak lub Nie.");
                continue;
            }

            iloscPytan--;

            System.out.println("Liczba możliwych pytań: " + iloscPytan);

            if (iloscPytan > 0) {
                System.out.print("Czy chcesz odgadnąć liczbę? (Tak/Nie): ");
                String odgadnij = scanner.nextLine().trim().toLowerCase();

                if (odgadnij.equals("tak")) {
                    System.out.print("Podaj swoją propozycję liczby: ");
                    int propozycjaOdgadniecia = scanner.nextInt();

                    if (propozycjaOdgadniecia == liczbaDoZgadniecia) {
                        System.out.println("Brawo! Zgadłeś liczbę!");
                        break;
                    } else {
                        System.out.println("Niestety, nie zgadłeś liczby. Tracisz jedną szansę.");
                        szanse--;

                        if (szanse == 0) {
                            System.out.println("Przegrałeś. Koniec gry.");
                            break;
                        }
                    }
                }
            }
        }
    }

    static int losujLiczbe(int dolnyZakres, int gornyZakres) {
        return (int) (Math.random() * (gornyZakres - dolnyZakres + 1) + dolnyZakres);
    }
}
