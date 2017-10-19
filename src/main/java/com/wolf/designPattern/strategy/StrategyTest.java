package com.wolf.designPattern.strategy;

public class StrategyTest {  
	  
    public static void main(String[] args) {  
        String exp = "2+8";  
        ICalculator cal = (ICalculator) new Plus();  
        int result = cal.calculate(exp);  
        System.out.println(result);  
    }  
}  
