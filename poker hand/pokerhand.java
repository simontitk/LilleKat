import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;


public class pokerhand {
    
    public static void main(String[] args) {
        
        HashMap<Character, Integer> count = new HashMap<>();

        Scanner scn = new Scanner(System.in);

        String[] hand = scn.nextLine().split(" ");

        for (String card: hand) {

            char rank = card.charAt(0);
            if (count.containsKey(rank)) {
                count.replace(rank, count.get(rank)+1);
            }
            else {
                count.put(rank, 1);
            }
        }
        
        System.out.println(Collections.max(count.values()));

        scn.close();
    }
}
