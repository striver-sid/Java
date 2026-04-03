package String;

public class DefaultCosntructor {
    protected int x, y;
    public DefaultCosntructor(){

    }
    public DefaultCosntructor(int _x, int _y)
    {
        x = _x;
        y = _y;
    }
}
class Main{
    public static void main(String args[])
    {
        DefaultCosntructor p = new DefaultCosntructor();
        System.out.println("x = " + p.x + ", y = " + p.y);
    }
}