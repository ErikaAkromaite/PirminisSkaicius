import java.util.Scanner;

public class pirminioSkaiciaus2pwz {
    public static void main(String[] args) {

        Scanner skaitytuvas = new Scanner(System.in);
        System.out.println("Įveskite skaičių: ");
        Integer skaicius = skaitytuvas.nextInt();

        System.out.println("skaičius = " + skaicius);

        boolean arPirminis = arSkaiciusPirminis(skaicius);
        System.out.println("Ar skaičius pirminis : " + arPirminis);

    }

    public static boolean arSkaiciusPirminis(int sk) {

        boolean arYra = true;
        for (int i = 2; i <= sk / 2; ++i) {

            if (sk % i == 0) {
                arYra = false;

            }
        }
        return arYra;
    }

}