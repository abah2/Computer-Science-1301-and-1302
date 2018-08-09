/*
   author:Amadou Bah
   project 6: learn how to use Scanner object.
   10 points off for displaying your name.
   A sample of run the project 6 is:
   
1. name:Amadou
2. project: 6
3. Enter a name and numbers: John 3 90.5 89.7 76
3a. John's GPA is      85.40.
4. Enter a student record: NUM 4 1 2 3 4
4a. NUM's AVG is       3.00.

*/
import java.util.*;
public class Proj6
{

   /*you will complete it:
   write a method called printAVG that accepts a Scanner
   for the console as a parameter and calculates and print the average of a sequence of even integers.
   The user will type a line of input containing the name, the number of integers,
   and the integers. You must add 1 to the odd number. For example, if the input is 3, you must
   add 1 to 3 and include the 4 into the sum.
   For example,
   Enter a name, the number of integers and integers: GAME1 4 1 2 3 4
   The printAVG should print 3.0
   
   The reason is 3.0 because 1 becomes 2, and 3 becomes 4, so the sum is (2 + 2 + 4 + 4) that gives you 12.
   Then 12 / 4 that gives you the average 3.00
   
   if the result of ( number % 2 != 0) then it is an odd number.
   
   Use printf to display the results.
   
   */
   //write your code here:
    public static void printAVG(Scanner console)
   {
      double total = 0;
      System.out.print("4. Enter a name and numbers to calculate Average: ");
      String name = console.next();
      int numOfIntegers = console.nextInt();
      for(int i=1; i<=numOfIntegers; i++)
      {
         int num = console.nextInt();
         if(num % 2 != 0){
         num = num + 1;
         }
         total += num;
         
      }
      double ave = total / numOfIntegers;
      System.out.printf("4a. %s's GPA is %2.3f.", name, ave);
   }
   
   

   /*write a method called printGPA that accepts a Scanner
   for the console as a parameter and calculates and print a student's score average.
   The user will type a line of input containing the name, the number of scores,
   and the scores.
   GPA formula: (score 1 + score 2 + score 3)/3
   
   Use the printf to display the results.
   */
   public static void printGPA(Scanner console)
   {
      double totalScore = 0;
      System.out.print("3. Enter a name and numbers: ");
      String name = console.next();
      int numOfScore = console.nextInt();
      for(int i=1; i<=numOfScore; i++)
      {
         double num = console.nextDouble();
         totalScore += num;
      }
      double gpa = totalScore / numOfScore;
      System.out.printf("3a. %s's GPA is %2.3f.", name, gpa);
   }
   public static void main(String[] a)
   {
      System.out.println("1. name: Amadou Bah");
      System.out.println("2. project: 6");
      Scanner console = new Scanner(System.in);
      printGPA(console);
      System.out.println();
      //call your method here:
      printAVG(console);

           
   }
 }