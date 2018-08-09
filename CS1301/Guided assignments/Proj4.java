/*
Author: Amadou Bah
Project: 4
Purpose: page 97, nested for loop
*/
   public class Proj4{
      public static void main(String args[]){
         System.out.println("1.Amadou Bah");
         System.out.println("2. project 4");
         System.out.println("3. single for loop review");
      // print***** in five rows
         for (int i=1; i<=5;i++){
            System.out.println("*****");
         }
         System.out.println("4. nested for loop to print ***** 5 times");
         for ( int i= 1; i<=5;i++){
            for(int j=1; j<=5; j++){
               System.out.print("*");
            }
            System.out.println();	
         }
         System.out.println("5. nested for loop for descending triangle");
         for ( int i= 1; i<=5;i++){
            for(int j=1; j<=i; j++){
               System.out.print("*");
            }
            System.out.println();
			}	
			System.out.println("6. nested for loop for ascending triangle");
         for ( int i= 5; i>=1;i--){
            for(int j=1; j<=i; j++){
               System.out.print("*");
            }
            System.out.println();
			}	
      }
   }