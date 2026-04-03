import java.util.Scanner;

public class Leaders {
    public static void main(String[] args) {
        int[] numbers=new int[5];
        
        Scanner scan=new Scanner(System.in);
        for(int i=0;i<numbers.length;i++){
            numbers[i]=scan.nextInt();
        }
        PrintLeadersOptimal(numbers);
        PrintLeadersBruteForce(numbers);
        scan.close();
        

    }   
    public static void PrintLeadersOptimal(int[] numbers){
        int max=Integer.MIN_VALUE;
        for(int i=numbers.length-1;i>=0;i--){
            if(numbers[i]>max){

                max=numbers[i];
                System.out.print(" "+numbers[i]);
            }
        }
    }

    public static void PrintLeadersBruteForce(int[] numbers){
        
        for(int i=0;i<numbers.length;i++){
            boolean isLeader=true;
            for(int j=i+1;j<numbers.length;j++){
                if(numbers[i]<numbers[j]){
                    isLeader=false;
                    break;
                }
            }
            if(isLeader){
                System.out.print(numbers[i]);
            }
        }
    }
}
