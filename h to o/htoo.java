import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class htoo {

    public static Map<Character, Integer> getStock(String compound) {
        Map<Character, Integer> stock = new HashMap<>();
        int i = 0;
        while (i < compound.length()) {
            char element = compound.charAt(i);
            int increase = 1;
            int j = i + 1;
            int k = j;
            while (j < compound.length() && Character.isDigit(compound.charAt(j))) {
                j++;
            }
            if (k != j) {
                increase = Integer.parseInt(compound.substring(k, j));
            }
            stock.merge(element, increase, Integer::sum);
            i = j;
        }
        return stock;
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        String compoundIn = scn.next();
        int num = scn.nextInt();
        String compoundOut = scn.next();
        scn.close();

        Map<Character, Integer> stockIn = getStock(compoundIn);
        Map<Character, Integer> stockOut = getStock(compoundOut);
        int result = Integer.MAX_VALUE;
        try {
            for (char key: stockOut.keySet()) {
                int amount = stockIn.get(key) * num / stockOut.get(key);
                if (amount < result) {
                    result = amount;
                }
            }
            System.out.println(result);
        }
        catch (Exception e) {
            System.out.println(0);
        }

    }
    
}
