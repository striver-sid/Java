public class InstanceVM {


    //Instance variables
    private String name;
    protected String course;
    public String department ;

    InstanceVM(String name,String course,String department){
        this.name=name;
        this.course=course;
        this.department=department;
    }
    @Override
    public String toString(){
        return name +" "+course+" "+department+" ";
    }

    public String getName(){
        return this.name;
    }
   
    public String getDepartment(){
        return this.department;
    }

}

class MainClass{
    public static void main(String[] args) {
        InstanceVM obj=new InstanceVM("Sidddarth","MSc" ,"SS" );
        InstanceVM obj2=new InstanceVM("Prassanna", "MSC","AIML");
        System.out.println(obj);
        System.out.println(obj2);
    }
}
