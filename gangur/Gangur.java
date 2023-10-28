import java.util.Scanner;     

public class Gangur {
    
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
    
        char[] txt = scn.nextLine().toCharArray();
    
        scn.close();
        
        int clash = 0;

        for (int i=0; i<txt.length; i++) {
           if (txt[i] == '>') {
                for (int j = i+1; j<txt.length; j++) {
                    if (txt[j] == '<') {
                        clash++;
                    }
                }
           }
        }
    System.out.println(clash);
    }
}
