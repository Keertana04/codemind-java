import java.util.Scanner;
public class A{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int b = sc.nextInt();
        int h = sc.nextInt();
        sc.close();
        double a = 0.5*b*h;
        System.out.printf("%.0f",a);
    }
}
