package esercizioquattro;

import java.sql.Array;
import java.util.Scanner;

public class QuartoEsercizio {
    static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("inserire un numero");
        int inserito = scanner.nextInt();
        System.out.println("Secondi al lancio :" + inserito);
        System.out.println(lancioSullaLuna(inserito));
    }
   public static String lancioSullaLuna (int inserito){
       StringBuilder risultato = new StringBuilder("Secondi al lancio: " + inserito + "\n");
       if (inserito <= 20) {
           int[] numeri = new int[inserito]; //
           for (int i = 0; i < numeri.length; i++) {
               if (i % 2 == 0) {
                   risultato.append("[OK] ").append(i);
               } else {
                   risultato.append("[CHECK] ").append(i);
               }
               if (i < numeri.length - 1) {
                   risultato.append(", ");
               }return risultato.toString();
           }
       } else {
           int[] numeri = new int[21]; //
           for (int i = 0; i < numeri.length; i++) {
               if (i % 2 == 0) {
                   risultato.append("[OK] ").append(i);
               } else {
                   risultato.append("[CHECK] ").append(i);
               }
               if (i < numeri.length - 1) {
                   risultato.append(", ");
               }
           };
       }
       return risultato.toString();
    }
}
