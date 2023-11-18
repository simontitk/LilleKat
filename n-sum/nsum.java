import java.util.Scanner;

public class nsum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int res = 0;
        for (int i = 0; i < n; i ++) {
            res += scn.nextInt();
        }
        scn.close();
        System.out.println(res);
    }
}