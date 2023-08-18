import java.util.Scanner;
public class Can{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        sc.close();
        int c = (z-y)/x;
        System.out.println(c);
    }
}