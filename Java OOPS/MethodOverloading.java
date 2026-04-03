class Animal{
    Animal(){}
    public void sound(String sound){
        System.out.println(sound);
    }
    public void sound(String name,String sound){
        System.out.println(name+ " "+sound);
    } 
  
}


public class MethodOverloading extends Animal {
    public static void main(String[] args) {
        Animal obj=new Animal();
        obj.sound("Roars");
        obj.sound("Lion","Roars");
    }
}
