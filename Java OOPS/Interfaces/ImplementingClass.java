package Interfaces;

public class ImplementingClass implements InterfaceClass1,InterfaceClass2{
    @Override
    public void first(){
        System.out.println("Implementing the first interface and overriding");
    }
    @Override
    public void second(){
        System.out.println("Implementing the second interface and overriding");
    }
    
}
