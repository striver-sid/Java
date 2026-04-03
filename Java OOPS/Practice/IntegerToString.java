public class IntegerToString {
    public static void main(String[] args) {

        int intvalue=50;
        Integer IntegerValue=Integer.valueOf(intvalue);
        String convertedString=Integer.toString(IntegerValue);
        Integer convertedInt=Integer.parseInt(convertedString);
        System.out.println(convertedString+" "+ ((Object)convertedString).getClass().getSimpleName());
        System.out.println(convertedInt+" "+(convertedInt.getClass().getSimpleName()));
        
    }   
}
