import java.util.Scanner;

public class cudoviste {
    public static void main(String[] args) {
        int[] spaces = new int[5];
        Scanner scn = new Scanner(System.in);
        int h = scn.nextInt();
        int w = scn.nextInt();
        scn.nextLine();
        String l1 = scn.nextLine();
        for (int i = 0; i< h-1; i++) {
            String l2 = scn.nextLine();
            for (int j = 0; j<w-1; j++) {
                String spots = l1.substring(j, j+2) + l2.substring(j, j+2);
                boolean hasBuilding = false;
                int count = 0;
                for (char c : spots.toCharArray()) {
                    if (c == '#') {
                        hasBuilding = true;
                    }
                    if (c == 'X') {
                        count++;
                    }
                }
                if (!hasBuilding) {
                    spaces[count]++;
                } 
            }
            l1 = l2;
        }
        scn.close();
        for (int space : spaces) {
            System.out.println(space);
        }
    }
}