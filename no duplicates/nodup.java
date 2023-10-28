import java.util.Scanner;
import java.util.TreeSet;


public class nodup {

    public static void main(String[] args) {
        
    
        Scanner scn = new Scanner(System.in);
        String[] words = scn.nextLine().split(" ");
        scn.close();

        TreeSet<String> checkedWords = new TreeSet<>();

        String isOk = "yes";

        for (String word: words) {
           
            if (checkedWords.contains(word)) {
                isOk = "no";
                break;
            }
            checkedWords.add(word);
            
        }
        System.out.println(isOk);
        

    }
    
}
