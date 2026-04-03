import java.util.Scanner;

public class multiplication{
    public static void main(String[] args) {
        int n;
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter n : ");
        n=scan.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(i+"*"+n+"="+i*n);
        }
        scan.close();

    }
}