import java.util.Scanner;
public class checkpointsofcircle{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
         System.out.print("enter x corrdinate:");
        int x=sc.nextInt();
        System.out.print("enter y corrdinate:");
        int y=sc.nextInt();
        System.out.print("enter radius:");
        int r=sc.nextInt();
       System.out.println("enter x and y corrdinate of point:");
        int x1=sc.nextInt();
        int y1=sc.nextInt();
        int distancesquared=(x-x1)*(x-x1)+(y-y1)*(y-y1);
        if( distancesquared>(r*r)){
            System.out.print("lies outside the circle");
        }
       else if( distancesquared<(r*r)){
            System.out.print("lies inside the circle");
        }
       else if( distancesquared==(r*r)){
            System.out.print("lies on the circle the circle");
        }
    }
}
        