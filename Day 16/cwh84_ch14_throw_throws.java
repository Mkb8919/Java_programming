package com.company;

  class NegativeRadiusException extends Exception {
        @Override
        public String toString() {
            return "Radius cannot be negative!";
        }

        @Override
        public String getMessage() {
            return "Radius cannot be negative!";
        }
     }

    public class  cwh_84_throw_throws {

        public static double area(int r) throws NegativeRadiusException {
            if (r<0){
                throw new NegativeRadiusException();
            }
            double result = Math.PI * r * r;
            return result;

        }

        public static int divide(int a, int b) throws ArithmeticException {
//     made by Mohit
            int result = a / b;
            return result;
        }

        public static void main(String[] args) {
//     shivam - uses divide function created by mohit
            try {
//                int c = divide(6, 0);
//                System.out.println(c);
                double ar = area(6);
                System.out.println(ar);
            }
            catch (Exception e) {
                System.out.println("Exception");

            }

        }
    }

