package com.company;

public class Main {

    //Nested Classes
    //Classes defined within a Class
    //Four types:
    //1. Static nested class
    //2. Inner class
    //3. Local inner class
    //4. Anonymous inner class
    public static void main(String[] args) {
        //Static:
        //Outer.Inner myObject = new Outer.Inner();
        //myObject.foo();

        //Inner:
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();


        //Local inner:
        SomeClass someObject = new SomeClass();

        //Dog d = someObject.someFunction();
        //d.bark();
        //System.out.println(red);
        Color c = ColorReporter.getDescriptiveColor(new Color((byte)127, (byte)-128, (byte)-128));
        //System.out.println(c);

        SomeOtherClass someOtherObject = new SomeOtherClass();
        Dog d = someOtherObject.someFunction();
        d.bark();

    }
}
//1. Static nested class:
/*
class Outer{
    static class Inner{
        public void foo(){
            System.out.println("foo");
        }
    }

}
*/
//2. Inner class:
class Outer{
    class Inner{
        public void foo(){
            System.out.println("foo");
        }
    }

}
//3. Local inner class
class Dog{
    void bark(){
        System.out.println("waf waf");
    }
}


class SomeClass{
    Dog someFunction(){

        class Poodle extends Dog{

            @Override
            void bark() {
                System.out.println("bff.. bfff..");
            }

            //this method can never be invoked outside of "someFunction()";
            void goToSleep(){
                System.out.println("going to sleep");
            }
        }
        Poodle p = new Poodle();
        p.goToSleep();
        return p;
    }
}

class Color{
    byte r,g,b;

    public Color(byte r, byte g, byte b) {
        this.r = r;
        this.g = g;
        this.b = b;
    }
    public Color(){

    }

    @Override
    public String toString() {
        return "R:"+r+",G:"+g+",B:"+b;
    }
}

class ColorReporter{
    static Color getDescriptiveColor(Color color){
        class DescriptiveColor extends Color{
            @Override
            public String toString() {
                return "the color " + color + " is a pretty color";
            }
        }
        return new DescriptiveColor();
    }
}

//4. Anonymous inner class
class SomeOtherClass{
    Dog someFunction(){
        return new Dog(){
            @Override
            void bark() {
                System.out.println("bff.. bfff..");
                goToSleep();
            }

            void goToSleep(){
                System.out.println("going to sleep");
            }
        };
    }
}








