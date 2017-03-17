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
public class CheckoutTerminal {
    private Receipt receipt;
    private ReceiptFormattingStrategy format;

    public CheckoutTerminal(){
        format = new ReceiptFormattingStrategy();
    }
    
    public final void startTransaction(String custId, RetailDataStorage data){
        receipt = new Receipt(custId, data);
    }
    
    public final void addProductToTransaction(String prodId, int qty, RetailDataStorage data){
        receipt.addItemToReceipt(prodId, qty, data);
    }
    
    public final String endTransaction(){
        // create a output strategy.
        return format.storeGreeting() + receipt.receiptItems();
    }

    
    
}
