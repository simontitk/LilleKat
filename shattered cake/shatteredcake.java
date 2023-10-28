    
import java.util.Scanner;

public class shatteredcake {


    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);

        int width = scn.nextInt();
        int N = scn.nextInt();
        int area = 0;

        for (int i=0; i<N; i++) {

            area += scn.nextInt() * scn.nextInt();
        }

        System.out.println(area / width);

        scn.close();
    }    
}
