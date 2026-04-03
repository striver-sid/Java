import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int a=scan.nextInt();
        for(int i=1;i<11;i++){
            System.out.println(a+"*"+i+"="+a*i);

        }
        scan.close();
        
    }
}
