/*
Document:
programmer: Amadou Bah
date: 1/24/2016
Project: project 1
Purpose: learn a. escape sequesnce
					b. print and println
					c. static method
*/
// The following code is my project1
public class Proj1{
/**
	Print Square
	parameter: none
	return:none
*/
	public static void printSquare(){
	System.out.println("\t __");
	System.out.println("\t|  |");
	System.out.println("\t --");
	}
	/** print ine line
	parameter: none
	return: none
	*/
	public static void printOneLine(){
	System.out.println(); // create empty line
	System.out.println("\t_\"_\'");
	System.out.println();
	}
	public static void main(String args[]){
	System.out.println("Amadou Bah");
	printSquare();
	printOneLine();
	printSquare();
	}
}