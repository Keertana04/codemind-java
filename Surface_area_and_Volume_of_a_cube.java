import java.util.Scanner;
public class P{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        sc.close();
        int s = 6*(int)(Math.pow(a,2));
        int v = (int)Math.pow(a,3);
        System.out.printf("Surface area = %d and Volume = %d",s,v);
    }
}