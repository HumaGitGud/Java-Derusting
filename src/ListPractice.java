import java.util.ArrayList;
import java.util.Collections;

public class ListPractice {
  public static void main(String[] args) {
    // Create an empty ArrayList of Strings and assign it to a variable of type List
    ArrayList<String> myList = new ArrayList<>();

    // Add 3 elements to the list (OK to do one-by-one)
    myList.add("Hello");
    myList.add("Oi");
    myList.add("Bonjour");

    // Print the element at index 1
    System.out.println(myList.get(1));

    // Replace the element at index 1 with a new value
    // (Do not insert a new value. The length of the list should not change)
    myList.set(1, "Hola");
    System.out.println(myList);

    // Insert a new element at index 0 (the length of the list will change)
    myList.add(0, "Konichiwa");
    System.out.println(myList);

    // Check whether the list contains a certain string
    System.out.println(myList.contains("Bonjour"));

    // Iterate over the list using a traditional for-loop.
    // Print each index and value on a separate line
    for (int i = 0; i < myList.size(); i++) {
      System.out.println(i + " - " + myList.get(i));
    }

    // Sort the list using the Collections library
    Collections.sort(myList);
    System.out.println(myList);

    // Iterate over the list using a for-each loop
    // Print each value on a second line
    for (String string : myList) {
      System.out.println(string + "\n");
    }

    /*
     * Usage tip!
     * 
     * Use a traditional for-loop when you need to use the index or you need to iterate in an
     * unconventional order (e.g. backwards)
     * 
     * Otherwise, if you're iterating the in the conventional order and don't need the
     * index values a for-each loop is cleaner.
     */
  }
}