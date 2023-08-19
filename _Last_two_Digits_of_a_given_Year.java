import java.util.Scanner;
public class L{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        sc.close();
        int b=a%100;
        System.out.printf("%02d",b);
    }
}