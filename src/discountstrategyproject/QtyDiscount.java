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
public class QtyDiscount implements DiscountStrategy {
    private double discount;
    private int minQty;
    
    public QtyDiscount(double discount, int minQty){
        this.setDiscount(discount);
        this.setMinQty(minQty);
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public int getMinQty() {
        return minQty;
    }

    public void setMinQty(int minQty) {
        this.minQty = minQty;
    }
    
    public final double getDiscountAmount(double cost, int qty){
        discount = 0;
        if(qty >= minQty){
           discount = cost * qty * discount;
        }
        return discount;
    }
    
    
}
