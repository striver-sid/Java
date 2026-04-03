

class MultilevelInheritence {
    protected String name1;
    MultilevelInheritence(String name1){
        this.name1=name1;
    }
    @Override
    public String toString(){
        return name1;
    }
}

class One extends MultilevelInheritence{
    protected String name2;
    One(String name1,String name2){
        super(name1);
        this.name2=name2;
    }
    @Override
    public String toString(){
        return name1+" "+name2;
    }

}
class Two extends One{
    protected String name3;
    Two(String name1,String name2,String name3){
        super(name1,name2);
        this.name3=name3;
    }
    @Override
    public String toString(){
        return name1+" "+name2+" "+name3;
    }
}
public class TestMultilevel{
    public static void main(String[] args) {
        Two obj1=new Two("Siddarth","anush","Manoj");
        One obj2=new One("Siddarth","anush");
        MultilevelInheritence obj3=new MultilevelInheritence("Siddarth");
        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj3);

    }
}
