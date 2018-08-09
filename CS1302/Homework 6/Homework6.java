// Amadou Bah
// Homework 6
// CSC 1302

/* Instructions:
  1. Define a class named Homework6
  
  2. This class must be a java program

  3. Write a method reverse that reverses the 
  order of the elements in an ArrayList of strings.
  Your list must have at least 10 strings.
  Example: [John, Amy, Stuart] -> [Stuart, Amy, John]
  
  4. Write a method capitalizeStrings that 
  accepts an ArrayList of strings and 
  replaces every word ending with an "s" with its uppercase version
  of that string. Your list must have at least 10 elements and at least
  4 plural words. Example: [Johns, Amy, Stuart] -> [JOHNS, Amy, Stuart]
  
  5.Write a method modifyPlurals that accepts an ArrayList 
  of strings, find plurals words, and adds the non-plural version of that word
  at the plural index. Do not repeat modification of the plural again; be sure
  that you don't get caught in an infinite loop.
  Example: [Johns, Amy, Stuart] -> [John, Johns, Amy, Stuart] */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;

public class Homework6{
   public static void main(String [] args)throws FileNotFoundException{
      //creating a scanner to read textfile
//       Scanner getNames = new Scanner (new File("myNames.txt"));
//       //creating a new arraylist to add strings from text file
//       ArrayList<String> myNames = new ArrayList<String>();
//       //populating the arraylist
//       while(getNames.hasNextLine()){
//          myNames.add(getNames.nextLine());
//       }
//      // Playing with lists
//       List<String> Cut = myNames.subList(0,3);
//       System.out.println(Cut.toString());
      // Playying with arrays.
      // This is not part of the homwork!!
//       int [] a = {1,2,3,4,5};
//       Object [] b = new Object[3];
//       b[0] = 2;
//       b[2] = 21;
//       b[1] = "kiss";
//       System.out.println(Arrays.toString(b));
//       System.out.println(b[1]);
// 
//       System.out.println(Arrays.toString(a));
      // THis is where playtime ended.
     //  System.out.println("This is the original Array: ");
//       System.out.println(myNames.toString());
//       
//       System.out.println("-------------------------------------------------");
//       
//       System.out.println(" ");
//       System.out.println("The reverse of the array: "); 
//       reverse(myNames);  
//       
//       System.out.println("-------------------------------------------------");
//       
//       System.out.println(" "); 
//       System.out.println("The Uppercase of the plurals is: ");
//       capitalizeStrings(myNames); 
//       
//       System.out.println("-------------------------------------------------");
//       
//       System.out.println(" "); 
//       System.out.println("After replacing plurals, we have: ");
//       modifyPlurals(myNames);
//       
//       System.out.println("-------------------------------------------------"); 
String bah = "Amadou";
System.out.println(bah.substring(1,5));
   }
//-----------------------------------------------------------
   //this method will reverse the string
   public static void reverse(ArrayList<String> myNames){
      int count = myNames.size()-1;
      //creating a new arraylist to add modified entries from the old
      ArrayList<String> myNames1 = new ArrayList<String>();
      //populating the new arraylist
      for(int i = count; i>= 0;i--){
         myNames1.add(myNames.get(i));
      }
      System.out.println(myNames1.toString());
   }
//------------------------------------------------------------
   //this method will capitalize plural strings
   public static void capitalizeStrings(ArrayList<String> myNames){
      //creating a new arraylist
      ArrayList<String> myNames1 = new ArrayList<String>();
      int count = myNames.size();
      //checking for plural and populating new arraylist
      for(int i = 0; i < count;i++){
         String temp = myNames.get(i);
         int s = temp.length()-1;
         if(temp.charAt(s)== 's'){
            //setting plural strings to uppercase
            temp = temp.toUpperCase();  
         }
         myNames1.add(temp);
      }
      System.out.println(myNames1.toString());
      
   }
//------------------------------------------------------------
   //this method will modify plurals and add the new word before is plural form
   public static void modifyPlurals(ArrayList<String> myNames){
      //creating a new arraylist
      ArrayList<String> myNames1 = new ArrayList<String>();
      int count = myNames.size();
      //populating the new array and checking if plural words are present 
      for(int i = 0; i <= count-1;i++){
         String temp = myNames.get(i);
         int s = temp.length();
         //checking if the string is plural
         if(temp.charAt(s-1)== 's'){
            //removing the "s" from the end of a plural word
            String cut = temp.substring(0,s-1); 
            //placing the shortened string into the arraylist
            myNames1.add(cut);
         }
         myNames1.add(temp);
      }
      System.out.println(myNames1.toString());
   }



}