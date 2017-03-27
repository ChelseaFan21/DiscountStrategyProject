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
class Product {
    private String prodId;
    private String prodName;
    private double prodCost;
    private DiscountStrategy discount;
    
    public Product(String prodId, String prodName, double prodCost, DiscountStrategy discount){
        this.setProdId(prodId);
        this.setProdName(prodName);
        this.setProdCost(prodCost);
        this.setDiscount(discount);
    }

    public final String getProdId() {
        if(prodId == null || prodId.length() == 0){
            throw new IllegalArgumentException("Please enter a valid product id");
        }
        return prodId;
    }

    public final void setProdId(String prodId) {
        if(prodId == null){
            throw new IllegalArgumentException("Product Id can't be null");
        }
        this.prodId = prodId;
    }

    public final String getProdName() {
        return prodName;
    }

    public final void setProdName(String prodName) {
        if(prodName == null || prodName == ""){
            throw new IllegalArgumentException("Please enter a valid product name.");
        }
        this.prodName = prodName;
    }

    public final double getProdCost() {
        return prodCost;
    }

    public final void setProdCost(double prodCost) {
      if(prodCost < 0 || prodCost > 1000000){
          throw new IllegalArgumentException("Please enter valid price between 0 and 1000000");
      }
        this.prodCost = prodCost;
    }

    public final DiscountStrategy getDiscount() {
        
        return discount;
    }

    public final void setDiscount(DiscountStrategy discount) {
          if(discount == null){
            throw new IllegalArgumentException("Discount Strategy can't be null.  ");
        }
        this.discount = discount;
    }
    // grabs the discount amount from the discount strategy class. 
    public final double getDiscountAmount(int qty){
        if(qty < 1 || qty > 1000){
            throw new IllegalArgumentException("Quantity must be between 1 and 1000");
        }
        return discount.getDiscountAmount(prodCost, qty);
    }

    
    
}
