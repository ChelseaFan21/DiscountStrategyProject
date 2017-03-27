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
public interface ReceiptFormattingStrategy {
    
     String getFormattedReceipt(Receipt receipt);
  
}
