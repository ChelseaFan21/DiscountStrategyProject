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
    
    public Receipt(String custId, RetailDataStorage data, ReceiptFormattingStrategy format){
        if(data == null){
            throw new IllegalArgumentException("Database needs to be able to be reached.");
        }else if(custId == null || custId.isEmpty()){
            customer = new Customer("" , "");
        }else{
        customer = findCustomer(custId, data);
        }
        lineItems = new LineItem[0];
    }
    
    public final Customer findCustomer(String custId, RetailDataStorage data){
        if(data == null){
        throw new IllegalArgumentException("Database must be able to be reached.");

        }
        return data.findCustomer(custId, data);
    }
     public final void addItemToReceipt(String prodId, int qty, RetailDataStorage data){
        if(prodId == null || data == null){
            throw new IllegalArgumentException("Product ID and database can't bee null.");
        }else{
        LineItem item = new LineItem (prodId, qty, data);
        addToArray(item);
        }
    }
        
    private void addToArray(LineItem item) {
        if(item == null){
            throw new IllegalArgumentException("Can't complete the array if item is null");
        }else{
        LineItem[] tempItems = new LineItem[lineItems.length + 1];
        System.arraycopy(lineItems, 0, tempItems, 0, lineItems.length);
        tempItems[lineItems.length] = item;
        lineItems = tempItems;
        tempItems = null;
        }
        }
    
    
    public final String receiptItems(ReceiptFormattingStrategy format){
      if(format == null){
          throw new IllegalArgumentException("Can't return a blank receipt");
      }
        return format.getFormattedReceipt(this);
    }
   
    public final LineItem[] getLineItems() {
        return lineItems;
    }

    public final void setLineItems(LineItem[] lineItems) {
        if(lineItems == null){
            throw new IllegalArgumentException("Array for line items can't be null, is it instantiated.");
        }
        this.lineItems = lineItems;
    }

    public final Customer getCustomer() {
        return customer;
    }

    public final void setCustomer(Customer customer) {
        if(customer == null){
            throw new IllegalArgumentException("Customer object needs to be proved, can't be null");
        }
        this.customer = customer;
    }

    public final RetailDataStorage getData() {
        return data;
    }

    public final void setData(RetailDataStorage data) {
        if(data == null){
            throw new IllegalArgumentException("Data must be provided.");
        }
        this.data = data;
    }
    
    public final double getNetTotal(){
        double netTotal = 0.00;
        for(LineItem item: lineItems){
            netTotal += item.getSubTotal();
        }
        return netTotal;
    }
    public final double getTotalSaved(){
        double totalSaved = 0.00;
        for(LineItem item: lineItems){
            totalSaved += item.getDiscountTotal();
        }
        return totalSaved;
    }
    public final double getGrandTotal(){
        double grandTotal = (getNetTotal() -  getTotalSaved());
        return grandTotal;
        
    }
    public final String getColumnHeaders(){
        String data = String.format("%-8s%-6s  %7s    %6s   %7s    %7s \n","Id", "Product", "Price", "Qty", "Subtotal","Discount" + "\n");
        data += "-----------------------------------------------------------\n";
        return data;
    }
    
}
