import java.util.Scanner;
public class Arrayc {	
 
   public static void main(String[] args)
   {
      int[]Grades =  new int[7];// creates an array for the Student Grades
      double[]SD = new double[7];// creates an array for the Student Standard deviations
      String [] listNames = {"Doc","Grumpy","Happy","Sleepy","Dopey", "Sneezy","Bashful"};
      enterScore(Grades,listNames);// call the enterScores method and gives it the arrays, Grade and ListNames, as Parameters
      double the_average = calcavg(Grades);// creates the_average and assign the return value for calcave
      calcStDev(the_average, Grades, SD);// call the enterScores method and gives it the arrays, Grade and SD, and the the_average as Parameters
      output(listNames, Grades,SD,the_average);// call the enterScores method and gives it the arrays, Grade,ListNames,& Sd, and the_average as Parameters
   
   
   }
 
   public static void enterScore(int[]Grades,String [] listNames)// created a method called enterscore which accepts 2 arrays as parameters
   { 
      Scanner input = new Scanner(System.in);
      for(int i=0; i < 7; i++)
      {
         System.out.print("Please enter " + listNames[i]+ "'s Score ");
         Grades[i]= input.nextInt();
      }
   
   } 
   public static double calcavg(int[]Grades)// created a method called calcavg which accepts 1 arrays as parameters
   
   { double sum = 0;
      for(int i =0; i < 7; i++) {
         sum = sum + Grades[i];
      
      }
      double Avg = sum/Grades.length;
      return Avg;
   }
   public static void calcStDev(double the_average, int [] Grades, double [] SD)/* created a method called calcStDev which accepts 2 arrays,
    and a double as parameters*/
   {
      for(int i=0; i < 7; i++) {
         SD[i]= Grades[i]- the_average;
      }
   }
   
   public static void output( String[]listNames,int[] Grades, double[]SD, double the_average)/* created a method called output which accepts 2 arrays,
    and a double as parameters*/
   
   {
      System.out.println();
      System.out.println("The average of the Score is " + the_average);
      System.out.println();
      System.out.printf("%-10.15s %-10.15s %1.15s","Name","Grade","Mean Deviation"); 
      System.out.println();
      for( int i =0; i < 7; i++){
         System.out.printf("%-10.15s %-10d (%1.0f)",listNames[i],Grades[i],SD[i]);
         System.out.println();
      }
   }
  
}


