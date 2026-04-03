import java.util.Scanner;

public class reversenumber {
    public static void main(String[] args) {
        Integer a=1000;
        
        
        while(a>0){
            int b=a%10;
            System.out.print(b);
            a=a/10;
        }
        System.out.println();
        String s="manoj";
        Scanner scan=new Scanner(System.in);
        s=scan.nextLine();
        StringBuilder ns=new StringBuilder();
        for(int i=0;i<s.length();i++){
            ns.append(s.charAt(i));

        }

        System.out.println(ns.toString());
        for(int i=s.length()-1;i>=0;i--){
            ns.append(s.charAt(i));
        }
        System.out.println(ns.toString());
        scan.close();

    }
}
