// Amadou Bah
// Extra Credit Challenge 
// 10/05/2017

import java.util.Scanner;

public class BakeCookiesExtraCredit {
   
   /* Your program should be generic such that 
   given a number of cookies you can determine
   the number of batches and total time required
   as commented below.
   */
   
   
   public static void main(String[] args) {
      
      //Prompt the user for total number of cookies
      System.out.println("Enter the total number of coockies"); 
      Scanner bah = new Scanner (System.in);
      int numcook = bah.nextInt();
      System.out.println(" ");
      
      //1. Display the amount needed for each ingredient
      System.out.println("Mix the Following Ingredients");
      //cups of flour
      calcFlour(numcook);
      //number of butter
      calcButter(numcook);
      //cups of sugar
      calcSugar(numcook);
      //cups of eggs
      calcEggs(numcook);
      //pounds of chocolate chips
      calcChoco(numcook);
      System.out.println(" ");
      
      makeBatter();
      //Making batter takes 10 minutes
      double batterTime = 10;
      
      //2. Display the number of batches required for baking
      
      //bake cookies in batches of 10
      double numbatch = 10;
     
      //needs to be calculated based on number of cookies
      double temp = numcook/numbatch;
      double batches = Math.ceil(temp);
      System.out.printf("You will need %1.0f batches.\n",batches);
      System.out.println(" ");
   
      bakeCookies(batches);
      
      //3. Display the total time required to bake cookies
      double bakeTime = batches*10;
      System.out.printf("It will take %2.0f minutes to bake cookies \n",bakeTime);
      System.out.println(" ");
      frostCookies();
      //Frosting cookies takes 10 minutes
      double frostTime = 10;
      
      //4. Display the total time required in this process
      double totaltime = bakeTime + batterTime + frostTime;
      System.out.println(" ");
      System.out.printf("Total time for making all the cookies is %2.0f minutes.\n",totaltime);
      System.out.println("You're Done!!");
   }
   public static void calcFlour(int a){
      double num = a;
      double total = 20;
      double max = 4;
      double flour = Math.ceil((max*a)/total);
      if (flour > 1)
         System.out.println(flour + " cups of flour");
      else
         System.out.println(flour + " cup of flour");
   
   }
   public static void calcButter(int a){
      double num = a;
      double total = 20;
      double butter = Math.ceil(a/total);
      if (butter > 1)
         System.out.println(butter + " cups of butter");
      else
         System.out.println(butter + " cup of butter");
   }
   public static void calcSugar(int a){
      double num = a;
      double total = 20;
      double sugar = Math.ceil(a/total);
      if (sugar > 1)
         System.out.println(sugar + " cups of sugar");
      else
         System.out.println(sugar + " cup of sugar");
   
   }
   public static void calcEggs(int a){
      double num = a;
      double total = 20;
      double max = 2;
      double eggs = Math.ceil((max*a)/total);
      if(eggs > 1)
         System.out.println(eggs + " cups of eggs");
      else
         System.out.println(eggs + " cup of eggs");
   }
   public static void calcChoco(int a){
      double num = a;
      double total = 20;
      double max = 40;
      double choco = Math.ceil((max*a)/total);
      if (choco > 1)
         System.out.println(choco + " pounds of chocolate chips...");
      else
         System.out.println(choco + " pounds of chocolate chips...");
   }
  
   
   
   public static void makeBatter(){
      // Prepare cookie batter
      System.out.println("Mix the dry ingredients.");
      System.out.println("Cream the butter and sugar.");
      System.out.println("Beat in the eggs.");
      System.out.println("Stir in the dry ingredients.");
      System.out.println("Set the oven temperature.");
      System.out.println("--------------------------------");
   
   }
   
   public static void bakeCookies(double batches){
      // Bake the cookies
      while(batches>0){
         System.out.println("Set the timer.");
         System.out.println("Place a batch of cookies into the oven.");
         System.out.println("Allow the cookies to bake.");
         System.out.println("Remove batch of cookies from oven.");
         System.out.println("--------------------------------");
         batches--;
      }
   }
   
   public static void frostCookies(){
      // Frost the cookies
      System.out.println("Mix ingredients for frosting.");
      System.out.println("Spread frosting and sprinkles.");
   }
   
}
