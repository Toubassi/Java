import java.util.ArrayList;
import java.util.Random;


public class TestPuzzleJava {
    
    public static void main(String[] args) {
        PuzzleJava generator = new PuzzleJava();
        ArrayList<Integer> randomRolls = generator.getTenRolls();
        // System.out.println(randomRolls);
        
                //..
        // Write your other test cases here.
        //..
        // ArrayList<String> first = generator.getNewPass(8);
        ArrayList<String> second = generator.getNewPass(5);
        // System.out.println(generator.getRandomLetter());
        // System.out.println(generator.generatePass());
        // System.out.println(first);
        // generator.getRandomWord(first);
        // System.out.println(second);
        // System.out.println(second);
        // generator.randomizedArray(second.size());
        
        // System.out.println(generator.randomizedArray(second));
        ArrayList<String> shuffled = generator.randomizedArray(second.size());
        System.out.println(shuffled);
    }
}