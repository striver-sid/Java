package Singleton;

public class Singleton {
    private static Singleton instance;
    private String name;
    private int age;

    private Singleton(){

    }

    public static Singleton getInstance(){
        if(instance==null){
            instance=new Singleton();
        }
        return instance;
    }

    public void setData(String name,int age){
        this.name=name;
        this.age=age;
    }

    @Override
    public String toString(){
        return name+" "+age;
    }

}
