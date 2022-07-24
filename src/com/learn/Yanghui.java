package com.learn;

import java.util.Scanner;

/**
 * Date: 7/5/22
 *
 * @author hehao
 */
public class Yanghui {
    public static void main(String[] args) {
        int n=10;
        int[][] yh=new int[n][n];
        for(int i=0;i<yh.length;i++){
            for(int j=0;j<=i;j++){
                if(j==0||j==i){
                    yh[i][j]=1;
                }else{
                    yh[i][j]=yh[i-1][j-1]+yh[i-1][j];
                }
            }
        }for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++) {
                if (j == 0) {
                    System.out.print(yh[i][j]);
                } else {
                    System.out.print(" " + yh[i][j]);
                }
            }
            System.out.println();
        }
    }
}
