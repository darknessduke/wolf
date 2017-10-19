package com.jerry.designPattern.memento;

public class Test {  
	  
    public static void main(String[] args) {  
          
        Original origi = new Original("egg");  
  
        Storage storage = new Storage(origi.createMemento());  
  
        System.out.println("Initial status:" + origi.getValue());  
        origi.setValue("niu");  
        System.out.println("Revised status：" + origi.getValue());  
  
        origi.restoreMemento(storage.getMemento());  
        System.out.println("Restore status:" + origi.getValue());  
    }  
}
