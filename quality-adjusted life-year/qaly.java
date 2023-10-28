import java.util.Scanner;

public class qaly {
    public static void main(String[] args) {

        double result = 0;
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.nextLine();
        for (int i = 0; i<n; i++) {
            String[] res = scn.nextLine().split(" ");
            result += Double.parseDouble(res[0]) * Double.parseDouble(res[1]);
        }
        System.out.println(result);
        scn.close();
    }
}