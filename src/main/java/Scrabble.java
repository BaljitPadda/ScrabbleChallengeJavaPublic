import java.util.*;

public class Scrabble {
    private final String word;
    private final Map<Character, Integer> letters;
    private final List<Character> doubleLetters;
    private final List<Character> tripleLetters;
    private final boolean doubleWord;
    private final boolean tripleWord;

    // Could not implement default parameters, so I have attempted to overload the constructor.
    public Scrabble(String word) {
        this(word, new Character[]{}, new Character[]{}, false, false);
    }

    public Scrabble(String word, Character[] doubleLetters, Character[] tripleLetters, boolean doubleWord, boolean tripleWord) {
        this.word = word;
        this.letters = letters();
        this.doubleLetters = new ArrayList<>(Arrays.asList(doubleLetters));
        this.tripleLetters = new ArrayList<>(Arrays.asList(tripleLetters));
        this.doubleWord = doubleWord;
        this.tripleWord = tripleWord;

        this.doubleLetters.replaceAll(Character::toLowerCase);
        this.tripleLetters.replaceAll(Character::toLowerCase);
    }

    public int score() {
        int totalPoints = 0;
        if (!isValidInput()) return 0;

        for (char c : this.word.toCharArray()) totalPoints += getTileValue(c);

        if (doubleWord) totalPoints *= 2;
        if (tripleWord) totalPoints *= 3;
        return totalPoints;
    }
    public boolean isValidInput() {
        return this.word != null && !this.word.trim().equals("");
    }
    public int getTileValue(char c) {
        int tileValue = this.letters.get(Character.toLowerCase(c));

        if (doubleLetters.contains(c)) {
            tileValue *= 2;
            doubleLetters.remove(Character.valueOf(c));
            return tileValue;
        }
         if (tripleLetters.contains(c)) {
            tileValue *= 3;
            tripleLetters.remove(Character.valueOf(c));
        }
        return tileValue;
    }

    public Map<Character, Integer> letters() {
        Map<Character, Integer> letters = new HashMap<>();

        letters.put('a', 1);
        letters.put('e', 1);
        letters.put('i', 1);
        letters.put('o', 1);
        letters.put('u', 1);
        letters.put('l', 1);
        letters.put('n', 1);
        letters.put('r', 1);
        letters.put('s', 1);
        letters.put('t', 1);
        letters.put('d', 2);
        letters.put('g', 2);
        letters.put('b', 3);
        letters.put('c', 3);
        letters.put('m', 3);
        letters.put('p', 3);
        letters.put('f', 4);
        letters.put('h', 4);
        letters.put('v', 4);
        letters.put('w', 4);
        letters.put('y', 4);
        letters.put('k', 5);
        letters.put('j', 8);
        letters.put('x', 8);
        letters.put('q', 10);
        letters.put('z', 10);

        return letters;
    }

}
