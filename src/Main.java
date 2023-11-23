
public class Main {
    public static void main(String[] args) {

        //3.10 Napisz program który pobierze liczby z parametrów i wykona na nich operacje
        //arytmetyczne.

        //Testowanie dodawania liczb z parametrów
        //System.out.println(Integer.parseInt(args[0]) + Integer.parseInt(args[1]));




        //Pobranie liczb z argumentów
        int zmiennaInt1 = Integer.parseInt(args[0]);
        int zmiennaInt2 = Integer.parseInt(args[1]);
        int zmiennaInt3 = Integer.parseInt(args[2]);

        //Wykonanie operacji arytmetycznych
        int wynikDodawania1 = zmiennaInt1 + zmiennaInt2 + zmiennaInt3;
        int wynikMnozenia1 = zmiennaInt2 * zmiennaInt3;
        int dzilanieNawiasy = (zmiennaInt1 + zmiennaInt3) * zmiennaInt2;

        //Wyświetlenie wyniku operacji arymetycznych
        System.out.print(zmiennaInt1 + " + " + zmiennaInt2 + " + " + zmiennaInt3 + " = " + wynikDodawania1);
        System.out.print("\n"+zmiennaInt2 + " * " + zmiennaInt3 + " = "  + wynikMnozenia1);
        System.out.print("\n("+zmiennaInt1 + " + " + zmiennaInt3 + ") "  + " * " + zmiennaInt2 + " = " + dzilanieNawiasy);

    }
}