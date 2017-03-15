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
public class Receipt {
    private LineItem[] lineItems;
    private Customer customer;
    private RetailDataStorage data;
    
    public Receipt(String custId, RetailDataStorage data){
        customer = findCustomer(custId, data);
    }
    
    public final Customer findCustomer(String custId, RetailDataStorage data){
        return data.findCustomer(custId);
    }
        
    private final void addToArray(final LineItem item) {
        // needs validation
        LineItem[] tempItems = new LineItem[lineItems.length + 1];
        System.arraycopy(lineItems, 0, tempItems, 0, lineItems.length);
        tempItems[lineItems.length] = item;
        lineItems = tempItems;
        tempItems = null;
    }
    public final void addItemToReceipt(String prodId, int qty, RetailDataStorage data){
        LineItem item = new LineItem (prodId, qty, data);
        this.addToArray(item);
    }
    //Pull the information from lineitem to populate the receipt data.
//    public final String receiptItems(){
//        for(LineItem item : lineItems){
//            item.
//        }
//    }
   
    public final LineItem[] getLineItems() {
        return lineItems;
    }

    public final void setLineItems(LineItem[] lineItems) {
        this.lineItems = lineItems;
    }

    public final Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public RetailDataStorage getData() {
        return data;
    }

    public void setData(RetailDataStorage data) {
        this.data = data;
    }
    
}
