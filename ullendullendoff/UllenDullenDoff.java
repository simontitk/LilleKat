import java.util.Scanner;

public class UllenDullenDoff {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        scn.nextLine();

        String name = scn.nextLine();
        
        scn.close();

        String[] arr = name.split(" ");

        System.out.println();

        int index = 13 % n;

        System.out.println(arr[index-1]);
    }
}
 