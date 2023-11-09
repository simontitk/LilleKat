import java.util.Scanner;
import java.util.regex.*;

public class beekeeper {

    public static void parseGroup(int n, Scanner scn, Pattern p) {
        int maxDoubleCount = -1;
        String maxWord = "";
        for (int i=0; i<n; i++) {
            String word = scn.next();
            Matcher m = p.matcher(word);
            int doubleCount = 0;
            while (m.find()) {
                doubleCount++;
            }
            if (doubleCount > maxDoubleCount) {
                maxDoubleCount = doubleCount;
                maxWord = word;
            }
        }
        System.out.println(maxWord);
    }

    public static void main(String[] args) {
        Pattern p = Pattern.compile("([aeiouy])\\1");
        Scanner scn = new Scanner(System.in);
        while (scn.hasNext()) {
            int n = scn.nextInt();
            if (n==0) {
                break;
            }
            parseGroup(n, scn, p);
        }
        scn.close();
    }
}