public class StringRefresh{
    public static void main(String[] args) {
        String a="Sid";
        String b="Sid";
        String c=new String("Sid");
        String d=new String("Sid");
    
        CheckStrings(a, b);
        CheckStrings(c, d);
    }
    public static void CheckStrings(String a,String b){
        if(a==b){
            System.out.println("Same memory and value");
        }
         else if(a.equals(b)){
             System.out.println("Same value but different memory");
         }
    }

    public static void StringBuilderClass(String s){
        StringBuilder con=new StringBuilder(s);
        
    }
}