import java.util.Scanner;

public class unoreverse {
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        int k = scn.nextInt();
        int n =  scn.nextInt();
        scn.close();

        if (k == 2 && n !=0) {
            System.out.println("YES");
        }
        else if (n == 1) {
            System.out.println("YES");
        }
        else if (n == 2) {
            System.out.println("NO");
        }
        else if (n % 2 == 1) {
            System.out.println("MAYBE");
        }
        else if ((k ==2) && (n % 2 == 0)) {
            System.out.println("NO");
        }
        else if ((n % 2 == 0) && ( n >= 2*(k-1))) {
            System.out.println("MAYBE");
        }
        else {
            System.out.println("NO");
        }
    }
}