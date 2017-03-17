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
public class Customer {
    private String custId;
    private String custName;
    
    public Customer(String custId, String custName){
        this.setCustId(custId);
        this.setCustName(custName);
    }

    public final String getCustId() {
        return custId;
    }

    public final void setCustId(String custId) {
        if(custId == null || custId.length() == 0){
            throw new IllegalArgumentException("");
        }
        this.custId = custId;
    }

    public final String getCustName() {
        return custName;
    }

    public final void setCustName(String custName) {
        if(custName == null || custName.isEmpty()){
            throw new IllegalArgumentException("");
        }
        this.custName = custName;
    }
    public final String findCustomer(String custId, RetailDataStorage data){
        return findCustomer(custId, data);
    }
    
}
