import java.util.Scanner;

public class provincesandgold {

    private static String getVictory(int n) {
        if (n >= 8) {
            return "Province or ";
        }
        if (n >= 5) {
            return "Duchy or ";
        }
        if (n >= 2) {
            return "Estate or ";
        }
        return "";
    } 
    
    private static String getTreasure(int n) {
        if (n >= 6) {
            return "Gold";
        }
        if (n >= 3) {
            return "Silver";
        }
        return "Copper";
    } 


    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);

        int sum = scn.nextInt() * 3 + scn.nextInt() * 2 + scn.nextInt();

        System.out.println(getVictory(sum)+getTreasure(sum));

        scn.close();
    }    
}
