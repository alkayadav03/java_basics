import java.util.Scanner;
public class number_reverse_sum{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the no.");
        int n=sc.nextInt();
        int number=n;
        int r=0;
        while(n!=0){
            int lastdigit=n%10;
           r=r*10+lastdigit;
           n=n/10;
        }
         int sum=r+number;
        System.out.println("reverse:"+r);
        System.out.print("sum:"+sum);
    }
}