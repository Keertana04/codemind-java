import java.util.*;
public class S{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.printf("%d
%d",a,b);
    }
}