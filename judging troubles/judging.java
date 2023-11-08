import java.util.HashMap;
import java.util.Scanner;
import java.lang.Math;

public class judging {

    public static void main(String[] args) {
        
        HashMap<String, Integer> kat = new HashMap<>();
        HashMap<String, Integer> dom = new HashMap<>();

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for (int i=0; i<n; i++) {
            String w = scn.next();
            if( kat.containsKey(w)) {
                kat.put(w, kat.get(w)+1);
            }
            else {
                kat.put(w, 1);
            }
        }

        for (int i=0; i<n; i++) {
            String w = scn.next();
            if( dom.containsKey(w)) {
                dom.put(w, dom.get(w)+1);
            }
            else {
                dom.put(w, 1);
            }
        }

        int result = 0;

        for (String key : kat.keySet()) {
            if (dom.containsKey(key)) {
                result += Math.min(dom.get(key),kat.get(key));

            }
        }
        scn.close();
        System.out.println(result);
        
    }
}