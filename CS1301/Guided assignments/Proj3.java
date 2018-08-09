/* Author: amadou Bah
Project: proj3
Purpose: page 84, ++,+=, for loop */

   public class Proj3{
      public static void main(String args[]){
         System.out.println("1. name: Amadou Bah");
         System.out.println("2. Project: 3");
      // What is ++?
         int x = 6;
         x = x + 1;
         System.out.println("3. X = " +x);
         x++;
         System.out.println("4. x = " +x);
      //int w=10; w++; w++; System.out.println(w; ans: 12 
      //what is --?
         int y=8;
         y--;
         y--;
         y--;
         System.out.println("5. y = "+y);
      // What is +=?
         int r = 5;
         r +=3;
         System.out.println("6. r = "+r);
      // What is -=?
         int b = 4;
         b -= 6;
         System.out.println("7. b = "+b);
      // use for for loop to print *** four times
         System.out.println("8. for loop demo 1");
         for(int i = 1; i <=4; i++){
            System.out.println("***");
         }
      //use for loop to print1,2,3,4,5,
         System.out.println("9. for loop demo 2");
         for(int i = 1; i < 6; i++){
            System.out.print(i + ",");
         }	
      // use for loop to print 5,10,15,20,
         System.out.println("");
         System.out.println("10. for loop demo 3");
         for(int j = 5; j <= 20; j += 5 ){
            System.out.print(j + ",");
         }	
       // use for loop to print 2*4*6
         System.out.println("\n11. for loop demo 4");
         for ( int i = 2; i <=6; i += 2){
            System.out.print(i+"*");
         }
      // use for loop to print 5,4,3,2,1,
         System.out.println("\n12. for loop demo 5");
         for(int i = 5; i >= 1; i--){
            System.out.print(i+",");
         }
      //	use for loop to print 9_3_3_0_
         System.out.println("\n13. for loop demo 6");
         for(int i = 9; i >= 0; i-=3){
            System.out.print(i+"_");
         }
      // use for loop to sum up 2,3,4,and 5,
         System.out.println("\n14. for loop demo 7");
         int sum = 0;
         for(int i = 2; i <= 5; i++){
            sum += i;
         }
         System.out.print("sum = " + sum);
      // use for loop to sum up 3,6,9
      // use sum2 to store the sum
         System.out.println("\n15. for loop demo 8");
         int sum2 = 0;
         for(int i = 3; i <= 9; i+=3){
            sum2 += i;
         }
         System.out.println("sum = "+sum2);
      }
   }