/*
   author: Amadou Bah
   project 7: learn how to use While loop.
   10 points off for displaying your name.
   A sample of run the project 7 is:
   
1. name: Amadou Bah
2. project: 7
3. compute even average:
Type a number: 1
Type a number: 2
Type a number: 3
Type a number: 4
Type a number: 5
Type a number: -1
Even numbers average is       3.00.
4. compute odd > 3 average:
Type a number: 1
Type a number: 2
Type a number: 3
Type a number: 4
Type a number: 5
Type a number: -1
Odd that is > 3 average is       5.00.

*/
import java.util.*;
public class Proj7
{

   /*write a method called printOddGreateThan3Avg that uses a sentinel loop to
   repeatedly prompt the user for numbers. Once the user types any number less than zero,
   the method should display the average of all odd numbers typed that is greater than 3. 
   You will skip the even numbers.
   Display the average as a double. Use printf to display the results.
   */
  public static void printOddAverage(Scanner console)
   {
      System.out.println("4. compute odd average:");
      System.out.print("Type a number: ");
      int x = console.nextInt();
      int sum = 0;
      int count = 0;
      while(x >= 0)
      {
        if(x % 2 != 0 && x >3)
        {
          sum += x;
          count++;
        }        
        System.out.print("Type a number: ");
        x = console.nextInt();
      }
      double oddAvg = sum / count;
      System.out.printf("Odd numbers average is %5.2f.", oddAvg);
   }

      

   /*write a method called printEvenAverage that uses a sentinel loop to
   repeatedly prompt the user for numbers. Once the user types any number less than zero,
   the method should display the average of all even numbers typed. You will skip the odd numbers.
   Display the average as a double. Use printf to display the results.
   */
   public static void printEvenAverage(Scanner console)
   {
      System.out.println("3. compute even average:");
      System.out.print("Type a number: ");
      int x = console.nextInt();
      int sum = 0;
      int count = 0;
      while(x > 0)
      {
        if(x % 2 == 0)
        {
          sum += x;
          count++;
        }        
        System.out.print("Type a number: ");
        x = console.nextInt();
      }
      double evenAvg = sum / count;
      System.out.printf("Even numbers average is %10.2f.", evenAvg);
   }
   public static void main(String[] a)
   {
      System.out.println("1. name: Amadou Bah");
      System.out.println("2. project: 7");
      Scanner console = new Scanner(System.in);
      printEvenAverage(console);
      System.out.println();
      printOddAverage(console);
		System.out.println();
		 
   }
 }