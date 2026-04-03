package Constructor;

public class ProtectedConstructor {
    private String name;
    private int age;
    
    // Protected constructor
    protected ProtectedConstructor(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString(){
        return name+" "+age;
    }
}
