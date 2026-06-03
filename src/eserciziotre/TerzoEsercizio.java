package eserciziotre;

import java.util.Scanner;

public class TerzoEsercizio {
    static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("inserire una parola");
        String parola = scanner.nextLine();
        System.out.println(daLettereACaratteri(parola));

    }
    public static String daLettereACaratteri (String parola){
        String paroladefault = ":q";
        while (parola.equals(paroladefault)){return parola;}
            return parola.join(", ", parola.split(""));
    }
}
