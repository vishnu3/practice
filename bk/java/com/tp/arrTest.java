package com.tp;

public class arrTest {
    public static void main(String[] args) {
    /*Write program to return index of 2 elements having sum equal to target.*/
        int[] arr = {2, 3,5,7,9,11};
        int target = 12;

        int[] res = new int[10];

        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    res = new int[2];
                  res[0] = i;
                  res[1] = j;
                  break;
                }
            }
            if(res.length==2){
               break;
            }
        }

        System.out.println(res[0]+" "+res[1]);


    }
}
