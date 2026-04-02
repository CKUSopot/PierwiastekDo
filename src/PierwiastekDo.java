import java.util.InputMismatchException;
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
        double liczba = 0;
        Boolean bylBlad;
        do {
            bylBlad = false;
            System.out.print("Proszę podać liczbę do pierwiastkowania: ");
            try {
                liczba = scanner.nextInt();
            }catch(InputMismatchException e){
                scanner.nextLine();
                bylBlad = true;
            }
        }while(liczba < 0 || bylBlad);
        double perwiastek = Math.sqrt(liczba);
        System.out.println("perwiastek = " + perwiastek);
//        }
    }
}
