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
    private ReceiptFormattingStrategy format;
    
    public Receipt(String custId, RetailDataStorage data){
        customer = findCustomer(custId, data);
    }
    
    public final Customer findCustomer(String custId, RetailDataStorage data){
        return data.findCustomer(custId, data);
    }
     public final void addItemToReceipt(String prodId, int qty, RetailDataStorage data){
        LineItem item = new LineItem (prodId, qty, data);
        addToArray(item);
    }
        
    private void addToArray(LineItem item) {
        // needs validation
        if(item == null){
            throw new NullPointerException();
        }
        LineItem[] tempItems = new LineItem[lineItems.length + 1];
        System.arraycopy(lineItems, 0, tempItems, 0, lineItems.length);
        tempItems[lineItems.length] = item;
        lineItems = tempItems;
        tempItems = null;
        }
    
    //Pull the information from lineitem to populate the receipt data.
    public final String receiptItems(){
        String data = " ";
        data += format.storeGreeting();
        
        data += "Sold to: " + customer.getCustName() + "\n\n";
        
        data += format.printTitles();
        
        for(LineItem item : lineItems){
            data += item.getLineItemInfo();
        }
        return data;
    }
   
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
