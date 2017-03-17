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
public class StartUp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CheckoutTerminal newTerminal = new CheckoutTerminal();
        RetailDataStorage storage1 = new MemoryAccess();
        OutputReceiptStrategy output1 = new ConsoleOutputReceipt();
        OutputReceiptStrategy output2 = new GuiReceipt();

        newTerminal.startTransaction(" ", storage1);
        newTerminal.addProductToTransaction("A101", 2, storage1);
        newTerminal.addProductToTransaction("C222", 1, storage1);
        
        output1.outputReceipt(newTerminal.endTransaction());
        //output2.outputReceipt(newTerminal.endTransaction());
    }

}
