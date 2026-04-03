package Constructor;

public class PrivateConstructor {
    String name;
    int age;

    private PrivateConstructor(String name,int age){
        this.name=name;
        this.age=age;
    }
    @Override
    public String toString(){
        return name+" "+age;
    }

    
}
