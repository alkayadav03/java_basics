import java.util.Scanner;
public class GP{
    public static void main(String[] args){
         Scanner sc=new Scanner(System.in);
        System.out.print("enter the number of terms");
        int n=sc.nextInt();
         System.out.print("enter the first term ");
        int a=sc.nextInt();
        System.out.print("enter the common ratio ");
        int r=sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.print(a+" ");
            a=a*r;
        }
    }
}