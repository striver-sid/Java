package Singleton;

public class Main {
    public static void main(String[] args) {
        Singleton obj=Singleton.getInstance();
        Singleton obj2=Singleton.getInstance();
        obj.setData("Siddarth",19);

        /*same memory reference changes the parameters and 
        updates it to the latest parameters*/
        obj2.setData("Manoj", 19);
        System.out.println(obj);
        System.out.println(obj2);
    }
    
}
