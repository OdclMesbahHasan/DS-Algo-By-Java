package com.mesbah.javaissuessolving;

import java.util.Scanner;

public class MaximumSubArraySum {
    Long maximumSubArraySum() {
        System.out.println("Enter the num of elements in array:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter the array elements:");
        int[] arr = new int[n];
        Long finalMaxSUm = -111111111111111111L;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Long maxSum = 0L;
        for (int i = 0; i < n; i++) {
            maxSum += arr[i];
            finalMaxSUm = Math.max(maxSum, finalMaxSUm);
            if(maxSum < 0) {
                maxSum = 0L;
            }
        }
        return finalMaxSUm;
    }
}
