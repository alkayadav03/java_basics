import java.util.Scanner;
public class threepointsonline{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
       System.out.println("enter all the corrdinate of x:");
        int x1=sc.nextInt();
        int x2=sc.nextInt();
        int x3=sc.nextInt();
         System.out.println("enter all the corrdinate of y:");
        int y1=sc.nextInt();
        int y2=sc.nextInt();
        int y3=sc.nextInt();
        int m1=(y2-y1)/(x2-x1);
        int m2=(y3-y2)/(x3-x2);
        if(m1==m2){
            System.out.print("are in straight line");
            }
            else{
                System.out.print("NOT in straight line");
            }
    }
}