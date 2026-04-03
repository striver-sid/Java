package String;

public class StringFunctions {
    public static void main(String[] args) {
        String a="Sid";
        String b="sId";

        //print length
        System.out.println("Length : "+a.length());
        //chatAt
        System.out.println("Character access via index : "+ a.charAt(1));
        //toUpperCase
        System.out.println("Upper case "+a.toUpperCase());
        System.out.println(a);
        System.out.println("Lower case "+b.toLowerCase());
        System.out.println(b);
        System.out.print("case insensitive : ");
        System.out.println(b.equalsIgnoreCase(a));
        System.out.print("case sensitive : ");
        System.out.println(b.equals(a));
    }
}
