import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int ekok = 1, ebob = 1, i = 1, k = 1;
        System.out.print("1. sayıyı girin: ");
        int a = scn.nextInt();
        System.out.print("2. sayıy girin: ");
        int b = scn.nextInt();

        int c = (a > b) ? b : a;
        while (i <= c) {
            if (a % i == 0 && b % i == 0) {
                ebob = i;
            }
            i++;
        }
        while (k <= (a * b)) {
            if (k % a == 0 && k % b == 0) {
                //System.out.println(k);
                ;
                break;
            }
            k++;
        }
        System.out.println(a+ " ve " +b+ " sayılarının EBOB'u: " +ebob);
        System.out.println(a+ " ve " +b+ " sayılarının EKOK'u: " +k);


    }
}
