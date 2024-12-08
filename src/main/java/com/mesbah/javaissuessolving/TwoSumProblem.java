/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mesbah.javaissuessolving;

import java.util.Scanner;

/**
 *
 * @author WALTON
 */
public class TwoSumProblem {
    boolean ifTwoSumExists(){
        Scanner scanner = new Scanner(System.in);
        int i,target,k,l,m,j;
        System.out.println("Enter num of elements:");
        int n= scanner.nextInt();
        System.out.println("Enter the array elements:");
        int arr[] = new int[n];
        for (i=0;i<n;i++){
            arr[i] = scanner.nextInt();;
        }
        System.out.println("Enter target sum:");
        target = scanner.nextInt();
        boolean flag = false;
        for (i=0;i<n;i++){
            for(j=0;j<n;j++){
                if(i!=j && arr[i]+arr[j]==target){
                    flag = true;
                    break;
                }
            }
            if(flag == true){
                break;
            }
        }
        
       
        
        return flag;
    }
    
}
