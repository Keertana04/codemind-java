import java.util.Scanner;
public class Div{
    public static void main(String args[]){
        int n1,n2,d;
        Scanner sc = new Scanner(System.in);
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        sc.close();
        d = n1 / n2;
        System.out.println(+d);
    }
}