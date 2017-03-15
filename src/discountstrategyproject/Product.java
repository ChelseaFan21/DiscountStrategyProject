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
        return prodId;
    }

    public void setProdId(String prodId) {
        this.prodId = prodId;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public double getProdCost() {
        return prodCost;
    }

    public void setProdCost(double prodCost) {
        this.prodCost = prodCost;
    }

    public DiscountStrategy getDiscount() {
        return discount;
    }

    public void setDiscount(DiscountStrategy discount) {
        this.discount = discount;
    }
    public double getDiscountAmount(int qty){
        return discount.getDiscountAmount(prodCost, qty);
    }
    
    
}
