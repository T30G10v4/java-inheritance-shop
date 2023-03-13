package java.inheritance.shop;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Cart {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int choose;

        do {

            System.out.println("0 - Esci dal programma");
            System.out.println("1 - Visualizza il carrello");
            System.out.println("2 - Inserisci uno smartphone");
            System.out.println("3 - Inserisci un TV");
            System.out.println("4 - Inserisci una cuffia");
            System.out.print("Scelta: ");
            choose = Integer.parseInt(scan.nextLine());

            switch (choose) {
                case 0:
                    System.out.println("Chiusura in corso...");
                    break;
                case 1:
                    System.out.println("Visualizzo il carrello...");
                    break;
                case 2:
                    System.out.println("Inserisco uno smartphone...");
                    break;
                case 3:
                    System.out.println("Inserisco un TV...");
                    break;
                case 4:
                    System.out.println("Inserisco una cuffia...");
                    break;
            }

        }
        while(choose != 0);
    }
}
