import java.util.Scanner;
public class threedigitnumber{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number");
        int n=sc.nextInt();
        if(n>99 && n< 1000){
            System.out.print("this is a three digit number");
        }
        else{
             System.out.print("this is not a three digit number");
        }
    }
}