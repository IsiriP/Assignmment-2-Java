package codesnippet;
import java.util.*;

public class DistinctCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        Set<Character> distinctChars = new LinkedHashSet<>();
        for (char ch : str.toCharArray()) {
            distinctChars.add(ch);
        }
        System.out.println("Distinct characters: " + distinctChars);
    }
}
