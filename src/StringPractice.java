import java.util.ArrayList;
import java.util.Arrays;

public class StringPractice {
  public static void main(String[] args) {
    // Create a string with at least 5 characters and assign it to a variable
    String name = "Luke";

    // Find the length of the string
    System.out.println(name.length());

    // Concatenate (add) two strings together and reassign the result
    name += " Skywalker";
    System.out.println(name);

    // Find the value of the character at index 3
    System.out.println(name.charAt(3));

    // Check whether the string contains a given substring (i.e. does the string have "abc" in it?)
    System.out.println(name.contains("Sky"));

    // Iterate over the characters of the string, printing each one on a separate line
    for (int i = 0; i < name.length(); i++) {
      System.out.println(name.charAt(i));
    }

    // Create an ArrayList of Strings and assign it to a variable
    ArrayList<String> list = new ArrayList<>(Arrays.asList("Strawberry", "Banana", "Grape"));
    
    // Add multiple strings to the List (OK to do one-by-one)
    list.add("Pineapple");

    // Join all of the strings in the list together into a single string separated by commas
    // Use a built-in method to achieve this instead of using a loop
    String result = String.join(", ", list);
    System.out.println(result);

    // Check whether two strings are equal
    String a = "Lol";
    String b = "Lolo";
    System.out.println(a == b);

    /*
     * Reminder!
     * 
     * When comparing objects in Java we typically want to use .equals, NOT ==.
     * 
     * We use == when comparing primitives (e.g. int or char).
     */
  }
}
