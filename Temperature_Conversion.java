import java.util.Scanner;
public class Temp{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float c;
        c=sc.nextFloat();
        float t;
        t=32+((c*9)/5);
        System.out.format("%.2f",t);

    }
}