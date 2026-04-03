package PrimeNumber;
public class Prime2 {
   public static void main(String[] args) {

        long startTime=System.currentTimeMillis();
        int n=20;

        for(int i=1;i<n;i++){
            isPrime(i);
            
        }
        long endTime=System.currentTimeMillis();
        Long timetaken=endTime-startTime;
        System.out.println(timetaken);
   } 
   static String isPrime(int n){
        if(n<=1){
            return "not prime";
        }
        int c=2;
        while(c*c<=n){
            if(n%c==0){
                return "not prime";
            }
            c++;
        }
        return "prime";
   }
}
