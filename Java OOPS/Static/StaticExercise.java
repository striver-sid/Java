package Static;
public class StaticExercise {
    private static int age=20;

    public static void displayage(){
        System.out.println(age);
    }

    public static void main(String args[]){
        //direct access of the static variable
        System.out.println(age);
        //accessing the statci variable using the displayage() function
        displayage();
        //accessing the static variable of a class using the classname
        System.out.println(StaticExercise.age);
        
        //accessing the static variable of a class using the object of that  class
        //StaticExercise obj=new StaticExercise();
        //System.out.println(obj.age);

    }
}
