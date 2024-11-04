package com.company;

    interface Bicycle1 {
            int a = 45;
            void applyBrakes(int decrement);
            void speedup(int increment);
        }

        interface HornBicycle {
            void blowHornk3g();
            void blowHornmhn();
        }

        class AvonCycle1 implements Bicycle1, HornBicycle {
            void blowHorn() {
                System.out.println("pee pee poo poo");
            }
            public void applyBrakes(int decrement) {
                System.out.println("Applying brakes");
            }
            public void speedup(int increment) {
                System.out.println("Applying speed up");
            }
            public void blowHornk3g() {
                System.out.println("Dhoom machale Dhoom machale pee pee");
            }
            public void blowHornmhn() {
                System.out.println("pee pee pooo pooo");
            }
        }

        public class cwh_55_abstractclasses_vs_interfaces {
            public static void main(String[] args) {

               AvonCycle1 cyclemohit = new AvonCycle1();
                cyclemohit.applyBrakes(4);
//        you can create properties in interfaces
                System.out.println(cyclemohit.a);

//        you cannot modify the properties in interfaces as they are final
//        cyclemohit.a = 454;
//        System.out.println(cyclemohit.a);

                cyclemohit.blowHornk3g();
                cyclemohit.blowHornmhn();
            }
        }

