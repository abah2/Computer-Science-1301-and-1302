/*
   author:Amadou Bah
   project 8: learn how to process files.
   penalities: 100 points off for copying someone's code.
   
   Write a progam that prompts the user for an input and output file names.
   Wriet the following methods:
      public static int processSum(String myInputFileName)  throws FileNotFoundException
      public static int processProduct(String myInputFileName)  throws FileNotFoundException
      public static double processAverage(String myInputFileName)  throws FileNotFoundException
      public static int processMin(String myInputFileName) throws FileNotFoundException 
      public static int processMax(String myInputFileName) throws FileNotFoundException 
      public static void writeToOutputFile(String myOutputFileName, 
      int sum, double average, int product, int max, int min) throws FileNotFoundException 

   Assume that the input file is called myInput.txt that has the following contents:
      30 10 20
   Your program will write the sum, count, averages, maximum and minimum to an output file called myOutput.txt.
   After the execution of your program, myOutput.txt should contain:
                  Sum is 60
                  Average is 20.0
                  Product is 6000
                  Max is 30
                  Min is 10
*/

import java.util.*;
import java.io.*;
public class Proj8
{

   // read the numbers in the input file and return the sum of numbers 
   public static int processSum(String myInputFileName)  throws FileNotFoundException 
   {
      Scanner input = new Scanner(new File(myInputFileName));
      int sum = 0;
      int count = 0;
   
      while(input.hasNextInt())
      {
         sum += input.nextInt();
      }
      
         
      input.close();
   
      return sum;
   }
   /*read the numbers in the input file and returns the product of numbers*/
   public static int processProduct(String myInputFileName)  throws FileNotFoundException 
   {
      Scanner input = new Scanner(new File(myInputFileName));
      int product = 1;
      int count = 0;
      while(input.hasNextInt())
      {
         product *= input.nextInt();
         count++;
      }     
      input.close();
      return product;
   }
   
   /*read the numbers in the input file and resturn the average of numbers*/
   public static double processAverage(String myInputFileName)  throws FileNotFoundException 
   {
      Scanner input = new Scanner(new File(myInputFileName));
      int sum = 0;
      int count = 0;
      double average = 0.0;
      
      while (input.hasNextInt())
      {
         sum += input.nextInt();
         count++;
      }
      
      average = (double)sum / (double)count;   
      input.close();
   
      return average;
   }
   /*read the numbers in the input file and return the maximum of the numbers*/
   public static int processMax(String myInputFileName) throws FileNotFoundException 
   {
      Scanner input = new Scanner(new File(myInputFileName));
      int max = -9999;
      int num = 0;
      while(input.hasNextInt())
      {
         num = input.nextInt();
         if(num > max) {
            max = num;
         }
      }        
      input.close();
   
      return max;
   }   
   /*read the numbers in the input file and return the minmum of the numbers*/
   public static int processMin(String myInputFileName) throws FileNotFoundException 
   {
      Scanner input = new Scanner(new File(myInputFileName));
      int min = 9999;
      int num = 0;
      
      while(input.hasNextInt())
      {
         num = input.nextInt();
         if(num < min){
            min = num;
         }
      }
       
      input.close();
   
      return min;
   }    
   /*write the answers to the output file */
   public static void writeToOutputFile(String myOutputFileName, 
      int sum, double average, int product, int max, int min) throws FileNotFoundException 
   {
      PrintStream output = new PrintStream(new File(myOutputFileName));
   
      output.println("Sum is " + sum);  
      output.println("Average is " + average);    
      output.println("Product is " + product);
      output.println("Max is " + max);
      output.println("Min is " + min);
      output.close();
   }
   public static void main(String[] a) throws FileNotFoundException 
   {
   
      Scanner console = new Scanner(System.in);
   
      System.out.println("1. name: Amadou Bah");
      System.out.println("2. project: 8");
      System.out.print("3. Enter the input file name: ");      
      String myInputFileName = console.next();
      
      System.out.print("4. Enter the output file name: ");    
      String myOutputFileName = console.next();
   
      int sum = processSum(myInputFileName);
      
      double average = processAverage(myInputFileName);
   
      int product = processProduct(myInputFileName); //multiply the numbers in the input file.      
   
      int max = processMax(myInputFileName);
      
      int min = processMin(myInputFileName);
      
      writeToOutputFile(myOutputFileName, sum, average, product, max, min);
   }
}