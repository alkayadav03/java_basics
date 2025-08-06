import java.util.Scanner;
public class reverse_number{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the no.");
        int n=sc.nextInt();
        int r=0;
        while(n!=0){
            int lastdigit=n%10;
           r=r*10+lastdigit;
           n=n/10;
        }
        System.out.print(r);
    }
}