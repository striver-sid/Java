import java.util.ArrayList;
import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        int n;
        ArrayList<Integer> l=new ArrayList<>();
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the number : ");
        n=scan.nextInt();
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0){
                if(n%i==i){ 
                    System.out.print(i+" ");
                }
                else{
                    System.out.print(i+" ");
                    l.add(n/i);
                }
            }
        }
        for(int i=l.size()-1;i>=0;i--){
            System.out.print(l.get(i)+" ");
        }
        scan.close();
    }
}
