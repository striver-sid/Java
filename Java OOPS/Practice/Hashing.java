import java.util.HashMap;
import java.util.Map;

public class Hashing {
    public static void main(String[] args) {
        Map<Integer,String> m=new HashMap<>();  
        // m.put(1,"Sid");
        


        // if(m.getOrDefault(5,null)==null){
        //     m.put(5,"Sam");
        // }
        // System.out.println(m);

        for(int i=0;i<10;i++){
            if(m.getOrDefault(i,null)==null){
                m.put(i,Integer.toString(i+1));
            }
        }
        m.put(2,"Sid");
       
        m.put(23,"Ram");
        m.put(54,"Do");
        m.put(30,"jfvjwe");
        System.out.println(m);
    }
}
