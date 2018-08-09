import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
import java.lang.Math;

public class Homework8{

   public static int k =0;
   
   public static void main(String[]args){
      Scanner console = new Scanner(System.in);
      Random r = new Random();
      System.out.println("Enter the size of the array (>100):");
      int size = console.nextInt();
      while(size <=100){
         System.out.println("That number is too small. Try again: ");
         size = console.nextInt();
      }
      int[] bah = {1,2,3,4,5};
      System.out.println(Arrays.toString(bah.shuffle()));
      
      int[] array1 = new int[size];
      for(int i = 0; i<size;i++){
         array1[i] = r.nextInt(100);
      }
      
      int[] array2 = new int[size];
      for(int i = 0; i<size;i++){
         array2[i] = r.nextInt(100);
      }
      //calling the SequentialSearch method
      System.out.println("------------------------------------------------------------------");
      long begin1_1 = System.currentTimeMillis();
      SequentialSearch(array1, 1);
      long end1_1 = System.currentTimeMillis();
      long runtime1_1 = end1_1-begin1_1;
      System.out.println("The runtime is: "+ runtime1_1 + "s");
      
      long begin1_50 = System.currentTimeMillis();
      SequentialSearch(array1, 50);
      long end1_50 = System.currentTimeMillis();
      long runtime1_50 = end1_50-begin1_50;
      System.out.println("The runtime is: "+ runtime1_50 + "s");
      
      long begin1_100 = System.currentTimeMillis();
      SequentialSearch(array2, 100);
      long end1_100 = System.currentTimeMillis();
      long runtime1_100 = end1_100-begin1_100;
      System.out.println("The runtime is: "+ runtime1_100 + "s");
      
      //calling the LoopSearch method
      System.out.println("------------------------------------------------------------------");
      long begin2_1 = System.currentTimeMillis();
      LoopSearch(array2, 1);
      long end2_1 = System.currentTimeMillis();
      long runtime2_1 = end2_1-begin2_1;
      System.out.println("The runtime is: "+ runtime2_1 + "s");
      
      long begin2_50 = System.currentTimeMillis();
      LoopSearch(array2, 50);
      long end2_50 = System.currentTimeMillis();
      long runtime2_50 = end2_50-begin2_50;
      System.out.println("The runtime is: "+ runtime2_50 + "s");
      
      long begin2_100 = System.currentTimeMillis();
      LoopSearch(array2, 100);
      long end2_100 = System.currentTimeMillis();
      long runtime2_100 = end2_100-begin2_100;
      System.out.println("The runtime is: "+ runtime2_100 + "s");
      
      //calling the BinarySearch method
      System.out.println("------------------------------------------------------------------");
      long begin3_1 = System.currentTimeMillis();
      BinarySearch(array2, 1);
      long end3_1 = System.currentTimeMillis();
      long runtime3_1 = end3_1-begin3_1;
      System.out.println("The runtime is: "+ runtime3_1 + "s");
      
      k=0;
      long begin3_50 = System.currentTimeMillis();
      BinarySearch(array2, 50);
      long end3_50 = System.currentTimeMillis();
      long runtime3_50 = end3_50-begin3_50;
      System.out.println("The runtime is: "+ runtime3_50 + "s");
      
      k=0;
      long begin3_100 = System.currentTimeMillis();
      BinarySearch(array2, 100);
      long end3_100 = System.currentTimeMillis();
      long runtime3_100 = end3_100-begin3_100;
      System.out.println("The runtime is: "+ runtime3_100 + "s");
   }
   //---------------------------------------------------------------------
   public static void SequentialSearch(int[] a, int b){
      int count = 0;
      for(int i = 0; i<=a.length-1;i++){
         if(a[i]==b){
            i+=a.length;
            System.out.println("Success!! " + b + " was foung in SequentialSearch.");
            count++;
         }
      }
      if (count == 0){
         System.out.println("Fail!! " + b + " was not foung in SequentialSearch");
      } 
   }
   //----------------------------------------------------------------------
   public static void LoopSearch(int[] a, int b){
     Arrays.sort(a);
      int size = a.length-1;
      if(size%2!=0){
      
         size = size + 1;
         
      }
      
      int n = 1;
      int k = 0;
      int i = size/2;
      int inc = size/(int)Math.pow(2,n);
      while(inc > 0){
         if(b < a[i]){
            n+= 1;
            inc = size/(int)Math.pow(2,n);
            if(inc == 0 && i!=0){
               inc+=1; 
            }
            i-= inc;
             
         }
         else if(b > a[i]){
            n+= 1;
            inc = size/(int)Math.pow(2,n);
            i+= inc;
         }
         else{
            k += 1;
            break;
         } 
      }
      if (k == 1){
         System.out.println("Sucess!! " + b + " was found in LoopSearch.");
      }
      else{
         System.out.println("Fail!! " + b + " was not found in LoopSearch");
      
      }
   }
    

   //----------------------------------------------------------------------
   public static void BinarySearch(int[] a, int b){
      Arrays.sort(a);
      int size = a.length-1;
      if(size%2!=0){
          size = size + 1; 
      }   
      int i = size/2;
      if(size>=1 && k==0){
         if(b<a[i]){
            a = Arrays.copyOfRange(a, 0,i);
            BinarySearch(a,b);
         } 
         else if(b>a[i]){
         
            a = Arrays.copyOfRange(a, i,size);
            BinarySearch(a,b);
         }
         else{ 
            if(b==a[i]){
               k=1;
               System.out.println("Sucess!! " + b + " was found in BinarySearch.");   
            }
         }
      }
      if(k==0){
        System.out.println("Fail!! " + b + " was not found in BinarySearch."); 
        k = 1;
      }
     
   }
}