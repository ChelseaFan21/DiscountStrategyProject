package discountstrategyproject;



public class DetailReceiptFormat implements ReceiptFormattingStrategy{
   
    @Override
    public final String getFormattedReceipt(Receipt receipt){
        String data = "";
        
        data += "Thank you for shopping at Kohl's" + "\n";
       
        data += "Sold to: " + receipt.getCustomer().getCustName() + "\n";
        
        data += receipt.getColumnHeaders();
        
        for(LineItem item: receipt.getLineItems()){
            data += item.getLineItemInfo() + "\n";
        }
        data += "\n";
        data += "Net Total: " + receipt.getNetTotal() + "\n";
        data += "Discount Total: " + receipt.getTotalSaved() + "\n";
        data += "Grand Total: " + receipt.getGrandTotal() + "\n";
        
        return data;
    }
}
