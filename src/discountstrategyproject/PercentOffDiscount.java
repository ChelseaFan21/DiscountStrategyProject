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
public class PercentOffDiscount implements DiscountStrategy{
    private double discount;
    
    public PercentOffDiscount(double discount){
       this.discount = discount;
    }

//    @Override
//    public final double getDiscount() {
//        return discount;
//    }
//
//    @Override
//    public final void setDiscount(double discount) {
//        this.discount = discount;
//    }
    @Override
    public final double getDiscountAmount(double cost, int qty){
        // validation
        return (cost * qty * discount);
        
    }
    
    
    
}
