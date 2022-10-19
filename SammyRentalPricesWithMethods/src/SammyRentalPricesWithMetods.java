import java.util.Scanner;
public class SammyRentalPricesWithMetods {
    public static void main(String[] args) {
        System.out.println(invitati());
        motto();
    }

    public static int invitati() {
        int min, a;
        System.out.print("Adaugati nr de minute =  ");
        Scanner inputDevice = new Scanner(System.in);
        min = inputDevice.nextInt();
        a = min;
        pret(a);
        System.out.print(" \n Nr de minute  este =  ");
        return min;
    }

    public static void motto() {
        System.out.println(" Sammy is makes it fun in the sun  \n ");
    }

    public static void pret(int x) {
        System.out.print("Adaugati nr de ore =  ");
        Scanner inputDevice = new Scanner(System.in);
        int o = inputDevice.nextInt();
        int p = x +40* o ;
        System.out.print("Pretul total este  " + p  ) ;
        System.out.print(" \n Numarul de ore este "+ o);
    }
}
