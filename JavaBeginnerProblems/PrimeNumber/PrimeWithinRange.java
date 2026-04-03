package PrimeNumber;
import java.util.Scanner;

public class PrimeWithinRange{
    public static void main(String[] args) {
        int n;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number : ");
        n=scan.nextInt();
        for(int i=2;i<n;i++){
            if(isPrime(i)){
                
                System.out.print(i+" ");
            }
            
        }
        scan.close();
    }
    public static boolean isPrime(int n){
        if(n<=1) return false;
        int c=2;
        while(c*c<=n){
            if(n%c==0){
                return false;
            }
            c++;
        }
        return true;
    }
}