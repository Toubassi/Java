import java.util.Random;
import java.util.ArrayList;

public class PuzzleJava {
  Random randMachine = new Random();
      public ArrayList<Integer> getTenRolls(){
          ArrayList<Integer> randomRolls = new ArrayList<Integer>();
          for (int i = 0; i < 10; i++){
          randomRolls.add(randMachine.nextInt(21));
          }
          return randomRolls;
        }

      public String getRandomLetter(){
        char[] alphabets = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        int result = randMachine.nextInt(alphabets.length);
        return String.valueOf(alphabets[result]);  
      }
      
      public String generatePass(){
        String randomPass = new String();
        for (int i = 0; i < 8; i++){
          randomPass += getRandomLetter();
        }
        return randomPass;
      }

      public ArrayList<String> getNewPass(int length){
        // get (length) random words
        ArrayList<String> randWords = new ArrayList<String>();
        for (int i = 0; i < length; i++){
          randWords.add(generatePass());

        };
        return randWords;
      }

      public void getRandomWord(ArrayList<String> list) {
        ArrayList<ArrayList<String>> words = new ArrayList<>();
        words.add(getNewPass(8));
        int index = randMachine.nextInt(words.size());

        System.out.println("New random password: " + list.get(index));
        
        
      }

      public ArrayList<String> randomizedArray(int length){
        ArrayList<String> randomized = getNewPass(length);
        for (int i = 0; i < randomized.size(); i++){
          int index = randMachine.nextInt(randomized.size());
          String temp = randomized.get(i);
          randomized.set(i, randomized.get(index));
          randomized.set(index, temp);
          System.out.println(randomized);
        }
        return randomized;
      }
}
