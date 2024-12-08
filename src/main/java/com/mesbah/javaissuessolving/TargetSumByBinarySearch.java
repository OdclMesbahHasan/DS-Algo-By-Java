/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mesbah.javaissuessolving;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author WALTON
 */


public class TargetSumByBinarySearch {
    boolean BinarySearch(int arr[], int n, int target, Map<Integer, Integer> mp){
        int low = 0, high = n-1, mid, i=0, j=n ;
        boolean flag = false;
        
        while (low<high) {            
            mid = (low+high)/2;
            int k=target - arr[mid];
            if(mp.containsKey(k)){
                flag = true;
                return flag;
            }
            if(k > arr[mid]){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        
        return false;
    }
    boolean ifTwoSumExists(){
        Scanner scanner = new Scanner(System.in);
        int i,target,k,l,m,j;
        System.out.println("Enter num of elements:");
        int n= scanner.nextInt();
        System.out.println("Enter the array elements:");
        int arr[] = new int[n];
        Map<Integer, Integer> mp = new HashMap<>();
        for (i=0;i<n;i++){
            arr[i] = scanner.nextInt();
            mp.put(arr[i], 1);
        }
        System.out.println("Enter target sum:");
        target = scanner.nextInt();
        boolean flag = false;
        flag = BinarySearch(arr, n, target, mp);
        return flag;
    }
}
