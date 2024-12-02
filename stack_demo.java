

public class stack_demo {
    public static void main(String[] args) {
        stack_demo s1= new stack_demo();
        s1.push(10);
        s1.push(11);


        // s1.push(13);
        System.out.println(s1.pop());
    }
    int n=10;
    int [] a= new int[n];
    int tos;
    public  stack_demo(){
        tos=n;
    }
    void push(int item){
        if(tos==0){
            System.out.println("full");
        }
        else {
            a[--tos] = item;
        }    }
    int pop(){
        if(tos==0){
            System.out.println("empty");
        }
        return a[n-1];
    }
}
