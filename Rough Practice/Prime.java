public class Prime{
    public static void main(String[] args){
        System.out.println(isPrime(17));
    }
    public static String isPrime(int n){
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