import java.util.Scanner;
public class composite{
    public static void main(String[] args){
                 Scanner sc=new Scanner(System.in);
        System.out.print("enter the number ");
        int n=sc.nextInt();
        boolean flag=false;
        for(int i=2;i<n;i++){
            if(n%i==0){
                flag=true;
                break;
            }
        }
        if(n==1){
            System.out.print("neither prime nor composite");
        }
        else if(flag==false){
            System.out.print("prime number");
        }
        else{
            System.out.print("composite number");
        }
    }
}