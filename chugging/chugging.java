import java.util.Scanner;

public class chugging {

    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int ta = scn.nextInt();
        int da = scn.nextInt();
        int tb = scn.nextInt();
        int db = scn.nextInt();
        scn.close();

        int sum_a = (n * ta) + ((n * (n - 1)) / 2) * da;
        int sum_b = (n * tb) + ((n * (n - 1)) / 2) * db;

        if (sum_a < sum_b) {
            System.out.println("Alice");
        }
        else if (sum_a > sum_b) {
            System.out.println("Bob");}
        else {
            System.out.println("=");
        }
    }
}