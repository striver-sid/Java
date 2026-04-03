import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the number : ");
        
        int gcd=gcdfunction(12, 18);
        System.out.println("Gcd of the number is : "+ gcd);
        scan.close();
    }
    public static int gcdfunction(int a,int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
}
