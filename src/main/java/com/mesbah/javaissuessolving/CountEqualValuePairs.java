package com.mesbah.javaissuessolving;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountEqualValuePairs {
    int countEqualValuePairss(){
        int[] arr=new int[30];
        int[] arr1=new int[30];
        Map<Integer, Integer> mp = new HashMap<Integer, Integer>();
        Map<Integer, Integer> map =new HashMap<Integer, Integer>();
        System.out.println("Num of elements in arrays:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter elements of first array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            mp.put(arr[i], mp.getOrDefault(arr[i], 0) + 1);
        }
        System.out.println("Enter elements of second array:");
        for (int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
            map.put(arr1[i], map.getOrDefault(arr1[i], 0) + 1);
        }
        int numOfEqualValuePairs=0;
        for (int i=0;i<n;i++){
            if (map.containsKey(arr[i])) {
                numOfEqualValuePairs+=map.get(arr[i]);
            }
        }
        return numOfEqualValuePairs;

    }
}
