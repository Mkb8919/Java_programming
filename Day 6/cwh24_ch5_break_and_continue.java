package com.company;

public class cwh24_ch5_break_and_continue {
    public static void main(String[] args) {
        //break and continue using loops
        //     for (int i=0; i<5; i++ ) {
       //     System.out.println(i);
      //      System.out.println("java is great");
         //    if(i==2){
        //    System.out.println("ending the loop");
        //     break;
       //      }
        //      }

           //int i=0;
          // while(i<5) {
            //   System.out.println(i);
               //System.out.println("java is great");
               //if (i == 2) {
                  // System.out.println("ending the loop ");
                  // break;
               //}
              // i++;
           //}

               // int i=0;
               // do{
                  // System.out.println(i);
                  //System.out.println("java is great");
                 //if (i==2){
                 //  System.out.println("ending the loop ");
                  // break;
                //}
             //   i++;
              // }while(i<5);
                //System.out.println("loops ends here");


//continue statement
                //for (int i=0; i<5; i++){
                 // if (i == 2){
                // System.out.println("ending the loop");
                 //continue;
               //}
                 //  System.out.println(i);
                 // System.out.println("java is great ");
                //}

               // int i=0;
                // do{
                    // i++;
                // if(i==2){
               //  System.out.println("ending the loop");
                //continue;
               // }
                // System.out.println(i);
                //System.out.println("java is great");
                // } while(i<5);
                //System.out.println("loop ends here");


        int i=0;
       while(i<5){
           i++;
           if (i == 2) {
               System.out.println("ending the loop");
               continue;
            }
           System.out.println(i);
            System.out.println("java is great");
        }
        }
}
