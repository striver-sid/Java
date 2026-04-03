interface I1{
    void start();
}
interface I2{
    void stop();
}

class MultipleInheritence implements I1,I2{
    @Override
    public void start(){
        System.out.println("start");
    }
    @Override
    public void stop(){
        System.out.println("stop");
    }
}
public class TestMultiple{
    public static void main(String[] args) {
        MultipleInheritence obj=new MultipleInheritence();
        obj.start();
        obj.stop();
    }
}