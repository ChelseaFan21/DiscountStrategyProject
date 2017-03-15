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
public class ConsoleOutputReceipt implements OutputReceiptStrategy{
    
    @Override
    public final void outputReceipt(String message){
        System.out.println(message);
    }
    
}
