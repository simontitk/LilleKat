import java.util.Scanner;

public class SSD {

    public static int SSDfunc(int b, int n) {

        int result = 0;
        while(n != 0) {
            result += Math.pow(n % b, 2);
            n = n / b;
        }
        return result;
    }
    
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        int P = scn.nextInt();

        for (int i=0; i<P; i++) {

            int index = scn.nextInt();
            int base = scn.nextInt();
            int n = scn.nextInt();

            System.out.println(index + " " + SSDfunc(base, n));
        }
        scn.close();
    }
}
