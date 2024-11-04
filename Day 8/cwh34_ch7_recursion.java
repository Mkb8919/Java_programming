package com.company;

public class cwh34_ch7_recursion {
   //  factorial(0) = 1
        // factorial(n) = n * n-1 *....1
        // factorial(5) = 5 * 4 * 3 * 2 * 1 = 120
       // factorial(n) = n * factorial(n-1)

    /*
    static int factorial(int n){
        if(n==0 || n==1 ){
            return 1;
        }
        else{
            return n*factorial(n-1);
        }
    }
    static int factorial_iterative(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            int product = 1;
            for (int i = 1; i <= n; i++) { // 1 to n
                product *= i;
            }
            return product ;
        }
    }
        public static void main(String[] args){
            int x = 6 ;
            System.out.println(" the value of factorial x is :" + factorial(x));
            System.out.println(" the value of factorial x is:" + factorial_iterative(x));
     */

            // quick quiz fibonacci series without using recursion
    /*
                public static void main(String args[])
                {
                    int n1=0,n2=1,n3,i,count=10;
                    System.out.print(n1+" "+n2);//printing 0 and 1

                    for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed
                    {
                        n3=n1+n2;
                        System.out.print(" "+n3);
                        n1=n2;
                        n2=n3;
                    }
     */

    // fibonacci series using recursion
    static int n1=0,n2=1,n3=0;
    static void printFibonacci(int count){
        if(count>0){
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(" "+n3);
            printFibonacci(count-1);
        }
    }
    public static void main(String args[]){
        int count=10;
        System.out.print(n1+" "+n2);//printing 0 and 1
        printFibonacci(count-2);//n-2 because 2 numbers are already printed
    }
}







