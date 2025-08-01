import java.util.Scanner;
public class profitloss{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the selling price:");
        int sp=sc.nextInt();
          System.out.print("enter the cost price:");
        int cp=sc.nextInt();
        if(sp>cp){
            System.out.print("made a profit");
            int profit=sp-cp;
            System.out.println("made a profit of: "+profit);
        }
        else{
            System.out.println("incurred loss");
             int loss=cp-sp;
            System.out.println("made a loss of: "+loss);
        }
        
    }
}