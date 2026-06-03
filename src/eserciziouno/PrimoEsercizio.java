package eserciziouno;

import java.util.Scanner;

public class PrimoEsercizio {
        static void main(String[] args) {
            Scanner scanner= new Scanner(System.in);
            System.out.println("inserire una parola");
            String parola = scanner.nextLine();
            String risultato = pariodispari(parola);
            System.out.println("la tua parola :" + risultato);
    }
    public static String pariodispari(String parola){
        return (parola.length()%2 == 0)? "LUNGHEZZA PARI" : "LUNGHEZZA DISPARI";
    }
}
