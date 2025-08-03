import java.util.Scanner;
public class checkaxis{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the points");
        int x=sc.nextInt();
         int y=sc.nextInt();
         if(x==0&&y==0){
            System.out.print("lies on origin");
         }
         else if (x==0){
            System.out.print("liesy axis");
         }
         else if(y==0){
            System.out.print("lies y axis");
         }
         else{
             System.out.print("not satisfying the conditions");
         }
    }
}