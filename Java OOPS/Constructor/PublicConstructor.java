package Constructor;

public class PublicConstructor {

    String name;
    int age;

    public PublicConstructor(String name,int age){
        this.name=name;
        this.age=age;
    }
    @Override
    public String toString(){
        return name+" "+age;
    }
}
