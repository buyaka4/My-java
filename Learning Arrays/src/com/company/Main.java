package com.company;

public class Main {


    //1. write a function that takes an array of integers as a parameter,
    //   and returns the largest number.
    //   largestNumber(int[] nums){.....}
    //2. ..... and reverses the order of the numbers in the array.
    //3. position of array B within array A ?
    //    {2,67,2,4,8,5,2,9,77}    {2,4,8}
    //4. write a function that takes an array of integers as a parameter,
    //   and sorts the numbers in an ascending order.



    public static void main(String[] args) {


        //int[] numbers = {19, 20, 15, 3};
        /*
        int[] numbers = null;


        try {
            System.out.println(numbers[3]);
            System.out.println("after...");
        }catch (Exception ex){
            System.out.println("ooops.. houston we have a problem: " + ex);
        }
        */
        /*
        try{
            int max = largestNumber(numbers);
            System.out.println("the largest number is: " + max);
        }catch (Exception ex){
            System.out.println("error: " + ex);
        }
        */
        //System.out.println("end of program");

        //int[][] y = {{6,14}, {5,89,10}, {}};

        /*int[] arr = {4, -8, 100, 30};

        //0 1 2 3 4 5 6 7 8 9 a b c d e f  10 11 12 13 14 15 16 17 18 19 1a 1b 1c 1d 1e 1f 20

        //System.out.println(arr[4]);
        //System.out.println("hello");
        arr[0] = -78;
        arr[1]++;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

*/

        boolean[][] canvas = new boolean[50][80];
        clearCanvas(canvas);
        drawRectangle(10,5,30,10,canvas);
        drawRectangle(13,8,30,10,canvas);
        printCanvas(canvas);
    }


    public static int largestNumber(int[] numbers) throws Exception{
        if(numbers == null){
            throw new Exception("null pointer exception");
        }
        if(numbers.length == 0){
            throw new Exception("empty set");
        }
        int result = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if(numbers[i]>result)
                result = numbers[i];
        }
        return result;
    }

    //{4, 8, 15, 1, 9}

    public static void reverseArray(int[] numbers){
        int temp;
        for (int i = 0; i < numbers.length / 2; i++) {
            temp = numbers[i];
            numbers[i] = numbers[numbers.length - 1 - i];
            numbers[numbers.length - 1 - i] = temp;
        }
    }


    public static int arraySearch(int[] arr1, int[] arr2){
        for (int i = 0; i <= arr1.length - arr2.length; i++) {
            if(arr1[i] == arr2[0]){
                boolean f = true;
                for (int j = 1; j < arr2.length; j++) {
                    if(arr1[i+j] != arr2[j]){
                        f = false;
                        break;
                    }
                }
                if(f){
                    return i;
                }
            }
        }

        return -1;
    }


    public static int sumOfNumbers(int[] numbers){
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
    }

    public static void sortArray(int[] numbers){
        boolean isSorted = false;
        int compareUpTo = numbers.length - 1;
        while(!isSorted){
            isSorted = true;
            for (int i = 0; i < compareUpTo; i++) {
                if(numbers[i] > numbers[i+1]){
                    int temp = numbers[i];
                    numbers[i] = numbers[i+1];
                    numbers[i+1] = temp;
                    isSorted = false;
                }
            }
            compareUpTo--;
        }
    }

    public static void clearCanvas(boolean[][] canvas){
        for (int i = 0; i < canvas.length; i++) {
            for (int j = 0; j < canvas[i].length; j++) {
                canvas[i][j] = false;
            }
        }
    }

    public static void drawRectangle(int x, int y, int width, int height, boolean[][] canvas){
        for (int i = x; i < x + width; i++) {
            canvas[y][i] = true;
            canvas[y+height][i] = true;
        }
        for (int i = y; i <= y + height; i++) {
            canvas[i][x] = true;
            canvas[i][x+width] = true;
        }
    }

    public static void printCanvas(boolean[][] canvas){
        for (int i = 0; i < canvas.length; i++) {
            for (int j = 0; j < canvas[i].length; j++) {
                System.out.print(canvas[i][j] ? "*" : " ");
            }
            System.out.println();
        }
    }
}
