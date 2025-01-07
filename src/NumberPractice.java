public class NumberPractice {
  public static void main(String args[]) {
    // Create a float with a negative value and assign it to a variable
    double negative = -1.2;
    System.out.println(negative);

    // Create an int with a positive value and assign it to a variable
    int positive = 2;
    System.out.println(positive);

    // Use the modulo % operator to find the remainder when the int is divided by 3
    double modulo = 7 % 3;
    System.out.println("Remainder is " + modulo);

    // Use the modulo % operator to determine whether the number is even
    // (A number is even if it has a remainder of zero when divided by 2)
    // Use an if-else to print "Even" if the number is even and "Odd"
    // if the number is odd.
    int num = 4;
    if (num % 2 == 0) {
      System.out.println("Even");
    } else {
      System.out.println("Odd");
    }

    // Divide the number by another number using integer division
    System.out.println(num / positive);

    /*
     * Reminder!
     * 
     * When dividing ints, the result is rounded down.
     * Example: 
     * 7 / 3 = 2 when performing int division
     */

  }
}
