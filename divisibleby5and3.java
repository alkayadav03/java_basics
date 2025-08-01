import java.util.Scanner;
public class divisibleby5and3{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number to check divisibility");
        int n=sc.nextInt();
        if(n%5==0 && n%3==0){
             System.out.print("divisible by 5 and 3 both");
        }
        else{
            System.out.print("not divisible by 5 and 3 both");
        }
    }
}