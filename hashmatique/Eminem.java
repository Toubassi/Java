import java.util.LinkedHashMap;
import java.util.Set;

public class Eminem {
  public static void main(String[] songs){

  LinkedHashMap<String, String> songsList = new LinkedHashMap<>();

  songsList.put("Mocking Bird", "Hush little baby");
  songsList.put("Lose Yourself", "If you had one shot");
  songsList.put("Slim Shady", "Please stand up");
  songsList.put("Without Me", "Guess who's back?");

  // System.out.println(songsList);
  System.out.println(songsList.get("Slim Shady"));

  Set<String> lyrics = songsList.keySet();
  for (String title : lyrics){
    System.out.println(title + " Contains these lyrics: " + songsList.get(title));
    }
  }
}
