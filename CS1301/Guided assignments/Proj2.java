 /*
 author; amadou
 Project: 2
 purpose: use int, char, double, boolean
 */
 public class Proj2{
 	public static void main(String args[]){
  		System.out.println("1.Name: Amadou Bah");
  		System.out.println("2.Project 2");
		//1. write an int variable called age
		int age;
		
		//2. assign 20 to age variable
		age = 20;
		
		//3. create an integer variable called id and assign 10
		// to it
		int id=10;
		
		//4. ouput the result of deviding ahes by 3
		int result = age/3;
		System.out.println("3.result = " + result);
		//5. System.out ,println(4/3). ==answer:1
		
		//6. how to cast an int to a double
		double result2 = (double)age/3;
		System.out.println("4.result2 = " + result2);
		
		//7. hot to use cast
		double result3 = age /3.0;
		System.out.println("5.result = " + result3);
		
		//8. write a code to find quotient
		int num1=7, num2=2;
		int quotient= num1/num2;
		System.out.println("6.quotient = "+ quotient);
		
		//9. write the code find remainder
		int remainder = num1 % num2;
		System.out.println("7.remainder = " +remainder);
		//10. System.out.println(num1+num2); ans:9
		//11. System.out.println((num1+num2)%num1); ans:2
		//System.out.println((num1+num2)%num1); ans:2
		//12. int x = 3.4; System.out.println(x); ans:3
		//13. double y=3.4; System.out.println(y); ans:3.4
		//14. create a char variable called it
		char myInitial = 'a';
		//15. is it correct? char w = "x"; ans: error
		//16. create a boolean called isDone and set it to false
		boolean isDone = false;
		//17. create a boolean called isFinish and set it to true
		boolean isFinish = true;
		/* 18. which is the right way to declare a gpa 3.5?
				a. int gpa = 3.5;
				b. double gpa = 3.5;
				c. char gpa = '3.5';
				d boolean gpa = 3.5;
		
		ans: b
		*/
		/* 19. is the following correct?
			int w = 3
			
			ans: No. Because ";" is missing
		*/
		/* 20. Is it correct?
			int abc - 10;
			System.out.println("abc=" abc);
			
			ans: NO. A "+" appendix sign is missing
			System.out.println("abc="+abc);
		*/	
		/* what is the output/
			int xyz = 10;
			System.out.println("xyz="+"xyz");
			ans:xyz=xyz
			System.out.println("xyz="+xyz);
			ans:xyz=10
		*/
		
 	}

 }