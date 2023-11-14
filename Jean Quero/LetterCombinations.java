import java.util.ArrayList;
import java.util.List;

public class LetterCombinations {

    public static List<String> letterCombinations(String digits) {

        List<String> result = new ArrayList<>();
        if (digits == null || digits.isEmpty()) {
            return result;
        }
        List<String[]> phoneLetter = new ArrayList<>();

        phoneLetter.add(new String[]{});
        phoneLetter.add(new String[]{});
        phoneLetter.add(new String[]{"a","b","c"});
        phoneLetter.add(new String[]{"d","e","f"});
        phoneLetter.add(new String[]{"g","h","i"});
        phoneLetter.add(new String[]{"j","k","l"});
        phoneLetter.add(new String[]{"m","n","o"});
        phoneLetter.add(new String[]{"p","q","r", "s"});
        phoneLetter.add(new String[]{"t","u","v"});
        phoneLetter.add(new String[]{"w","x","y","z"});

        char[] numbers = digits.toCharArray();

        addLetter(0,numbers,phoneLetter,new StringBuilder(),result);
        return result;
    }

    private static void addLetter(int i, char[] numbers, List<String[]> phoneLetter, StringBuilder combination, List<String> result) {

        if (i == numbers.length) {
            result.add(combination.toString());
            return;
        }

        String[] letters = phoneLetter.get(numbers[i]- '0');

        for (String letter: letters) {
            addLetter(i+1,numbers,phoneLetter,combination.append(letter), result);
            combination.deleteCharAt(combination.length() - 1);
        }

    }

    public static void main(String[] args) {
        letterCombinations("23");
    }
    private static List<String> letterCombinations2(String digits) {
        // Resultant list
        List<String> combinations = new ArrayList<>();
        // Base condition
        if (digits == null || digits.isEmpty()) {
            return combinations;
        }
        // Mappings of letters and numbers
        String[] lettersAndNumbersMappings = new String[]{
                "Anirudh",
                "is awesome",
                "abc",
                "def",
                "ghi",
                "jkl",
                "mno",
                "pqrs",
                "tuv",
                "wxyz"
        };
        findCombinations(combinations, digits, new StringBuilder(), 0, lettersAndNumbersMappings);
        return combinations;
    }

    private static void findCombinations(List<String> combinations, String digits, StringBuilder previous, int index, String[] lettersAndNumbersMappings) {
        // Base condition for recursion to stop
        if (index == digits.length()) {
            combinations.add(previous.toString());
            return;
        }
        // Get the letters corresponding to the current index of digits string
        String letters = lettersAndNumbersMappings[digits.charAt(index) - '0'];
        // Loop through all the characters in the current combination of letters
        for (char c : letters.toCharArray()) {
            findCombinations(combinations, digits, previous.append(c), index + 1, lettersAndNumbersMappings);
            previous.deleteCharAt(previous.length() - 1);
        }
    }


}
