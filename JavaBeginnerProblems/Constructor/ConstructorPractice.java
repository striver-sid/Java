package Constructor;
public class ConstructorPractice{

    String name;
    int age;

    // private ConstructorPractice(String name,int  age){
    //     this.name=name;
    //     this.age=age;
    // }
    protected ConstructorPractice(String name,int age){
        this.name=name;
        this.age=age;
    }
    // public  ConstructorPractice(String name,int age){
    //     this.name=name;
    //     this.age=age;
    // }

    public ConstructorPractice(ConstructorPractice obj){
        this.name=obj.name;
        this.age=obj.age;
    }

    @Override
    public String toString(){
        return name+" "+age;
    }
    


}

