import java.util.Scanner;
public class M{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        sc.close();
        double m = a*b;
        System.out.printf("%.2f",m);
    }
}