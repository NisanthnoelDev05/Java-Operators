import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int n=a%10;
        int m=a/100;
        System.out.println(m+" "+n);
    }
}
