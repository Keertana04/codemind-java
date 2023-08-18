import java.util.*;
public class Capacity{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int b = sc.nextInt();
        int t = sc.nextInt();
        sc.close();
        int c = (2*s*b*t*512)/1024;
        System.out.printf("%d KB",c);
    }
}