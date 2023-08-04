import java.util.Scanner;
public class Mod{
    public static void main(String args[]){
        int n1,n2,m;
        Scanner sc = new Scanner(System.in);
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        sc.close();
        m = n1 % n2;
        System.out.println(+m);
    }
}