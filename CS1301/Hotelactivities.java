import java.io.*;
import java.util;
public class Hotelactivities{
public static void main(String args[]){
      double conference = computeconference(txtfile);
      double lodging = computelodging(txtfile);
      double dinner = computedinner(txtfile);
      double spa = computespa(txtfile);
      double room = computeroom(txtfile);
      
      outputFile(printfile, dinner, lodging, conference, room, spa);
		
   }
  
   public static double computelodging(String s) 
   throws FileNotFoundException
   {
      Scanner openfile = new Scanner(new File (s));
      double conference = 0;
      double lodging = 0;
      double dinner = 0;
      double spa = 0;
      double room = 0;
   
   
      while (openfile.hasNextLine())	
      {
         Scanner lnScan = new Scanner(openfile.nextLine());
         lnScan.useDelimiter(";");
         String name = lnScan.next();
         String activity = lnScan.next();
         double cost = lnScan.nextDouble();
         
         if(activity.equals("Conference")){
            conference += cost;
         }
         else if (activity.equals("Lodging")){
            lodging += cost;
         }
         else if (activity.equals("Dinner")){
            dinner += cost;
         }
         else if (activity.equals("Spa")){
           spa += cost;
         }
         else if (activity.equals("Room Service")){
            room += cost;
         }
         		
      }
      openfile.close();
     
      return lodging;
   }
   public static double computeconference(String s) 
   throws FileNotFoundException
   {
      Scanner openfile = new Scanner(new File (s));
      double conference = 0;
      double lodging = 0;
      double dinner = 0;
      double spa = 0;
      double room = 0;
   
   
      while (openfile.hasNextLine())	
      {
         Scanner lnScan = new Scanner(openfile.nextLine());
         lnScan.useDelimiter(";");
         String name = lnScan.next();
         String activity = lnScan.next();
         double cost = lnScan.nextDouble();
         
         if(activity.equals("Conference")){
            conference += cost;
         }
         else if (activity.equals("Lodging")){
            lodging += cost;
         }
         else if (activity.equals("Dinner")){
            dinner += cost;
         }
         else if (activity.equals("Spa")){
           spa += cost;
         }
         else if (activity.equals("Room Service")){
            room += cost;
         }
         		
      }
      openfile.close();
      return conference;
   }

public static double computedinner(String s) 
   throws FileNotFoundException
   {
      Scanner openfile = new Scanner(new File (s));
      double conference = 0;
      double lodging = 0;
      double dinner = 0;
      double spa = 0;
      double room = 0;
   
   
      while (openfile.hasNextLine())	
      {
         Scanner lnScan = new Scanner(openfile.nextLine());
         lnScan.useDelimiter(";");
         String name = lnScan.next();
         String activity = lnScan.next();
         double cost = lnScan.nextDouble();
         
         if(activity.equals("Conference")){
            conference += cost;
         }
         else if (activity.equals("Lodging")){
            lodging += cost;
         }
         else if (activity.equals("Dinner")){
            dinner += cost;
         }
         else if (activity.equals("Spa")){
           spa += cost;
         }
         else if (activity.equals("Room Service")){
            room += cost;
         }
         		
      }
      openfile.close();
     
      return dinner;
   }
public static double computespa(String s) 
   throws FileNotFoundException
   {
      Scanner openfile = new Scanner(new File (s));
      double conference = 0;
      double lodging = 0;
      double dinner = 0;
      double spa = 0;
      double room = 0;
   
   
      while (openfile.hasNextLine())	
      {
         Scanner lnScan = new Scanner(openfile.nextLine());
         lnScan.useDelimiter(";");
         String name = lnScan.next();
         String activity = lnScan.next();
         double cost = lnScan.nextDouble();
         
         if(activity.equals("Conference")){
            conference += cost;
         }
         else if (activity.equals("Lodging")){
            lodging += cost;
         }
         else if (activity.equals("Dinner")){
            dinner += cost;
         }
         else if (activity.equals("Spa")){
           spa += cost;
         }
         else if (activity.equals("Room Service")){
            room += cost;
         }
         		
      }
      openfile.close();
     
      return spa;
   }
public static double computeroom(String s) 
   throws FileNotFoundException
   {
      Scanner openfile = new Scanner(new File (s));
      double conference = 0;
      double lodging = 0;
      double dinner = 0;
      double spa = 0;
      double room = 0;
   
   
      while (openfile.hasNextLine())	
      {
         Scanner lnScan = new Scanner(openfile.nextLine());
         lnScan.useDelimiter(";");
         String name = lnScan.next();
         String activity = lnScan.next();
         double cost = lnScan.nextDouble();
         
         if(activity.equals("Conference")){
            conference += cost;
         }
         else if (activity.equals("Lodging")){
            lodging += cost;
         }
         else if (activity.equals("Dinner")){
            dinner += cost;
         }
         else if (activity.equals("Spa")){
           spa += cost;
         }
         else if (activity.equals("Room Service")){
            room += cost;
         }
         		
      }
      openfile.close();
      return room;
   }

   public static void outputFile(String printfile,double dinner, double lodging, double conference, double room, double spa) 
      throws FileNotFoundException 
   {  
      PrintStream output = new PrintStream(new File(printfile));
   
      output.printf("Dinner Expense: %2.2f ", dinner);
      output.println();  
      output.printf("Lodging Expense: %2.2f ", lodging); 
      output.println();    
      output.printf("Conference Expense: %2.2f ", conference);
      output.println();
      output.printf("Room Service Expense: %2.2f ", room);
      output.println();
      output.printf("Spa Expense: %2.2f ", spa);
      output.println();
      output.close();
   }

}


