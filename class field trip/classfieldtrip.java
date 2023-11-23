import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class classfieldtrip {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String a = scn.nextLine();
        String b = scn.nextLine();
        scn.close();
        List<String> l = Arrays.asList((a+b).split(""));
        Collections.sort(l);
        System.out.println(String.join("", l));
    } 
}
