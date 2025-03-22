package com.company;

public class cwh29_ch6_ps {
    public static void main(String[] args) {
        // practice problem 1
        /*
         float [] marks={45.7f,67.8f,63.4f, 99.2f,100.0f};
        float sum =0;
         for(float element:marks ){
         sum = sum + element;
         }
        System.out.println("The value of sum is "+sum);
         */

        // practice problem 2
        //  float [] marks={45.7f,67.8f,63.4f, 99.2f,100.0f};
        //  float num = 45.7f;
        // boolean isInArray = false;
        // for(float element:marks){
        // if(num==element){
        //isInArray = true;
        // break;
        //  }
        // }
        // if(isInArray){
        // System.out.println("This value is present in array");
        // }
        //  else{
        //  System.out.println("This value is not present in array");
        // }

        // practice problem 3
        // float [] marks={45.7f,67.8f,63.4f, 99.2f,100.0f};
        // float sum =0;
        //  for(float element:marks ){
        // sum = sum + element;
        // }
        //  System.out.println("The value of average marks  is "+sum/marks.length);

        // practice problem 4
        //int[][] mat1 = {{1, 2, 3},
        //     {4, 5, 6}};
        // int[][] mat2 = {{2, 6, 13},
        //  {3, 7, 1}};
        //int[][] result = {{0, 0, 0},
        //{0, 0, 0}};
        //for (int i = 0; i < mat1.length; i++) { // row number of times
        //  for (int j = 0; j < mat1[i].length; j++) { // co,lumn number of times
        //System.out.print(result[i][j]+ " ");
        //result [i][j]= mat1[i][j]+mat2[i][j];
        // }
        //  System.out.println(" ");
        // }

        // problem 5
// int a = Math.floorDiv(3,2);
        // System.out.println(a);
       /*
        int[] arr = {1, 2, 3, 4, 5, 6};
        int l = arr.length;
        int n = Math.floorDiv(l, 2);
        int temp;


        for (int i = 0; i < n; i++) {
            //swap a[i] and a[l-1-i]
            // a b temp
            // || |4| |3|
            temp = arr[i];
            arr[i] = arr[l - i - 1];
            arr[l - i - 1] = temp;
        }
        for (int element : arr){
            System.out.print(element + " ");
            }
        */
/*
      // problem 6
       int [] arr ={1,2100,3,455,5,34,67};
       int max =Integer.MIN_VALUE;
       for(int element : arr ){
           if (element>max){
               max = element;
           }
       }
        System.out.println(" the value of the maximum element in the array is :" + max);
 */
  /*
   // problem 7
   int [] arr = { -1,-4,-3,-455,-5,34,67} ;
   int min = Integer.MAX_VALUE;
   for(int element : arr){
       if (element<min){
           min = element ;
       }
   }
        System.out.println(" the value of the minimum element in the array is :"+ min);
*/
        // problem 7
        /*
        boolean isSorted = true;
  int [] arr = { 1,2,3,4,5,34,67} ; // {1,2100,3,455,34,67} not sorted
  for(int i=0;i<arr.length-1; i++){
      if (arr[i] > arr[i+1]) {
          isSorted = false;
          break;
       }
      }
      if(isSorted){
          System.out.println(" the array is sorted ");
      }
      else{
          System.out.println(" the array is  not sorted ");
      }

         */


    }
}


