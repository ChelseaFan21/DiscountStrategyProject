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
public class DiscountStrategyProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CheckOutTerminal newTerminal = new CheckOutTerminal();
        RetailDataStorage newStorage = new MemoryAccess();

        newTerminal.startTransaction("101", newStorage);
        newTerminal.addProductToTransaction(prodId, 0, newStorage);
        newTerminal.addProductToTransaction(prodId, 0, newStorage);
    }

}