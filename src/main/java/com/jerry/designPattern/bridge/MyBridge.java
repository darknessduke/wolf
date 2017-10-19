package com.jerry.designPattern.bridge;

public class MyBridge extends Bridge {  
    public void method(){  
        getSource().method();  
    }  
}  
