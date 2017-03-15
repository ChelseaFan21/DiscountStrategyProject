/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategyproject;

import javax.swing.JOptionPane;

/**
 *
 * @author brandonstoiber
 */
public class GuiReceipt implements OutputReceiptStrategy{
    // use the receipt class means less work.
    public final void outputReceipt(String message){
        JOptionPane.showMessageDialog(null, message);
    }
}
