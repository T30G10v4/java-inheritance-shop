package inheritance.shop;

import java.math.BigDecimal;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Cart {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        boolean hasCard;
        String name;
        String description;
        BigDecimal price;
        BigDecimal vat;
        int imei;
        int ram;
        int inches;
        boolean isSmart;
        String color;
        boolean isWireless;



        int choose;

        System.out.print("Ha la tessera punti? 0 - NO, 1 - SI");
        if(scan.nextLine()=="0") hasCard = false;
        else hasCard = true;

        do {

            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("***********************************************************");
            System.out.println("0 - Esci dal programma");
            System.out.println("1 - Inserisci uno smartphone");
            System.out.println("2 - Inserisci un TV");
            System.out.println("3 - Inserisci una cuffia");
            System.out.print("Scelta: ");
            choose = Integer.parseInt(scan.nextLine());

            switch (choose) {
                case 0:
                    System.out.println("Chiusura in corso...");
                    break;
                case 1:
                    System.out.println("Inserisco uno smartphone...");

                    System.out.print("Nome: ");
                    name=scan.nextLine();
                    System.out.println("");

                    System.out.print("Descizione: ");
                    description=scan.nextLine();
                    System.out.println("");

                    System.out.print("Prezzo: ");
                    price=new BigDecimal(scan.nextLine());
                    System.out.println("");

                    System.out.print("Iva: ");
                    vat=new BigDecimal(scan.nextLine());
                    System.out.println("");

                    System.out.print("Imei: ");
                    imei=Integer.parseInt(scan.nextLine());
                    System.out.println("");

                    System.out.print("Ram: ");
                    ram=Integer.parseInt(scan.nextLine());
                    System.out.println("");

                    Smartphone tlp = new Smartphone(name, description, price, vat, imei, ram);

                    System.out.println(tlp.toString());

                    if(hasCard) System.out.println("Prezzo Scontato: "+tlp.getDiscountPrice(hasCard));

                    break;
                case 2:
                    System.out.println("Inserisco un TV...");

                    System.out.print("Nome: ");
                    name=scan.nextLine();
                    System.out.println("");

                    System.out.print("Descizione: ");
                    description=scan.nextLine();
                    System.out.println("");

                    System.out.print("Prezzo: ");
                    price=new BigDecimal(scan.nextLine());
                    System.out.println("");

                    System.out.print("Iva: ");
                    vat=new BigDecimal(scan.nextLine());
                    System.out.println("");

                    System.out.print("Pollici: ");
                    inches = Integer.parseInt(scan.nextLine());
                    System.out.println("");

                    System.out.print("È smart: ");
                    if (Integer.parseInt(scan.nextLine()) == 0) isSmart=false;
                    else isSmart = true;

                    Tv tvl = new Tv(name, description, price, vat, inches, isSmart);

                    System.out.println(tvl.toString());

                    if(hasCard) System.out.println("Prezzo Scontato: "+tvl.getDiscountPrice(hasCard));
                    break;


                case 3:
                    System.out.println("Inserisco una cuffia...");

                    System.out.print("Nome: ");
                    name=scan.nextLine();
                    System.out.println("");

                    System.out.print("Descizione: ");
                    description=scan.nextLine();
                    System.out.println("");

                    System.out.print("Prezzo: ");
                    price=new BigDecimal(scan.nextLine());
                    System.out.println("");

                    System.out.print("Iva: ");
                    vat=new BigDecimal(scan.nextLine());
                    System.out.println("");

                    System.out.print("Colore: ");
                    color = scan.nextLine();
                    System.out.println("");

                    System.out.print("È wireless: ");
                    if (Integer.parseInt(scan.nextLine()) == 0) isWireless=false;
                    else isWireless = true;

                    Earphones cuf = new Earphones(name, description, price, vat, color, isWireless);

                    System.out.println(cuf.toString());

                    if(hasCard) System.out.println("Prezzo Scontato: "+cuf.getDiscountPrice(hasCard));
                    break;
            }
            System.out.println("***********************************************************");
            System.out.println("");
            System.out.println("");
            System.out.println("");

        }

        while(choose != 0);
    }
}
