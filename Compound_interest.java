import java.util.Scanner;
public class interest{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int p=sc.nextInt();
        int r=sc.nextInt();
        int t=sc.nextInt();
        sc.close();
        double c=p*(Math.pow(((1+r*1.0/100)),t));
        System.out.format("%.2f",c);
    }
}