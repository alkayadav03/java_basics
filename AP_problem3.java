import java.util.Scanner;
public class AP_problem3{
    public static void main(String[] args){
         Scanner sc=new Scanner(System.in);
        System.out.print("enter the number of terms");
        int n=sc.nextInt();
        int a=3,d=4;
        for(int i=1;i<=n;i++){
            System.out.print(a+" ");
            a=a+d;
        }
    }
}