import java.util.Scanner;
public class productofdigit{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number: " );
        int n=sc.nextInt();
        int product=1;
         while(n!=0){
            int lastdigit=n%10;
           product=product*lastdigit;
            n=n/10;
        }
         System.out.print(product);
    }
}