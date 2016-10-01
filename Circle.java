import java.util.*;

public class Circle {
   
   public static void main (String[] args) {
      double r = 0;
      int m = 0; 
      int c = 0;
      Scanner in = new Scanner(System.in);
      r = in.nextDouble();
      m = in.nextInt();
      c = in.nextInt();
      double area = Math.PI * Math.pow(r, 2);
      double areab = m;
      System.out.println(area + " " + areab);
   
   
   }  
}  
   