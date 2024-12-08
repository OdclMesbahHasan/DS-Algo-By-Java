/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mesbah.javaissuessolving;

/**
 *
 * @author WALTON
 */
public class waltonImplementation  implements odclWalton{

    @Override
    public String normalMethod() {
        return "OverRided normalMethod";
    }

    @Override
    public int abc() {
        return 121111111;
    }
    
    @Override
    public String defaultMethod(){
        return "default method from implementation";
    }
    
    
    void method(){
        System.out.println("methodddddddddddddddddddddddddddd");
    }
    
}
