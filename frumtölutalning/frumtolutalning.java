import java.util.Scanner;

public class whatever {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int a = scn.nextInt();
        int b = scn.nextInt();
        int numberOfPrimes = 0;
        for (int n = a; n<=b; n++) {
            boolean nIsAPrime = true;

            for (int i = 2; i<n; i++) {
                if (n % i == 0) {
                    nIsAPrime = false;
                    break;
                }
            }
            if (nIsAPrime) {
                System.out.println(n);
                numberOfPrimes++;
            }
        }
        if (a==1) {
            numberOfPrimes--;
        }
        System.out.println(numberOfPrimes);
        scn.close();

    }
}
