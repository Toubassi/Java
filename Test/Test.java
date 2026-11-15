package Test;
public class Test {
    public static void main(String[] args){
        // Print the capitals of Brazil and Croatia
        // Print the countries where Jerusalem and Abu Dhabi are the capitals
        // You will need to create an instance of 'Capitals'
        // Your code here
        // This should be your output
        /*
        What is the capital of Brazil?
        The capital of Brazil is Brasilia.
        Jerusalem is the capital of which country?
        Jerusalem is the capital of Palestine.
        What is the capital of Croatia?
        I don't know the capital of Croatia.
        Abu Dhabi is the capital of which country?
        I don't know that city.
        */
      Capitals myCapitals = new Capitals();
      System.out.println(myCapitals.getCountry("Brasilia"));
      myCapitals.getCapital("Brazil");
      myCapitals.getCapital("Croatia");
      System.out.println(myCapitals);
      System.out.println(myCapitals.getCountry("Abu Dhabi"));


    }
  }