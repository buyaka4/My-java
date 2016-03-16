package com.company;

public class Main {

    public static void main(String[] args) {
        int x = 5;
        x = 5;
        x = 7;
        System.out.println("x");
        int y = 4;
        y = x + 3;
        x = x + 3;
        x += 3;
        x += 1;
        x++;
        ++x;
        x = 9;
        y = ++x;

        int z = 5; //4 bytes -2.1B to 2.1B
        byte b = 7; //1 byte  -128 to 127
        short s = 10;//2 bytes - 65,536    -32,768 to 32,767
        long l = 123L;     //  8 bytes, -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        float f = 124.5f;  // 4 bytes
        // 234659873405968703000000000
        // 300
        double d = 123.34536; //8 bytes
        char c = '@'; //1 byte
        boolean bool = false;
        x = 2 - 3;
        x = 2 * 3;
        x = 2 / 3;
        x = 2 % 3; // = 2;
        x = 3 % 2; // = 1;
        x = 2 + 3 + 4;
        x = (2 + 3) * y;

        bool = x < 6;
        bool = x > 6;
        bool = x <= 6;
        bool = x == 12;
        bool = x != 12;
        bool = x < 16 && x >= 3;
        bool = x < 16 || x >= 3;
        bool = !(x < 16);
        bool = !bool;
        bool = (x < y || x < 16) && x > -1;
        boolean flag1 = true;
        boolean flag2 = true;
        boolean flag3 = !(flag1 || flag2);
        //2 * (3 + 4) = 2 * 3 + 2 * 4
        flag3 = !flag1 || !flag2;
        //flag3 != flag1 || !flag2;
        //flag3 = flag1 != flag1
        flag3 = flag1 && flag2;
        flag3 = !flag1 && !flag2;
        flag3 = !(flag1 && flag2);
        flag3 = !flag1 || !flag2;
        if(x == 16 && y != 12 || bool){

        }
        if(!bool) {
            System.out.println("bool is true");
            System.out.println("another line");
        }

        int age = 20;

        if(age >= 18 && age < 21){
            System.out.println("you may drink alcohol but with your parents");
        }
        if(age < 18){
            System.out.println("you may not drink alcohol");
        }
        if(age >= 21){
            System.out.println("you may freely drink alcohol");
        }

        if(age < 18)
            System.out.println("you may not drink alcohol");
        else if(age < 21)
            System.out.println("you may drink alcohol with your parents");
        else
            System.out.println("you may freely drink alcohol");

        x /= 5;


        while(age < 18){
            System.out.println("age is less than 18");
            age++;
        }

        for(int i=0;i<10;i++){
            System.out.println("boker tov");
        }

        int result = sum(4, 3);
        System.out.println(result);
        System.out.println(3 + 1 + "4");




    }


    public static int sum(int x, int y){
        return x + y;
    }



    //in the following exercises, you may not use any mathematical
    //operator, other than +. Furthermore, you may assume that the
    //parameters are non-negative integers.
    //write the following functions:
    //1. distance, will return the distance between two integers
    //i.e: distance(5,8) returns 3.
    //2. write a function that will return the product of two integers
    //i.e product(5,8) return 40.
    //3. write a function that takes two parameters, x and y,
    // and should return how many whole times y fits in x.
    //i.e quotient(7,3) returns 2, quotient(3,7) returns 0.
    //4. write a function that takes two parameters, x and y,
    // and should return the remainder of x divided by y.
    // i.e remainder(7,3) returns 1, remainder(3,7) returns 3.

    public static int distance(int x, int y){
        int small = x;
        int large = y;
        if(x>y){
            small = y;
            large = x;
        }
        int result = 0;
        while(small+result<large)
            result++;

        return result;
    }

}
