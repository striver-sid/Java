
class Son{
    void show(){
        System.out.println("Siddarth");
    }
}
class Mummy extends Son{
    @Override
    void show(){
        System.out.println("Mummy");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Son obj=new Son();
        Mummy obj2=new Mummy();

        obj.show();
        obj2.show();
    }
}
