import java.util.*;
public class T{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int i = sc.nextInt();
        sc.close();
        int h = i/3600;
        int m = (i-h*3600)/60; 
        int s = (i-h*3600-m*60);
        System.out.printf("H:M:S-%d:%d:%d",h,m,s);
    }
}