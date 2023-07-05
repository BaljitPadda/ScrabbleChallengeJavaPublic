
public class Main {

    public static void main(String[] args) {

        Scrabble scrabble = new Scrabble("a", new Character[]{}, new Character[]{'A'},false, false);

        System.out.println(scrabble.score());
    }
}
