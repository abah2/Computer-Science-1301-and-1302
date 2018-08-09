/*
author:Amadou Bah
project: 5
purpose: page 137. Chapter 3. Write methods with/without parameters and return values.
*/
public class Proj5
{
  //3. Declare a final integer constant called REPETITION and initialized it with 5
  public static final int REPETITION = 5;
  //4a. Write a method called printStuff that takes no parameters and return no values and
  //   print the symbol * REPETITION times. 
  public static void printStuff(){
  	for(int i=1 ; i <=REPETITION ; i++){
  		System.out.print("*");
	}
  }
  //5a. Write a method called printStar that accepts a String and 
  // a number of repetitions as parameters and prints that String the given number of times
  // with a space after each time. For example, the call printStuff("ab", 3); will print
  // ab ab ab
  public static void printStuff(String s,int t){
 	for ( int i=1; i<=t; i++){
 		System.out.print(s+ " ");
	} 
  }
  //6a. Write a method called min that takes three integers as parameters and 
  //    return the smallest of the three values.
  // 4,2 and 7 will be passed in as parameters.
    public static int min(int x, int y, int z){
	  int myMin = Math.min(x,y);
	  myMin = Math.min(myMin,z);
	  return myMin;
	 }
  //7a. Write a method called computeSquareArea that takes an int representing
  //    the width of a square and return the area of a square. 
  public static int computeSquareArea(int side){
  		return(side*side);
  }
  //11a. Write a method called max that takes three integers as parameters and 
  //    return the largest of the three values. 
  public static int max(int x, int y, int z){
	  return(Math.max(Math.max(x,y),z));
	 }

  //The main Method 
  public static void main(String[] args)
  {
    System.out.println("1. name: Amadou Bah ");
    System.out.println("2. project: 5");
    //4b. call the printStuff method to print the symbol * REPETITION times:
	 System.out.print("3.");
	 printStuff();
    //5b. call the printStuff method to print xyz 5 times.
    System.out.println(" ");
	 System.out.print("4.");
	 String myStr = "xyz";
	 int myRep =5;
	 printStuff(myStr, myRep);
    //6b. call the min method to print the smallest of 4, 2, and 7.
	 int x=3, y=2, z=7;
	 int myMin = min(x,y,z);
	 System.out.print("\n5.");
	 System.out.print("min is " + myMin);

    //7b. call the computeSquareArea mehtod to print the area of a square that has a width of 5.
  	 int catcher = computeSquareArea(5);
	 System.out.println();
	 System.out.print("6.");
	 System.out.print("The area is " + catcher + ".");
    
    //8. Write a statment to print the square root of 25 with the decimal point.
	System.out.println();
	System.out.print("7.");
	System.out.println("The sqrt of 25 is " + Math.sqrt(25));
    
    //9. Write a statement to print the square root of 5 without the decimal point.
	System.out.print("8.");
	System.out.println("The sqrt of 25 is " + (int)Math.sqrt(25));
	
    //10. Write a statement to print the result of raising 3 to its 5th power.
   System.out.print("9.");
	System.out.println("3 raised to the 5th power is " + (int)Math.pow(3,5));

    //11b. call the max method to print the smallest of 4, 2, and 7.
	System.out.print("10.");
	System.out.println("The max is " + max(4,2,7));
  }
} 