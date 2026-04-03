package ConstructorCall;
import Constructor.PrivateConstructor;
import Constructor.PublicConstructor;
import Constructor.ProtectedConstructor;
public class Main extends ProtectedConstructor {

    Main(String name,int age){
        super(name,age);
    }
    public static void main(String[] args) {
        //though in differenent package can be accessible as the constructor is public
        PublicConstructor obj=new PublicConstructor("Siddarth", 5);
        System.out.println(obj);
        //by default package private constructor gives error
        //PrivateConstructor obj2=new PrivateConstructor("Manoj",18);
        ProtectedConstructor proobj=new Main("protected Prass",19);
        System.out.println(proobj);
        
    }
}
