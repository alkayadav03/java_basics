import java.util.Scanner;
public class AP_problem2{
    public static void main(String[] args){
         Scanner sc=new Scanner(System.in);
        System.out.print("enter the number of terms");
        int n=sc.nextInt();
        for(int i=4;i<=(3*n-1);i=i+2){
            System.out.print(i+" ");
        }
    }
}