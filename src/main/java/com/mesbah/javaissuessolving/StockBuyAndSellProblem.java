package com.mesbah.javaissuessolving;

import java.util.Scanner;

public class StockBuyAndSellProblem {
    int maximumProfitThatCanBeAchieved(){
        System.out.println("Enter the stock size:");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int min = 100000000;
        int max = 0, max1 =-1000000000;
        for(int i=0;i<n;i++){
            min = Math.min(min,arr[i]);
            max1 = Math.max(max1, arr[i]- min);
//            max=Math.max(max,arr[i]);
//            min=Math.min(min,arr[i]);
//            max1=Math.max(max-min,max1);
        }
        return max1;
    }
}
