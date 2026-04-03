package PrimeNumber;

public class Prime {
    public static void main(String[] args) {
        long startTime=System.currentTimeMillis();
        boolean isPrime=true;
        Integer n=20;
        for(int i=2;i<20;i++){
            if(n%i==0){
                isPrime=false;
                break;
            }
        }
        System.out.println((isPrime?"Prime":"NotPrime"));
        
        long endTime=System.currentTimeMillis();
        long execTime=endTime-startTime;
        System.out.println(execTime);

    }
}
