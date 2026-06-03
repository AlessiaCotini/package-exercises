package eserciziouno;

import java.util.Scanner;

public class PrimoEsercizio {
        static void main(String[] args) {
            Scanner scanner= new Scanner(System.in);
            System.out.println("inserire una parola");
            String parola = scanner.nextLine();
            System.out.println("la tua parola :" + pariodispari(parola));
            System.out.println("inserire un anno");
            int anno = scanner.nextInt();
            System.out.println("L'anno inserito risulta :" + annoBisestile(anno));
    }
    public static String pariodispari(String parola){
        return (parola.length()%2 == 0)? "LUNGHEZZA PARI" : "LUNGHEZZA DISPARI";
    }
    public static String annoBisestile (int anno){
            if (anno %4== 0){
            return ((anno/400/100 ) == 0)? "ANNO BISESTILE" : "ANNO NON BISESTILE";}
            else {return "ANNO NON BISESTILE";}
    }
}
