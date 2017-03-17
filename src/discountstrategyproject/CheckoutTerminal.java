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
    private OutputReceiptStrategy strategy;
    
    public CheckoutTerminal(){
    this.setStrategy(strategy);
}
    
    public final void startTransaction(String custId, RetailDataStorage data){
        receipt = new Receipt(custId, data);
    }
    
    public final void addProductToTransaction(String prodId, int qty, RetailDataStorage data){
        receipt.addItemToReceipt(prodId, qty, data);
    }
    
    public final void endTransaction(){
        // create a output strategy.
        strategy.outputReceipt(receipt.receiptItems());
    }

    public OutputReceiptStrategy getStrategy() {
        return strategy;
    }

    public void setStrategy(OutputReceiptStrategy strategy) {
        this.strategy = strategy;
    }
    
    
}
