import java.util.ArrayList;

public class Exceptions {
  public static void main(String[] args) {
    ArrayList<Object> list = new ArrayList<>();
    list.add("13");
    list.add("hello world");
    list.add(48);
    list.add("goodbye world");

    for(int x = 0; x < list.size(); x++) {
      try {
        Integer castedValue = (Integer) list.get(x);
        System.out.println(castedValue);
        }
      catch (ClassCastException err) {
        System.err.println("Error: There is an error in the following Index or Value");
        System.err.println("Index: " + x);
        System.err.println("Value: " + list.get(x));
        }


    //   if (list.get(x) instanceof Integer){
    //   Integer castedValue = (Integer) list.get(x);
    //   System.out.println(castedValue);
    // } else {
    //   if (list.get(x) instanceof String){
    //     System.err.println(list.get(x));
    //   };
    // }
    }
  }
}
