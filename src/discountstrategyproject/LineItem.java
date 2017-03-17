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
        return data.findProduct(prodId, data);
    }
    
    //create a method to get all of the data for the receipt
       public final String getLineItemInfo(){
//        String data = product.getProdId() + "          ";//printf
//        data += product.getProdName() + "          ";//printf;
//        data += product.getProdCost() + "          ";// use printf;
//        data += qty + "          "; // use printf
//        data += getSubTotal() + "           ";
//        data += product.getDiscount().getDiscountAmount(product.getProdCost(),qty) + "\n";
          String data = String.format("%-8s%12s$%7.2f  %3d  $%7.2f  $%7.2f \n", product.getProdId(), product.getProdName(), product.getProdCost(), qty,
        getSubTotal(), product.getDiscount().getDiscountAmount(product.getProdCost(),qty));      
        return data;
    }


    public final Product getProduct() {
        return product;
    }

    public final void setProduct(Product product) {
        this.product = product;
    }

    public final int getQty() {
        return qty;
    }

    public final void setQty(int qty) {
        this.qty = qty;
    }
    public final double getSubTotal(){
        double subTotal = product.getProdCost() * qty;
        return subTotal;
    }
    
}
