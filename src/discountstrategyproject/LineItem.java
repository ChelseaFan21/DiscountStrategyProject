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
        return data.findProduct(prodId);
    }
    
    //create a method to get all of the data for the receipt
       public String getLineItemInfo(){
        String data = " ";
        
        data += product.getProdId() + "     ";
        data += product.getProdName() + "     ";
        data += product.getProdCost() + "     ";
        data += qty + "     ";
        // create a helper class for equations
        // price * quantity = subtotal
        data += product.getDiscount().getDiscountAmount(product.getProdCost(),qty);
        
        return data;
    }


    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
    
}
