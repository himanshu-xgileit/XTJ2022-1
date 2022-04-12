
import java.util.Scanner;
class NestedIf {
  public static void main(String[] args) {


// create an object of Scanner
Scanner input = new Scanner(System.in);

// take input from the user
System.out.println("Entern First Number : \n");
int n1 = input.nextInt();
System.out.println("Entern Second Number : \n");
int n2 = input.nextInt();
System.out.println("Entern Third Number : \n");
int n3 = input.nextInt();
int largest;
    // checks if n1 is greater than or equal to n2
    if (n1 >= n2) {

      // if...else statement inside the if block
      // checks if n1 is greater than or equal to n3
      if (n1 >= n3) {
        largest = n1;
      }

      else {
        largest = n3;
      }
    } else {

      // if..else statement inside else block
      // checks if n2 is greater than or equal to n3
      if (n2 >= n3) {
        largest = n2;
      }

      else {
        largest = n3;
      }
    }

    System.out.println("Largest Number: " + largest);
  }
}