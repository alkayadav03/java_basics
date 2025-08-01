import java.util.Scanner;
public class youngerage{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the age of ram");
        int r=sc.nextInt();
         System.out.print("enter the age of shyam");
        int s=sc.nextInt();
         System.out.print("enter the age of priya");
        int p=sc.nextInt();
        if(r<s && r< p){
            System.out.print("ram is younger");
        }
        else if(s<r&&s<p){
             System.out.print("shyam is younger");
        }
        else{
             System.out.print("priya is younger");
        }
    }
}