import java.util.Scanner;
public class checkyear_leapyear{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the year");
        int year=sc.nextInt();
        if(year%4==0){
            System.out.print("leap year");
        }
        else{
            System.out.print("not a leap year");
        }
    } 

}