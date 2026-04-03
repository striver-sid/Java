package PrimeNumber;
public class SieveOfErasthosnis{
    public static void main(String[] args) {
        PrimeRange(10,50);
    }
    public static boolean isPrime(int n){
        int c=2;
        while(c*c<=n){
            if(n%c==0){
                return false;   
            }
            c++;
        }
        return true;
    
    }
    public static void PrimeRange(int start,int end){
        for(int i=start;i<end;i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }

    }
}