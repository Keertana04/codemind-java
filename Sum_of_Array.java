import java.util.*;
public class S{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] intArray = new int[n];
        for (int i =0 ;i<n;i++){
            intArray[i]=sc.nextInt();
        }
        int sum = 0;
        for(int a:intArray){
            sum+= a;
        }
        System.out.println(sum);
    }
}