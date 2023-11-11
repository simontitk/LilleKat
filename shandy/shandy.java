import java.lang.Math;
import java.util.Scanner;

public class shandy {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        scn.close();
        System.out.println(Math.min(n1, n2) * 2);
    }
}
