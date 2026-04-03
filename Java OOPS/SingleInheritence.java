public class SingleInheritence {
    String name;
    int age;
    public SingleInheritence(String name ,int age){
        this.name=name;
        this.age=age;
    }
    @Override
    public String toString(){
        return name+" "+age;
    }
}
class Single extends SingleInheritence{
    public Single(String name,int age){
        super(name,age);
    }   
}
class Test{
    public static void main(String[] args) {
        Single obj=new Single("Siddarth",20);
        System.out.println(obj);
    }
}




































