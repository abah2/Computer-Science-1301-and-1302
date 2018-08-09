// Amadou Bah
// Homework 7
// CSC 1302
import java.util.*;
import java.io.*;
import java.lang.*;
//the class
public class Homework7{
   //initiallizing global variables
   public static int count = 0; 
   public static int count2 = 0;
   public static long count3 = 0;
   //------------------------------------------------------------------
   //main method
   public static void main(String [] args) throws FileNotFoundException{
      Scanner values = new Scanner (new File("values.txt"));
      Scanner values2 = new Scanner (new File("valuestoAdd.txt"));    
      //calling the countPos Method
      int tot = countPos(values); 
      System.out.println(tot);
      //calling the add Method
      int tot2 = add(values2); 
      System.out.println(tot2);
      //calling the power Method
      long tot3 = power(3,5); 
      System.out.println(tot3);
   }
   //------------------------------------------------------------------
   //countPos method
   public static int countPos(Scanner values){
      if(values.hasNextInt()){
         int temp = values.nextInt(); 
         if(temp > 0){
            count  = count + 1; 
            //the recursive part
            countPos(values);
         } 
         return count;
      } 
      else{
         return count;
      }
   }
   //------------------------------------------------------------------
   //add method
   public static int add(Scanner values){
      if(values.hasNextInt()){
         int temp = values.nextInt();
         count2 = count2 + temp;
         //the recursive part
         add(values); 
      }
      return count2;
   }
   //------------------------------------------------------------------
   //power method
   public static long power(int x,int n){
      if(n==0){
         return 1; 
      }
      else{
         n = n-1;
         //the recursive part
         count3 = x * power(x,n);           
         return count3;
      }
   }
}









