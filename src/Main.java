
public class Main {
    public static void main(String[] args) {

        //3.10 Napisz program który pobierze liczby z parametrów i wykona na nich operacje
        //arytmetyczne.

        //Testowanie dodawania liczb z parametrów
        //System.out.println(Integer.parseInt(args[0]) + Integer.parseInt(args[1]));

        //Sprawdzenie czy podano conajmniej dwa parametry
        if(args.length<3)
        {
            System.out.println("Podano za mało parametrów. Minimalna ilość to 3!");
            return;
        }

        //Pobranie liczb z argumentów.
        //Metoda parseInt przekształca argument programu (args[0]), który znajduje się na pierwszej pozycji (index 0), na
        //liczbę całkowitą, a następnie przypisuje ją do zmiennej o nazwie zmiennaInt1, która jest typu int.
        int zmiennaInt1 = Integer.parseInt(args[0]);
        int zmiennaInt2 = Integer.parseInt(args[1]);
        int zmiennaInt3 = Integer.parseInt(args[2]);

        //Wykonanie operacji arytmetycznych
        int wynikDodawania1 = zmiennaInt1 + zmiennaInt2 + zmiennaInt3;
        int wynikMnozenia1 = zmiennaInt2 * zmiennaInt3;
        int dzilanieNawiasy = (zmiennaInt1 + zmiennaInt3) * zmiennaInt2;
        int wynikRoznica = zmiennaInt3 - zmiennaInt2;
        double wynikDzielenie = (double)zmiennaInt2 / (double)zmiennaInt3;

        //Wyświetlenie wyniku operacji arymetycznych
        System.out.print(zmiennaInt1 + " + " + zmiennaInt2 + " + " + zmiennaInt3 + " = " + wynikDodawania1);
        System.out.print("\n"+zmiennaInt2 + " * " + zmiennaInt3 + " = "  + wynikMnozenia1);
        System.out.print("\n("+zmiennaInt1 + " + " + zmiennaInt3 + ") "  + " * " + zmiennaInt2 + " = " + dzilanieNawiasy);
        System.out.print("\n"+zmiennaInt3 + " - " + zmiennaInt2 + " = "  + wynikRoznica);
        if(zmiennaInt3 !=0){
            System.out.print("\n"+zmiennaInt2 + " / " + zmiennaInt3 + " = "  + wynikDzielenie);
        }else{System.out.println("\nDzielenie przez 0 jest niemożliwe!!!");}
    }
}