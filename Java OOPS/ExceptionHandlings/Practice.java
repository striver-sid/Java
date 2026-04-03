package ExceptionHandlings;

import java.util.Scanner;

public class Practice {

    public static void HandleException(int n) throws ArithmeticException{
        int c=n/0;
        System.out.println(c);
    }


     public static void main(String[] args) {
        int n;
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the number : ");
        n=scan.nextInt();
        try{
            int c=n/0;
            System.out.println(c);
        }
        catch(Exception e){
            System.out.println(e.getMessage()+" Exception");
        }
        finally{

        }

        //Method 2
        try{
            HandleException(n);
        }
        catch(Exception e){
            System.out.println(e.getMessage()+" through function");
        }
        finally{
            System.out.println("End");
        }
        scan.close();
     
       
    }
}
