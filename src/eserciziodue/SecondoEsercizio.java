package eserciziodue;
import java.util.Scanner;
public class SecondoEsercizio {
    static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("inserire un numero");
        int numero = scanner.nextInt();
        System.out.println("Il tuo numero è :"+numeroTraZeroETre(numero));

    }
    public static String numeroTraZeroETre (int numero){
      String risposta = switch(numero){
            case 0 -> "zero";
            case 1 -> "uno";
            case 2 -> "due";
            case 3 -> "tre";
            default -> "NUMERO NON LEGGIBILE";
        };
        return risposta;
    }
}
