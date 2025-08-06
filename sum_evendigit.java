import java.util.Scanner;
public class sum_evendigit{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the no.");
        int n=sc.nextInt();
        int sum=0;
        while(n!=0){
            int lastdigit=n%10;
            if(n%2==0){
                sum=sum+lastdigit;
            }
            n=n/10;
        }
        System.out.print(sum);

    }
}