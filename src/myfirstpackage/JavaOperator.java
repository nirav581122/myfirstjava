package myfirstpackage;

public class JavaOperator {
    public static void main(String[] args) {
        JavaOperator jo = new JavaOperator();
        jo.addition();
        jo.subtraction();
        int a =10;
        System.out.println(a);
        System.out.println(++a);
        System.out.println(a);

    }
    public void addition(){
        int a= 10;
        int b=20;
        int c=a+b;
        System.out.println(c);


        }
    public void subtraction(){
        int a=20,b=30;
        int c=a-b;
        System.out.println(c);

    }

}
