import java.util.Scanner;
public class AP{
    public static void main(String[] args){
         Scanner sc=new Scanner(System.in);
        System.out.print("enter the number of terms");
        int n=sc.nextInt();
        for(int i=1;i<=(2*n-1);i=i+2){
            System.out.print(i+" ");
        }
    }
}