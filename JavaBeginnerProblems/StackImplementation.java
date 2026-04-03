public class StackImplementation{
    int[] stack;
    int capacity;
    int top=-1;

    StackImplementation(int capacity){
        this.capacity=capacity;
        this.stack=new int[capacity];
    }
    public  boolean push(int value){
        if(top==capacity-1){
            return false;  
        }
        stack[++top]=value;
        return true;
    }
    public int pop(){
        if(top==-1){
            System.out.println("Stack is empty");
            return -1;
        }
        return stack[top--];
        
    }

    public int peek(){
        if(top==-1){
            System.out.println("Stack is empty");
            return -1;
        }
        return stack[top];
    }
    public static void main(String[] args) {
        StackImplementation st=new StackImplementation(3);
        for(int i=1;i<=3;i++){
            System.out.println( st.push(i));
        }

        for(int i=0;i<=3;i++){
            System.out.println(st.pop()); 
        }
        
    }
}