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
public class receiptFormattingStrategy {
    
    public final String storeGreeting(){
       String greeting = "";
        
       greeting += "Thank you for shopping at Kohl's. \n\n";
       return greeting;
    }
//    public final void printLine(){
//        
//    }
    public final String printTitles(){
       String titles = "";
    titles += "Product Id          + Product Name +           + Price +          + Sub Total +          Discount\n";
    titles += "----------------------------------------------------------------------------------------------------\n";
    
    return titles;
    }
    
    
}
