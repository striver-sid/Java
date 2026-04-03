package Constructor;
public class Main  extends ConstructorPractice{
    Main(String name,int age){
        super(name,age);
    }
    public static void main(String[] args) {
        ConstructorPractice cp=new ConstructorPractice("Siddarth", 20);
        System.out.println(cp);
        ConstructorPractice cpp=new Main("Manoj",20);
        System.out.println(cpp);
        
    }
}
