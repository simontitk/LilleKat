import java.util.Scanner;

public class grassseed {

    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        
        String w = scn.nextLine();
        System.out.println(w.charAt(1) + "" + w.charAt(0));
        scn.close();
    }
}