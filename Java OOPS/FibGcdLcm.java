public class FibGcdLcm{
    public static void main(String[] args) {
        
    }
    public static int lcm(int a,int b){
        return (a*b)/gcd(a,b);
    }
    public static int gcd(int a,int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }

    public static void fibanocci(int n){
        int first=0;
        int second=1;
        for(int i=3;i<=n;i++){
            System.out.println(first);
            int next=first+second;
            first=second;
            second=next;

        }
    }
}