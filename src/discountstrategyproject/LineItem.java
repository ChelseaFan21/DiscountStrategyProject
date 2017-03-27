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
public class LineItem {
    private Product product;
    private int qty;
    
    public LineItem(String prodId, int qty, RetailDataStorage data){
        product = findProduct(prodId, data);
        this.setQty(qty);
    }
    
    public final Product findProduct(String prodId, RetailDataStorage data){
        if(prodId == null){
            throw new IllegalArgumentException("Product Id can't be null");
        }else if(data == null){
            throw new IllegalArgumentException("Database can't be null");
        }else{
        return data.findProduct(prodId, data);
        }
    }
    
    //create a method to get all of the data for the receipt
       public final String getLineItemInfo(){
//        String data = product.getProdId() + "    ";
//        data += product.getProdName() + "          ";
//        data += product.getProdCost() + "          ";
//        data += getQty() + "          ";
//        data += getSubTotal() + "           ";
//        data += product.getDiscount().getDiscountAmount(product.getProdCost(),qty) + "\n";
          String data = String.format("%-8s%12s$%7.2f  %3d  $%7.2f  $%7.2f \n", product.getProdId(), product.getProdName(), product.getProdCost(), qty,
        getSubTotal(), product.getDiscount().getDiscountAmount(product.getProdCost(),qty));      
        return data;
    }


    public final int getQty() {
        return qty;
    }

    public final void setQty(int qty) {
        if(qty < 1 || qty > 1000){
            throw new IllegalArgumentException("Quantity must be between 1 and 1000");
        }
        this.qty = qty;
    }
    public final double getSubTotal(){
        double subTotal = (product.getProdCost() * getQty());
        return subTotal;
    }
    public final double getDiscountTotal(){
        double discountTotal = 0.00;
        discountTotal = product.getDiscount().getDiscountAmount(product.getProdCost(),qty);
        return discountTotal;
    }
}
