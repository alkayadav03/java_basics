import java.util.Scanner;
public class perimeterareagreater{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the lenght:");
        int l=sc.nextInt();
         System.out.print("enter the breadth:");
        int b=sc.nextInt();
        int area=l*b;
        int perimeter=2*(l+b);
        if(area>perimeter){
            System.out.print("area is greater than perimeter");
        }
       else if(area==perimeter){
              System.out.print("area is equal to perimeter");
        }
        else{
              System.out.print("perimeter is greater than area");
        }
    }
}