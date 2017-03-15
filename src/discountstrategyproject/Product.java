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

    public String getProdId() {
        if(prodId == null || prodId.length() == 0){
            throw new IllegalArgumentException("Please enter a valid product id");
        }
        return prodId;
    }

    public void setProdId(String prodId) {
        this.prodId = prodId;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        if(prodName == null || prodName.isEmpty()){
            throw new IllegalArgumentException("Please enter a valid product name.");
        }
        this.prodName = prodName;
    }

    public double getProdCost() {
        return prodCost;
    }

    public void setProdCost(double prodCost) {
        // validate for double
//        if(prodCost)
        this.prodCost = prodCost;
    }

    public DiscountStrategy getDiscount() {
        return discount;
    }

    public void setDiscount(DiscountStrategy discount) {
        this.discount = discount;
    }
    // grabs the discount amount from the discount strategy class. 
    public double getDiscountAmount(int qty){
        return discount.getDiscountAmount(prodCost, qty);
    }
    
    
}
