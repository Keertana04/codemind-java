import java.util.*;
public class Days{
   public static void main(String[] args){
       Scanner sc = new Scanner (System.in);
       int d = sc.nextInt();
       sc.close();
       int y = d/365;
       int w = (d%365)/7;
       System.out.printf("%d
%d",y,w);
   } 
}
