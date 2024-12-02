public class lambda {
    interface a{
        void disp();
    }

    public static void main(String[] args) {

        /*a obj= new a(){
            public void disp(){
                System.out.println("hello");
            }
        }; */
        a obj=()->{
            System.out.println("ehe");
        };
    }
}
