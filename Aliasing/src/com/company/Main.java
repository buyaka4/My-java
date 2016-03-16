package com.company;

public class Main {

    public static void main(String[] args) {
        /*
        A a = new A();
        B b = new B(8);
        a.setB(b);
        b.x = 50;
        a.changeX(100, 12345);
        System.out.println(a);

        C c = new C();
        B b2 = c.getB();
        b2.x = 50;
        System.out.println(c);
        */
        String s = "my name is:\nElad";
        System.out.println(s);
    }
}

class A{
    private B b;

    public void setB(B b){
        this.b = new B(b);
    }

    public void changeX(int x, int password){
        if(b != null && password == 12345)
            b.x = x;
    }

    @Override
    public String toString() {
        return "the value of x is " + b.x;
    }
}

class B{
    int x;

    public B(int x){
        this.x = x;
    }

    public B(B other){
        this.x = other.x;
    }

}
class C{
    private B b;
    public C(){
        b = new B(8);
    }

    public B getB(){
        return new B(b);
    }

    @Override
    public String toString() {
        return "the value of x is " + b.x;
    }
}