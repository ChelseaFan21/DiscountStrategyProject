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
    private OutputReceiptStrategy gui;
    private OutputReceiptStrategy console;

    public CheckoutTerminal(OutputReceiptStrategy gui, OutputReceiptStrategy console, ReceiptFormattingStrategy format){
        this.setGui(gui);
        this.setConsole(console);
        this.format = format;
    }
    
    public final void startTransaction(String custId, RetailDataStorage data){
        receipt = new Receipt(custId, data, format);
    }
    
    public final void addProductToTransaction(String prodId, int qty, RetailDataStorage data){
        receipt.addItemToReceipt(prodId, qty, data);
    }
    
    public final void  endTransaction(){
        // create a output strategy.
        gui.outputReceipt(receipt.receiptItems(format));
        console.outputReceipt(receipt.receiptItems(format));
    }

    public OutputReceiptStrategy getGui() {
        return gui;
    }

    public void setGui(OutputReceiptStrategy gui) {
        if(gui == null){
            throw new IllegalArgumentException("Output is mandatory");
        }
        this.gui = gui;
    }

    public OutputReceiptStrategy getConsole() {
        return console;
    }

    public void setConsole(OutputReceiptStrategy console) {
        if(console == null){
            throw new IllegalArgumentException("Output is mandatory");
        }
        this.console = console;
    }

   
    
    

    
    
}
