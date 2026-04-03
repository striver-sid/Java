package String;

public class StringTheory {
    public static void main(String[] args) {
        String a="Sid";
        String b="Sid";
        System.out.println(System.identityHashCode(b));
        System.out.println(System.identityHashCode(a));

        String c=new String("Sid");
        c=new String("Sid");//can reinitialize but  change the character via index

        if (a==b){
            System.out.println("Same memory");//same memory and data
        }
        if(a.equals(b)){
            System.out.println("same data ");//same data but different memory
        }

        for(int i=0;i<c.length();i++){
            System.out.print(c.charAt(i));
           
        }
        System.out.println();
        String d=new String("Sid");
        System.out.println(System.identityHashCode(c));
        System.out.println(System.identityHashCode(d));
    }
}
