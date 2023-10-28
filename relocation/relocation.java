import java.util.Scanner;
import java.lang.Math;

public class relocation {
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);

        int N = scn.nextInt();
        int Q = scn.nextInt();

        int[] companyLocations = new int[N];

        for (int i=0; i<N; i++) {
            companyLocations[i] = scn.nextInt();
        }

        for (int i=0; i<Q; i++) {
            int type = scn.nextInt();
            int firstNum = scn.nextInt();
            int secondNum = scn.nextInt();

            if (type==1) {
                companyLocations[firstNum-1] = secondNum;
            }
            if (type==2) {
                 System.out.println(Math.abs(companyLocations[firstNum-1] - companyLocations[secondNum-1]));
            }
        }
        scn.close();
       
    }
}