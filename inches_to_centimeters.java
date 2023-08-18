import java.util.Scanner;
public class I{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        double i = 2.54 * c;
        System.out.printf("%.2f",i);
    }
}