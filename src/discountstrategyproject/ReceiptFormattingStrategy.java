/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategyproject;

/**
 *
 * @author brandonstoiber
 */
// make this an interface
public class ReceiptFormattingStrategy {
// public abstract storeGreeting();
// public abstract printTitles();
    
    
// add this as a subclass.
    public final String storeGreeting(){
   
       return "Welcome to Kohl's";
    }
//    public final void printLine(){
//        
//    }

    public String getFormattedData(Receipt receipt){
        data += "";
        data += storeGreeting() + "\n";
        data += receipt.getLineItems();
        data
        
    }
    
}
