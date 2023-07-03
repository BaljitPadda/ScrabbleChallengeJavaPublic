import java.util.HashMap;
import java.util.Map;

public class Scrabble {
    private String word;
    private Map<String, Integer> letters;
    public Scrabble(String word) {
        this.word = word;
        this.letters = letters();
    }

    public int score() {
        if(this.word == null)
            return 0;
        int totalPoints = 0;

        for (char c : this.word.toCharArray()) {

            String key = String.valueOf(c);
            totalPoints += this.letters.get(key);
        }
        return totalPoints;
    }

    public Map<String, Integer> letters() {
        Map<String, Integer> letters = new HashMap<>();

        letters.put("a", 1);
        letters.put("e", 1);
        letters.put("i", 1);
        letters.put("o", 1);
        letters.put("u", 1);
        letters.put("l", 1);
        letters.put("n", 1);
        letters.put("r", 1);
        letters.put("s", 1);
        letters.put("t", 1);
        letters.put("d", 2);
        letters.put("g", 2);
        letters.put("b", 3);
        letters.put("c", 3);
        letters.put("m", 3);
        letters.put("p", 3);
        letters.put("f", 4);
        letters.put("h", 4);
        letters.put("v", 4);
        letters.put("w", 4);
        letters.put("y", 4);
        letters.put("k", 5);
        letters.put("j", 8);
        letters.put("x", 8);
        letters.put("q", 10);
        letters.put("z", 10);

        return letters;
    }

}
