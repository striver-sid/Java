import java.util.Scanner;

public class Factorial{
    public static void main(String[] args) {
        System.out.print("Enter the number : ");
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int fact=factoialNumber(n);
        System.out.println("Fatctorial of "+n+" is "+fact);
        scan.close();
    }
    public static int factoialNumber(int  n){
        int result=n;
        for(int i=n-1;i>=2;i--){
            result=result*i;
        }

        return result;
    }
}