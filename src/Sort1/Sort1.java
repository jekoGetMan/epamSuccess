package Sort1;

import java.util.Scanner;

public class Sort1 {
    public static void main(String[] args){
    //bubble
//    int []arr = {1,2,3,4,5};
      int []arr = new int[10];

      //input date
      for(int i=0; i < arr.length; i++){
          arr[i] = (int) Math.round(Math.random() * 10);
          System.out.print(arr[i] + "");
      }

      //algorithm
      for(int i = 1; i < arr.length; i++){
          for(int j = arr.length-1; j >= i; j--){
              if(arr[j-1] > arr[j]){
                  int tmp = arr[j-1];
                  arr[j-1] = arr[j];
                  arr[j] = tmp;
              }
          }
      }

      //output date
      System.out.println();
      for(int i=0; i<arr.length; i++){
          System.out.print(arr[i] + "");
      }


    }
}

