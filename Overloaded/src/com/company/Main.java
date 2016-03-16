package com.company;



public class Main {

    public static void main(String[] args) {
        /*
        byte b = 9;
        aMethod(b);
        aMethod(9);
        Integer i = 9;
        aMethod(i);
        aMethod("9");
        */
        //aMethod(9);

        //aMethod(9, 10);

        Number n = new Integer(8);


    }

    static void aMethod(long val1, int val2){System.out.println("long, int");}
    static void aMethod(int val1, long val2){System.out.println("int, long");}

    /*
    static void aMethod(byte val){System.out.println("byte");}
    static void aMethod(short val){System.out.println("short");}
    */
    /*
    static void aMethod(int val){System.out.println("int");}
    static void aMethod(short val){System.out.println("short");}
    static void aMethod(Object val){System.out.println("object");}
    static void aMethod(String val){System.out.println("String");}
    */
}
