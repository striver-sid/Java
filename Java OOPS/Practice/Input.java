import java.util.Scanner;
public class Input{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        float f=3.5f;
        System.out.println(f);
        int a=0;
        double c;
        String b;
        System.out.print("Enter the integer value : ");
        a=scan.nextInt();
        scan.nextLine();
        System.out.print("Enter the String value : ");
        b=scan.nextLine();
        System.out.print("Enter the double value : ");
        c=scan.nextDouble();
        float d;
        System.out.print("double value :");
        d=scan.nextFloat();
        System.out.println(a +"\n"+b+"\n"+c+"\n"+d);
        scan.close();
    }
}