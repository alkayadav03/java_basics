import java.util.Scanner;
public class absolutevalue{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number: ");
        int n=sc.nextInt();
        if(n<0){
            n=n*(-1);
        }
        System.out.print("the absolute value of given number is: "+n);
    }
}