import java.util.Scanner;
public class mo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String octalString = sc.nextLine();
        sc.close();
        //Convert Octal to decimal
        System.out.println(Integer.parseInt(octalString,8));
    }
}