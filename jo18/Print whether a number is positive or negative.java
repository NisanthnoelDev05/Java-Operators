import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a>0){
            System.out.println("positive");
        }
        if(a<0){
            System.out.println("negative");
        }
    }
}
