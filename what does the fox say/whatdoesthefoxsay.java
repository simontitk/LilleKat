import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.List;

public class whatdoesthefoxsay {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.nextLine();
        for (int i=0; i<n; i++) {
            List<String> sounds = List.of(scn.nextLine().split(" "));
            Set<String> knownSounds = new HashSet<>();
            while (true) {
                try {
                    knownSounds.add(scn.nextLine().split(" goes ")[1]);
                }
                catch (ArrayIndexOutOfBoundsException e) {
                    String result = "";
                    for (String sound : sounds) {
                        if (!knownSounds.contains(sound)) {
                            result += " " + sound;
                        }
                    }
                    System.out.println(result.strip());
                    break;
                }
            }
        }
        scn.close();
    }
}
