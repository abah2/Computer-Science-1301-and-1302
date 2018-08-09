public class Bday{

   public static void main (String [] args){
      int a =1;
      int j =1;
      for(int i = 1; i < 6; i++){
         for (int b = j; b< 6;b++){
            System.out.print("*");
         }
         for (int c = 0 ; c < a;c++){
            System.out.print(a);
         }
         for (int d = j ; d< 6;d++){
            System.out.print("*");
         }
         System.out.println(" ");
         a+=2;
         j=j+1;
      }
   }
}








