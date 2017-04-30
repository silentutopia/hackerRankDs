package ds2;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[6][6];
        for(int row=0; row<6; row++){
            for(int col=0; col <6; col++){
                arr[row][col] = in.nextInt();
            }
        }
        int max, sum;
        //calculation loop     
        max = arr[0][0] +arr[1][0] +arr[2][0] +arr[1][1] +arr[0][2] +arr[1][2] +arr[2][2];
        
        for(int i=0; i+2<6; i++){
            for(int j=0; j+2<6; j++){
                sum = arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j+1]+arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];

                if(sum>max){
                    max = sum;
                }
            }
        }
        
        System.out.println(max);
    }
}