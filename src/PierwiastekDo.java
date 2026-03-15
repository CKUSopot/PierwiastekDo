import java.util.Scanner;
/**
 * 7. Używając instrukcji do…while() napisz program PierwiastekDo, który będzie
 * wczytywał liczbę do pierwiastkowania. Ponieważ pierwiastkowana liczba powinna być
 * dodatnia użytkownik będzie odpytywany o wartość do momentu wprowadzenia liczby
 * dodatniej.
 */
public class PierwiastekDo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        boolean blad;
//        try {
//          blad = false;
        double liczba;
        do {
            System.out.print("Proszę podać liczbę do pierwiastkowania: ");
            liczba = scanner.nextInt();
        }while(liczba < 0);
        double perwiastek = Math.sqrt(liczba);
        System.out.println("perwiastek = " + perwiastek);
//        }
    }
}
