
public class Main {

    public static void main(String[] args) {

        Scrabble scrabble = new Scrabble("quirky", new Character[]{}, new Character[]{},true, false);

        System.out.println(scrabble.score());
    }
}
