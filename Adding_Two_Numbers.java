import java.util.Scanner;
public class AddTwo{
    public static void main(String args[]){
        int n1,n2,s;
        Scanner sc = new Scanner(System.in);
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        sc.close();
        s = n1 + n2;
        System.out.println(+s);
    }
}