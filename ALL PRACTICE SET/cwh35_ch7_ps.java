package com.company;


public class cwh35_ch7_ps {

    static void multiplication(int n) {
        //for (int i=1; i<=10;i++){
        //  System.out.format(" %d X %d = %d\n",n, i, n*i);
        //}
    }

    static void pattern1(int n) {
        for (int i = 0; i < n; i++) { // rows
            for (int j = 0; j < i + 1; j++) { // column
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    // sum(n) = 1 + 2 + 3... + n
    // sum(n) = 1 + 2 + 3... + n-1 + n
    // sum(n) = sum(n-1) + n
    // sum(3) = 3 + sum(2)
    // sum(3) = 3 + 2 + sum(1)
    // sum(3) = 3 + 2 + 1
    static int sumRec(int n) {
        // base condition
        if (n == 1) {
            return 1;
        }
        return n + sumRec(n - 1);
    }

    static void pattern2(int n) {
        for (int i = n; i >= 1; i--) { // rows
            for (int j = 0; j < i - 1 + 1; j++) { // column
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    static int fib(int n) {
       /* if(n==1){
            return 0;
        }
        else if(n==2){
            return 1;
        }*/
        if (n == 1 || n == 2) {
            return n - 1;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }

    static void pattern1_rec(int n) {
        if (n > 0) {
            pattern1_rec(n - 1);
            for (int i = 0; i < n; i++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    // pattern1_rec(3)
    // pattern1_rec(2) + 3 times star and new line
    // pattern1_rec(2) + 2 times star and new line + 3 times and new line
    // pattern1_rec(2) + 1 times star and new line + 2 times and new line + 3 times and new line

    static float fahrenheit(float cel) {
        float fahren = (cel * (9 / 5.0f)) + 32.0f;
        return fahren;
    }

    static int nSum(int n) {
        int sum = 0;
        for (int i = 1; i < n + 1; i++) {
            sum += i;
        }
        return sum;
    }

    float average(float... arr) {
        float total = 0;
        for (float e : arr) {
            total += e;
        }
        float avg = total / arr.length;
        return avg;
    }

    static void pattern2_rec(int n) {
        if(n > 0) {
            for(int i=n; i>0; i--) {
                System.out.print(" * ");
            }
            System.out.println();
            pattern2_rec(n-1);
        }
    }

        public static void main(String [] args) {
            // problem 1
            // multiplication(7);

            // problem 2
            //pattern1(5);

            // problem 3
            // int c = sumRec(4);
            // System.out.println(c);

            // problem 4
            // pattern2(5);

            // problem 5
            // fibonacci series - 0,1,1,2,3,5,8,13,21,34
            //   int result = fib( 8);
            //   System.out.println(result);

            // problem 8
            //  pattern1_rec(5);

            // problem 9
            // float celcius = 15.7f;
            // System.out.println(celcius + " °C" + " -> " + fahrenheit(celcius) + " °F");

            // problem 10
            //  int num = 5;
            //  System.out.println("The sum of first " + num + "th natural numbers is: " + nSum(num));

            // problem 6
       /* Scanner sc = new Scanner(System.in);
        System.out.print("How many numbers you want to pass? : ");
        int a = sc.nextInt();
        float [] arr = new float[a];
        for(int i=0; i<a; i++) {
            System.out.print("Enter element " + (i+1) + ": ");
            float el = sc.nextFloat();
            arr[i] = el;
        }

        cwh_35_ps07 obj = new cwh_35_ps07 ();
        System.out.println("Average is: " + obj.average(arr));

        */

            // problem 7
            pattern2_rec(5);
        }
    }
