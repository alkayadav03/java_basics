import java.util.Scanner;
public class highestfactor{
    public static void main(String[] args){
                 Scanner sc=new Scanner(System.in);
        System.out.print("enter the number ");
        int n=sc.nextInt();


        
        //**** */ printing all its factors
        // for(int i=1;i<=n;i++){
        //     if(n%i==0){  //i is the factor of n 
        //         System.out.print(i+"  ");
        //     }
        // }




        //*** */ printing highest factor method 1 including itself
        // int hf=1;
        //  for(int i=1;i<=n;i++){
        //     if(n%i==0){  //i is the factor of n 
        //         hf=i;
        //     }
        //  }
     // System.out.print(hf+"  ");




                //**** */ printing highest factor excluding itself method 1
                // decrease the loop by 1 by replacing =
        //         int hf=1;
        //  for(int i=1;i<n;i++){
        //     if(n%i==0){  //i is the factor of n 
        //         hf=i;
        //     }
        //  }
        //         System.out.print(hf+"  ");




                // **** */ printing highest factor excluding itself method 2
                 int hf=1;
         for(int i=n-1;i>=1;i--){
            if(n%i==0){  //i is the factor of n 
                hf=i;
                break;
            }
            //   System.out.print(hf+"  ");
         }
                System.out.print(hf);
        }
}