import java.util.Scanner;
public class is_square{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the length: ");
        int l=sc.nextInt();
        System.out.print("enter the breadth: ");
        int b=sc.nextInt();
        if(l==b){
            System.out.println("it is a square");
        }
        else{
             System.out.println("not a square");
        }
    }
}