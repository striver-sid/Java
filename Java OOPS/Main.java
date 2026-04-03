class Constructors {
    String a;

    Constructors(){
       //Default constructor
    }
    Constructors(String a){
        
        this.a=a;//parameterized constructor
        System.out.print("Parameterized Constructor ");
    }
    Constructors(Constructors copy){
        this.a=copy.a;//copy constructor

        System.out.print("Copy Constructor ");
    }
    @Override
    public String toString(){
        return a;
    }
    
    
}
class Main{
    public static void main(String[] args) {
        //default value
        Constructors obj=new Constructors();
        //parameterized 
        Constructors obj1=new Constructors("Siddarth");
        //Copy
        Constructors obj2=new Constructors(obj1);

        System.out.println(obj);
        System.out.println(obj1);
        System.out.println(obj2);
        System.gc();

    }
}
