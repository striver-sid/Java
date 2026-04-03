package Constructor;

public class Main extends ProtectedConstructor{
    //Passing the paremeters to the protected constructor
    Main(String name,int age){
        super(name,age);
    }
    public static void main(String[] args) {
        PublicConstructor obj=new PublicConstructor("Siddarth", 5);
        System.out.println(obj);
    
    }
}
