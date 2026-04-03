public class HierarchicalInheritence {
    String name;
    int age;
    HierarchicalInheritence(String name,int age){
        this.name=name;
        this.age=age;
    }
    @Override
    public String toString(){
        return name+" "+age;
    }
}
class One extends HierarchicalInheritence{
    One(String name,int age){
        super(name,age);
    }
    @Override
    public String toString(){
        return name+" "+age;
    }
}
class Two  extends HierarchicalInheritence{
    Two(String name,int age){
        super(name,age);
    }
    @Override
    public String toString(){
        return name+" "+age;
    }
}
class HierarchicalTest{
    public static void main(String args[]){
        Two obj1=new Two("Siddarth",20);
        One obj2=new One("Anush",20) ;
        HierarchicalInheritence obj3=new HierarchicalInheritence("Manoj", 20);
        System.out.println(obj3);
        System.out.println(obj2);
        System.out.println(obj1);
    }
}