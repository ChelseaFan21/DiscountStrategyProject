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
        RetailDataStorage newStorage = new MemoryAccess();

        newTerminal.startTransaction(" ", newStorage);
        newTerminal.addProductToTransaction("A101", 1, newStorage);
        newTerminal.addProductToTransaction("C222", 1, newStorage);
        
        newTerminal.endTransaction();
    }

}
