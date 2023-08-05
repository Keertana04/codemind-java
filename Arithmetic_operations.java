import java.util.Scanner;
public class Arthimetic {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n1, n2, s, d, p, q, r;
        n1= sc.nextInt();
        n2= sc.nextInt();
        sc.close();
        s = n1 + n2;
        d = n1 - n2;
        p = n1 * n2;
        q = n1 / n2;
        r = n1 % n2;
        System.out.println("Sum:"+ s);
        System.out.println("Difference:"+ d);
        System.out.println("Product:"+ p);
        System.out.println("Quotient:"+ q);
        System.out.println("Remainder:"+ r);
       
    }
}