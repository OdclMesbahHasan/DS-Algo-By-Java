/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mesbah.javaissuessolving;

/**
 *
 * @author WALTON
 */
public interface odclWalton {
    String normalMethod();
    int abc();
    
    default String defaultMethod(){
        return "Default method in interface";
    }
    
    static String staticMethod(){
        return "Static method in interface";
    }
    
}
