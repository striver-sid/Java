import java.util.Scanner;

public class fibonocci {
    public static void main(String[] args) {
        int a=0;
        int b=1;
        int n;
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter n : " );
        n=scan.nextInt();
        System.out.print(a+" "+b+" ");
        for(int i=2;i<=n;i++){
            
            int next=a+b;
            System.out.print(" "+next);
            a=b;
            b=next;
        }
        scan.close();
    }
    
    //0 1 1 2 3 5 8 13 
}
