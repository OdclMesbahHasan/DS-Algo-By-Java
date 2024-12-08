/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mesbah.javaissuessolving;

/**
 *
 * @author WALTON
 */
public interface securityInterface {
    default String defaultMethod(){
        return "Security Interface Default method";
    }
    int getAdditionResult(int a, int b);
    
}
